/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.cloud.service.api;

/**
 *
 * @author TJ
 */
public enum ErrorResponse {
    // Common 
    Error0000 ("0000", "Unknown"),
    
    // registerResult
    Error1001 ("1001", "Username is already exist"),
    Error1002 ("1002", "Unable to deploy virtual machine"),
    
    // register
    Error2001 ("2001", "Username is already exist"),
    Error2002 ("2002", "Email is already exist"),
    Error2003 ("2003", "Incorrect PlanId"),
    Error2004 ("2004", "Incorrect zoneId"),
    
    // vmResourceGraph
    Error3001 ("3001", "Usage information not found"),
    Error3002 ("3002", "Operation Timeout"),
    
    ;

    private final String code;
    private final String text;

    private ErrorResponse(String code, String text) {
        this.code = code;
        this.text = text;
    }
    
    @Override
    public String toString() {
        return code + ":" + text;
    }

    public String code() {
        return code;
    }
    public String text() {
        return text;
    }
}
