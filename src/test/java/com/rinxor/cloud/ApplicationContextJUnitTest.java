package com.rinxor.cloud;

import com.rinxor.cloud.db.mysql.HibernateUtil;
import com.rinxor.cloud.service.mail.Mailer;
import com.rinxor.ns.PowerDnsClient;
import com.rinxor.utils.SshUtils;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jampajeen
 */
public class ApplicationContextJUnitTest extends TestCase {

    public ApplicationContextJUnitTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSpring() {
        /*
         * Test Spring Framework context
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
    }
    
    public void testHibernate() {
        /*
         * Test Hibernate Context
         */
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        session.getTransaction().commit();
        session.close();
    }
    
    public void testSSH() {
        String res = SshUtils.remoteCommandOneshot("localhost", 22, "root", "root", "ls");
        System.out.println("SSH: "+res);
    }
    
    public void testSendMail() {
        Mailer mm = (Mailer) (new ClassPathXmlApplicationContext("spring.cfg.xml")).getBean("mailMail");
        mm.sendMail("User", "This is text content");
        mm.sendMail("sender@example.com", "receiver@example.com", "Hello You", "Yeah!");
    }
    
    public void testPowerDnsClient() {
        PowerDnsClient client = new PowerDnsClient();
        client.test();
    }

}
