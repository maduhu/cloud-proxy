
package com.rinxor.cloud;

import com.rinxor.cloud.conf.MasterCfg;
import com.rinxor.cloud.conf.RinxorCloudCfg;
import com.rinxor.cloud.conf.SpringCfg;
import com.rinxor.cloud.service.api.ClientResource;
import com.rinxor.cloud.service.api.DomainsResource;
import com.rinxor.cloud.service.api.ImagesResource;
import com.rinxor.cloud.service.api.VirtualMachinesResource;
import com.rinxor.cloud.service.api.VolumesResource;
import com.sun.grizzly.SSLConfig;
import com.sun.grizzly.http.embed.GrizzlyWebServer;
import com.sun.grizzly.http.servlet.ServletAdapter;
import com.sun.jersey.api.core.ClassNamesResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import java.io.IOException;
import javax.ws.rs.core.UriBuilderException;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author TJ
 */
public class Server {
    private static final String KEYSTORE_SERVER_FILE = "cert/keystore_server";
    private static final String KEYSTORE_SERVER_PWD = "asdfgh";
    private static final String TRUSTORE_SERVER_FILE = "cert/truststore_server";
    private static final String TRUSTORE_SERVER_PWD = "asdfgh";

    private GrizzlyWebServer webServer;
    private RinxorCloudCfg cfg;

    protected void startServer() {

        cfg = new RinxorCloudCfg(RinxorCloudCfg.DEFAULT_CFG_FILE);
        boolean sslEnabled = ("true").equals(cfg.getSsl());
        webServer = new GrizzlyWebServer(Integer.parseInt(cfg.getPort()), "web/cp/html", sslEnabled);

        // add Jersey resource servlet
        ServletAdapter jerseyAdapter = new ServletAdapter();
        jerseyAdapter.addInitParameter("com.sun.jersey.config.property.packages", "com.sun.jersey.samples.https_grizzly.resource;");
        jerseyAdapter.addInitParameter(ServletContainer.RESOURCE_CONFIG_CLASS, ClassNamesResourceConfig.class.getName());
        jerseyAdapter.addInitParameter(ClassNamesResourceConfig.PROPERTY_CLASSNAMES, 
                ClientResource.class.getName() + ";" + 
                        VirtualMachinesResource.class.getName() + ";" + 
                        VolumesResource.class.getName() + ";" +
                        DomainsResource.class.getName() + ";" +
                        ImagesResource.class.getName()
        );
        jerseyAdapter.setContextPath("/");
        jerseyAdapter.setHandleStaticResources(true);
        jerseyAdapter.setServletInstance(new ServletContainer());

        webServer.addGrizzlyAdapter(jerseyAdapter, new String[]{"/"});

        if (sslEnabled) {
            // Grizzly ssl configuration
            SSLConfig sslConfig = new SSLConfig();
            sslConfig.setClientMode(false);
            sslConfig.setNeedClientAuth(false);
            sslConfig.setKeyStoreFile(KEYSTORE_SERVER_FILE); // contains server keypair
            sslConfig.setKeyStorePass(KEYSTORE_SERVER_PWD);
            sslConfig.setTrustStoreFile(TRUSTORE_SERVER_FILE); // contains client certificate
            sslConfig.setTrustStorePass(TRUSTORE_SERVER_PWD);

            webServer.setSSLConfig(sslConfig);
        }

        try {
            System.out.println(String.format("Jersey app started with WADL at %sapplication.wadl", "http(s)://" + cfg.getHost()+":"+cfg.getPort() + "/" ) );
            webServer.start();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (UriBuilderException ex) {
            System.out.println(ex.getMessage());
        }
    }

    protected void stopServer() {
        webServer.stop();
    }
    
    public static void main(String[] args) throws InterruptedException, IOException {
        /*
        * log4j configuration
        */
        DOMConfigurator.configure(MasterCfg.getInstance().getLog4jConfigPath());
        
        /*
         * Init Spring Framework context
         */
        SpringCfg.getContext();
        
        /*
        * Start server
        */
        Server m = new Server();
        m.startServer();
    }
}
