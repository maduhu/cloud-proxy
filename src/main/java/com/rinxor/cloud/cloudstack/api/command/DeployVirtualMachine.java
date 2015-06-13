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
public class DeployVirtualMachine implements Command {
    //private String sessionkey;
    private String command = "deployVirtualMachine";
    private String zoneId; //fix
    private String templateId;
    private String hypervisor; //user
    private String serviceOfferingId;
    private String diskOfferingId;
    private String networkIds;
    private String displayname; //user
    private String name; //user
    String domainid;
    String account;
    private String response = "json";
    
    public String getCommand() {
        return this.command;
    }
    
    public DeployVirtualMachine(
            //String sessionkey,
            String zoneId, 
            String templateId, 
            String hypervisor,
            String serviceOfferingId,
            String diskOfferingId,
            String networkIds,
            String displayname,
            String name,
            String domainid,
            String account
            ) {
        //this.sessionkey = sessionkey;
        this.zoneId = zoneId;
        this.templateId = templateId;
        this.hypervisor = hypervisor;
        this.serviceOfferingId = serviceOfferingId;
        this.diskOfferingId = diskOfferingId;
        this.networkIds = networkIds;
        this.displayname = displayname;
        this.name = name;
        this.domainid = domainid;
        this.account = account;
    }
    
    public String build() {
        String res = 
                "command=deployVirtualMachine&zoneId="+zoneId+
                "&templateId="+templateId+
                "&hypervisor="+hypervisor+
                "&serviceOfferingId="+serviceOfferingId+
                "&diskOfferingId="+diskOfferingId+
                "&networkIds="+networkIds+
                "&response=json"+
                "&domainid="+domainid+
                "&account="+account;
                //"&sessionkey="+sessionkey;
        
        return res;
    }
}


//
//Request URL:http://192.168.1.3:8080/client/api?command=deployVirtualMachine&zoneId=d1c5d618-2d41-4842-a4d6-adab82dc8326&templateId=9cc86d68-5ee1-412d-adb2-1320b59465eb&hypervisor=KVM&serviceOfferingId=5fd90885-6cc0-40c7-9c10-6ae71c782c1a&diskOfferingId=16461483-0a00-420a-b8b8-615ab08c50ce&networkIds=7f33cf24-946f-48d5-89ce-933d2aa514c4&response=json&sessionkey=dYGl8ot0%2F6n0A%2F82BGHzTYWVhQA%3D&_=1379862329991
//Request Method:GET
//Status Code:200 OK
//Request Headersview source
//Accept:application/json, text/javascript, */*; q=0.01
//Accept-Encoding:gzip,deflate,sdch
//Accept-Language:th,en-US;q=0.8,en;q=0.6
//Connection:keep-alive
//Cookie:JSESSIONID=882DC723494EDCCDE3C41E9D0C42779A; sessionKey=dYGl8ot0%252F6n0A%252F82BGHzTYWVhQA%253D; username=user2; account=user2; domainid=e1e93cfc-13a3-11e3-84bd-000c296ef2f9; role=0; timezoneoffset=7.0; timezone=Asia%2FBangkok; userfullname=user2%20user2; userid=5f3e1eee-d63b-4be6-b4e9-fd6cca11f533; capabilities=%5Bobject%20Object%5D; supportELB=false; userpublictemplateenabled=true; userProjectsEnabled=true
//Host:192.168.1.3:8080
//Referer:http://192.168.1.3:8080/client/
//User-Agent:Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.76 Safari/537.36
//X-Requested-With:XMLHttpRequest
//Query String Parametersview sourceview URL encoded
//command:deployVirtualMachine
//zoneId:d1c5d618-2d41-4842-a4d6-adab82dc8326
//templateId:9cc86d68-5ee1-412d-adb2-1320b59465eb
//hypervisor:KVM
//serviceOfferingId:5fd90885-6cc0-40c7-9c10-6ae71c782c1a
//diskOfferingId:16461483-0a00-420a-b8b8-615ab08c50ce
//networkIds:7f33cf24-946f-48d5-89ce-933d2aa514c4
//response:json
//sessionkey:dYGl8ot0/6n0A/82BGHzTYWVhQA=
//_:1379862329991
//Response Headersview source
//Content-Length:129
//Content-Type:text/javascript;charset=UTF-8
//Date:Sun, 22 Sep 2013 15:05:27 GMT
//Server:Apache-Coyote/1.1
//
//
//{ "deployvirtualmachineresponse" : {"id":"1906a8f0-e175-4259-b84b-3374122c2851","jobid":"cae6f01d-6e51-4822-8653-cd523ffd973a"} }
//
