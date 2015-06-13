
package com.rinxor.cloud.conf;

/**
 *
 * @author jampajeen
 */
public class MasterCfg {
    //public static String SetCookie = "";
    private static MasterCfg instance = null;
    
    private RinxorCloudCfg rinxorcloudcfg;
    private CloudStackCfg cloudstackapicfg;
    
    private final String jobDoneString = "DONE";
    private final String jobPendingString = "PENDING";
    private final String jobErrorString = "ERROR";
    private final String notAvailableString = "N/A";
    
    /*
    * rinxorcloud each Node Unique Key
    */
    private String rinxorcloudNodeUnique;
    
    /*
    * User account type
    */
    private final String useraccounttype = "0";
    
    /*
    * Default error response
    */
    private final String defaultErrorResponse = "{ \"errorresponse\" : {\"uuidList\":[],\"errorcode\":-1,\"errortext\":\"Unknown\"} }";

    /*
    * log4j configuration path
    */
    private final String log4jConfigPath = "conf/log4j.xml";

    /*
    * Temp path
    */
    private final String temppath = "tmp/";
    private boolean isDeleteTempImage = true;
    
    /*
    * Uploaded path
    */
    private final String uploadDir = "upload/";
    
    /*
    * Indochina timezone
    */
    public final String timezone = "Asia/Bangkok";
    
    /*
    * default domain for test
    */
    private String rootDomainId;// = "4497c4da-3263-11e3-b4d8-000c29222fe0"; // ROOT
    
    private MasterCfg() {
        collectConfig();
    }

    public static synchronized MasterCfg getInstance() {
        if (instance == null) {
            instance = new MasterCfg();
        }
        return instance;
    }
    
    private void collectConfig() {
        cloudstackapicfg = new CloudStackCfg(CloudStackCfg.DEFAULT_CFG_FILE);
        rinxorcloudcfg = new RinxorCloudCfg(RinxorCloudCfg.DEFAULT_CFG_FILE);
        
        rinxorcloudNodeUnique = rinxorcloudcfg.getUniqueNodeId();
        rootDomainId = cloudstackapicfg.getRootDomainId();
    }

    public RinxorCloudCfg getRinxorcloudcfg() {
        return rinxorcloudcfg;
    }

    public CloudStackCfg getCloudstackapicfg() {
        return cloudstackapicfg;
    }

    public String getRinxorcloudNodeUnique() {
        return rinxorcloudNodeUnique;
    }

    public String getTemppath() {
        return temppath;
    }

    public String getUploadDir() {
        return uploadDir;
    }

    public boolean isIsDeleteTempImage() {
        return isDeleteTempImage;
    }
    
    public String getDefaultErrorResponse() {
        return defaultErrorResponse;
    }

    public String getUseraccounttype() {
        return useraccounttype;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getRootDomainId() {
        return rootDomainId;
    }
    
    public String getJobDoneString() {
        return jobDoneString;
    }

    public String getJobPendingString() {
        return jobPendingString;
    }

    public String getJobErrorString() {
        return jobErrorString;
    }

    public String getNotAvailableString() {
        return notAvailableString;
    }
    
    public String getLog4jConfigPath() {
        return log4jConfigPath;
    }
    
}
