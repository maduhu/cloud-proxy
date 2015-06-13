/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.cloud.service.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jampajeen
 */
public class SigninSession {

    public static SigninSession getSigninSession(HttpServletRequest req) {
        HttpSession session= req.getSession(true);
    	return (SigninSession)session.getAttribute("signinsess");
    }
    
    public static void addSigninSession(HttpServletRequest req, SigninSession signinsess) {
        HttpSession session= req.getSession(true);
        session.setAttribute("signinsess", signinsess);
        session.setMaxInactiveInterval(15*60);
    }
    
    public static void removeSigninSession(HttpServletRequest req) {
        HttpSession session= req.getSession(true);
    	session.removeAttribute("signinsess");
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSessionkey() {
        return sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }
    
    private Integer id;
    
    private String sessionkey;
    private String cookie;
    
    private Integer accountid;
}
