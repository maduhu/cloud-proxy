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
public class ListNetworks implements Command {
    String command = "listNetworks";
    public String getCommand() {
        return this.command;
    }
    
    public ListNetworks() {
        
    }
    
    public String build() {
        String res = 
                "command=" + command +
                "&response=json";
                //"&sessionkey="+sessionkey;
        return res;
    }
}
