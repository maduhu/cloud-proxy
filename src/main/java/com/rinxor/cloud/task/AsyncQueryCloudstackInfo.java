/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rinxor.cloud.task;

import java.util.Date;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author TJ
 */
@Service
public class AsyncQueryCloudstackInfo {

    @Scheduled(fixedRate = 100000)
    @Async
    public void process() {
        System.out.println("Invoking AsyncQueryCloudstackInfo at " + new Date());

        System.out.println("Finished AsyncQueryCloudstackInfo at " + new Date());
    }
}
