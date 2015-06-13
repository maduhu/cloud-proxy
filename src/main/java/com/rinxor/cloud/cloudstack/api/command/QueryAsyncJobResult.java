/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.cloud.cloudstack.api.command;

/**
 *
 * @author TJ
 */
public class QueryAsyncJobResult implements Command {
    String command = "queryAsyncJobResult";
    String jobid;
    public String getCommand() {
        return this.command;
    }
    
    public QueryAsyncJobResult(String jobid) {
        this.jobid = jobid;
    }
    
    public String build() {
        String res = 
                "command=" + command +
                "&jobid="+ jobid +
                "&response=json";
                //"&sessionkey="+sessionkey;
        return res;
    }
}
