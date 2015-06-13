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

/**
 *
 * @author TJ
 */
public class Notify {
    @Autowired
    Mailer mail;
    
    public Notify() { }
    
    public void send(String info) {
        System.out.println("Test send notify:\n"+info);
        mail.sendMail("sender@example.com",
                "receiver@example.com",
                "Notify",
                info);
    }
}
