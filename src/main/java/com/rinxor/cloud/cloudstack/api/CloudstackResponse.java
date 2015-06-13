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
public class CloudstackResponse {
    private String SetCookie;
    private String responseBody = "{ \"errorresponse\" : {\"uuidList\":[],\"errorcode\":-1,\"errortext\":\"Unknown\"} }";
    private int statusCode = 200;

    public String getSetCookie() {
        return SetCookie;
    }

    public void setSetCookie(String SetCookie) {
        this.SetCookie = SetCookie;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

}
