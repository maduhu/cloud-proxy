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
public class ListVirtualMachines implements Command{
    String command = "listVirtualMachines";
    String domainid;
    String isrecursive;
    //String sessionkey;
    public String getCommand() {
        return this.command;
    }
    public ListVirtualMachines(
            String domainid,
            String isrecursive
            //String sessionkey,
            ) {
        //this.sessionkey = sessionkey;
        this.domainid = domainid;
        this.isrecursive = isrecursive;
    }
    
    public String build() {
        String res = 
                "command="+command+
                "&domainid=" + domainid+
                "&isrecursive=" + isrecursive +
                "&response=json";
                //"&sessionkey="+sessionkey;
        
        return res;
    }
}
