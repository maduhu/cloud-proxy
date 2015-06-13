
package com.rinxor.cloud.conf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jampajeen
 */
public class SpringCfg {
    private ApplicationContext context;
    
    private static SpringCfg instance = null;
    private static final String APPLICATION_CONTEXT_FILE = "spring.cfg.xml";

    private SpringCfg() {
        context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_FILE);
    }

    public static synchronized ApplicationContext getContext() {
        if (instance == null) {
            instance = new SpringCfg();
        }
        return instance.context;
    }

}
