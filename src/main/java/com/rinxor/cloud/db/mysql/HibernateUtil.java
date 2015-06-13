
package com.rinxor.cloud.db.mysql;

import com.rinxor.cloud.conf.RinxorCloudCfg;
import com.rinxor.cloud.conf.MasterCfg;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author jampajeen
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            RinxorCloudCfg cp = MasterCfg.getInstance().getRinxorcloudcfg();
            Configuration cfg = new Configuration().configure();
            //cfg.addResource("hibernate.cfg.xml");
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://"+ cp.getMysqlhost() +":"+cp.getMysqlport()+"/rinxorcloud?zeroDateTimeBehavior=convertToNull");
            cfg.setProperty("hibernate.connection.username", cp.getMysqluser());
            cfg.setProperty("hibernate.connection.password", cp.getMysqlpassword());
            sessionFactory = cfg.buildSessionFactory(); 
        } catch (HibernateException ex) {
            // Log the exception.
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
