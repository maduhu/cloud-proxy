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
public class CreateAccount implements Command {
    String command = "createAccount";
    //String sessionkey;
    String account;
    String username;
    String password;
    String email;
    String firstname;
    String lastname;
    String domainid;
    String accounttype;
    public String getCommand() {
        return this.command;
    }
    public CreateAccount(
            //String sessionkey,
            String account,
            String username,
            String password,
            String email,
            String firstname,
            String lastname,
            String domainid,
            String accounttype
            ) {
        this.accounttype = accounttype;
        this.domainid = domainid;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        //this.sessionkey = sessionkey;
        this.username = username;
        this.account = account;
    }
    
    public String build() {
        String res = 
                "command="+command+"&account="+account+
                "&username="+username+
                "&password="+password+
                "&email="+email+
                "&firstname="+firstname+
                "&lastname="+lastname+
                "&domainid="+domainid+
                "&accounttype="+accounttype+
                "&response=json";
                //"&sessionkey="+sessionkey;
        
        return res;
    }
}
