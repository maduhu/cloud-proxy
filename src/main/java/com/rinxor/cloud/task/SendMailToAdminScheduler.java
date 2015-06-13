/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rinxor.cloud.task;

import com.rinxor.cloud.service.mail.Mailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author jampajeen
 */
@Service
public class SendMailToAdminScheduler {
    @Autowired
    Mailer mail;
    
    // Every night at 1 AM
    @Scheduled(cron = "* * 2 * * ?")
    @Async
    public void process() {
        mail.sendMail("Cronjob",
                "receiver@example.com",
                "Testing Sendmail",
                "Send by Cronjob");
    }
}
