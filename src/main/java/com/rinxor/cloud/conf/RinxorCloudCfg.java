
package com.rinxor.cloud.conf;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

/**
 *
 * @author jampajeen
 */
public class RinxorCloudCfg {
    
    public static final String DEFAULT_CFG_FILE = "conf/rinxorcloud.cfg.xml";
    
    private String host;
    private String port;
    private String uniqueNodeId;
    private String ssl;
    
    private String mysqlhost;
    private String mysqlport;
    private String mysqluser;
    private String mysqlpassword;
    
    public RinxorCloudCfg(String cfgFile) {
        load(cfgFile);
    }
    
    private void load(String cfgFilePath) {
        try {
            XMLConfiguration reader = new XMLConfiguration(cfgFilePath);
            
            host = reader.getString("rinxorcloud.bindAddress");
            port = reader.getString("rinxorcloud.bindPort");
            uniqueNodeId = reader.getString("rinxorcloud.uniqueNodeId");
            ssl = reader.getString("rinxorcloud.ssl");
            
            mysqlhost = reader.getString("rinxorcloud.mysqlhost");
            mysqlport = reader.getString("rinxorcloud.mysqlport");
            mysqluser = reader.getString("rinxorcloud.mysqluser");
            mysqlpassword = reader.getString("rinxorcloud.mysqlpassword");
            
        } catch (ConfigurationException ex) {
            Logger.getLogger(RinxorCloudCfg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUniqueNodeId() {
        return uniqueNodeId;
    }

    public void setUniqueNodeId(String uniqueNodeId) {
        this.uniqueNodeId = uniqueNodeId;
    }

    public String getSsl() {
        return ssl;
    }

    public void setSsl(String ssl) {
        this.ssl = ssl;
    }
    
    public String getMysqlhost() {
        return mysqlhost;
    }

    public void setMysqlhost(String mysqlhost) {
        this.mysqlhost = mysqlhost;
    }

    public String getMysqlport() {
        return mysqlport;
    }

    public void setMysqlport(String mysqlport) {
        this.mysqlport = mysqlport;
    }

    public String getMysqluser() {
        return mysqluser;
    }

    public void setMysqluser(String mysqluser) {
        this.mysqluser = mysqluser;
    }

    public String getMysqlpassword() {
        return mysqlpassword;
    }

    public void setMysqlpassword(String mysqlpassword) {
        this.mysqlpassword = mysqlpassword;
    }
    
}
