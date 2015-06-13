/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rinxor.cloud.cloudstack.api.command;

/**
 *
 * @author jampajeen
 */
public class ListUsageRecords implements Command {
    
            
    String command = "listUsageRecords";
    //String sessionkey;
    String enddate;
    String startdate;
    String account;
    String accountid;
    String domainid;
    String keyword;
    String page;
    String pagesize;
    String projectid;
    String type;
    
    public String getCommand() {
        return this.command;
    }
    public ListUsageRecords(
            //String sessionkey,
            String enddate,
            String startdate,
            String account
            ) {
        this.enddate = enddate;
        this.startdate = startdate;
        this.account = account;
    }
    
    public String build() {
        String res = 
                "command=listUsageRecords"+
                "&enddate="+enddate+
                "&startdate="+startdate+
                "&account="+account+
                "&response=json";
                //"&sessionkey="+sessionkey;
        
        return res;
    }
}
