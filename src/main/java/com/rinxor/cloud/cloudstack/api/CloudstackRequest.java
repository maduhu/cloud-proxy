/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.cloud.cloudstack.api;

/**
 *
 * @author jampajeen
 */
public class CloudstackRequest {
    private String urlCommand;
    private String Cookie;
    private String Referer;
    private String Host;

    public String getUrlCommand() {
        return urlCommand;
    }

    public CloudstackRequest setUrlCommand(String urlCommand) {
        this.urlCommand = urlCommand;
        return this;
    }

    public String getCookie() {
        return Cookie;
    }

    public CloudstackRequest setCookie(String Cookie) {
        this.Cookie = Cookie;
        return this;
    }

    public String getReferer() {
        return Referer;
    }

    public CloudstackRequest setReferer(String Referer) {
        this.Referer = Referer;
        return this;
    }

    public String getHost() {
        return Host;
    }

    public CloudstackRequest setHost(String Host) {
        this.Host = Host;
        return this;
    }
    
    
}
