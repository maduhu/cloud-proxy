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
public class DeleteAccount implements Command {

    String command = "deleteAccount";
    String id;
    
    public DeleteAccount(String id) {
        this.id = id;
    }
    
    public String getCommand() {
        return this.command;
    }
    
    public String build() {
        String res = 
                "command=" + command +
                "&response=json";
                //"&sessionkey="+sessionkey;
        return res;
    }
    
}
