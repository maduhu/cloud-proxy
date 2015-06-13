
package com.rinxor.cloud.conf;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

/**
 *
 * @author jampajeen
 */
public class CloudStackCfg {
    
    public static final String DEFAULT_CFG_FILE = "conf/rinxorcloud.cfg.xml";
    
    private String consoleUrl;
    private String apiUrl;
    private String apiKey;
    private String secretKey;
    private String rootDomainId;
    
    public CloudStackCfg(String cfgFile) {
        load(cfgFile);
    }
    
    private void load(String cfgFilePath) {
        try {
            XMLConfiguration reader = new XMLConfiguration(cfgFilePath);
            
            consoleUrl = reader.getString("cloudstack.consoleUrl");
            apiUrl = reader.getString("cloudstack.apiUrl");
            apiKey = reader.getString("cloudstack.apiKey");
            secretKey = reader.getString("cloudstack.secretKey");
            rootDomainId = reader.getString("cloudstack.rootDomainId");
            
        } catch (ConfigurationException ex) {
            Logger.getLogger(RinxorCloudCfg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getConsoleUrl() {
        return consoleUrl;
    }

    public void setConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
    }
    
    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRootDomainId() {
        return rootDomainId;
    }

    public void setRootDomainId(String rootDomainId) {
        this.rootDomainId = rootDomainId;
    }

}
