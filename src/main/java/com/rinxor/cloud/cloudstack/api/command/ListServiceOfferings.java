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
public class ListServiceOfferings implements Command {
     String command = "listServiceOfferings";
    public String getCommand() {
        return this.command;
    }
    
    public ListServiceOfferings() {
        
    }
    
    public String build() {
        String res = 
                "command=" + command +
                "&response=json";
                //"&sessionkey="+sessionkey;
        return res;
    }
}
