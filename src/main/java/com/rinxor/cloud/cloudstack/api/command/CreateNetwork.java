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
public class CreateNetwork implements Command {
    String sessionid;
    String command = "createNetwork";
    String networkOfferingId;
    String name;
    String displayText;
    String zoneId;
    String domainid;
    String account;
    
    public String getCommand() {
        return this.command;
    }
    
    public CreateNetwork(
            String networkOfferingId,
            String name,
            String displayText,
            String zoneId,
            String domainid,
            String account
            ) {
        this.networkOfferingId = networkOfferingId;
        this.name = name;
        this.displayText = displayText;
        this.zoneId = zoneId;
        this.domainid = domainid;
        this.account = account;
    }
    
    public String build() {
        String res = 
                "command=createNetwork&networkOfferingId="+networkOfferingId+
                "&name="+name+
                "&displayText="+displayText+
                "&zoneId="+zoneId+
                "&domainid="+domainid+
                "&account="+account+
                "&response=json";
                //"&sessionkey="+sessionkey;
        
        return res;
    }
}

//
//Request URL:http://192.168.1.3:8080/client/api?command=createNetwork&response=json&sessionkey=dYGl8ot0%2F6n0A%2F82BGHzTYWVhQA%3D&networkOfferingId=89571845-31b8-4471-8a05-fc359a8c6410&name=MyNetwork&displayText=MyNetwork&zoneId=d1c5d618-2d41-4842-a4d6-adab82dc8326&_=1379862325133
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

//command:createNetwork
//response:json
//sessionkey:dYGl8ot0/6n0A/82BGHzTYWVhQA=
//networkOfferingId:89571845-31b8-4471-8a05-fc359a8c6410
//name:MyNetwork
//displayText:MyNetwork
//zoneId:d1c5d618-2d41-4842-a4d6-adab82dc8326

//_:1379862325133
//Response Headersview source
//Content-Length:4199
//Content-Type:text/javascript;charset=UTF-8
//Date:Sun, 22 Sep 2013 15:05:22 GMT
//Server:Apache-Coyote/1.1
//
//
//
//{ "createnetworkresponse" :  { "network" : {"id":"7f33cf24-946f-48d5-89ce-933d2aa514c4","name":"MyNetwork","displaytext":"MyNetwork","broadcastdomaintype":"Vlan","traffictype":"Guest","gateway":"10.1.1.1","netmask":"255.255.255.0","cidr":"10.1.1.0/24","zoneid":"d1c5d618-2d41-4842-a4d6-adab82dc8326","zonename":"zone1","networkofferingid":"89571845-31b8-4471-8a05-fc359a8c6410","networkofferingname":"DefaultIsolatedNetworkOfferingWithSourceNatService","networkofferingdisplaytext":"Offering for Isolated networks with Source Nat service enabled","networkofferingavailability":"Required","issystem":false,"state":"Allocated","related":"7f33cf24-946f-48d5-89ce-933d2aa514c4","dns1":"8.8.8.8","type":"Isolated","acltype":"Account","account":"user2","domainid":"e1e93cfc-13a3-11e3-84bd-000c296ef2f9","domain":"ROOT","service":[{"name":"Dns","capability":[{"name":"AllowDnsSuffixModification","value":"true","canchooseservicecapability":false}]},{"name":"Firewall","capability":[{"name":"MultipleIps","value":"true","canchooseservicecapability":false},{"name":"SupportedEgressProtocols","value":"tcp,udp,icmp, all","canchooseservicecapability":false},{"name":"SupportedTrafficDirection","value":"ingress, egress","canchooseservicecapability":false},{"name":"TrafficStatistics","value":"per public ip","canchooseservicecapability":false},{"name":"SupportedProtocols","value":"tcp,udp,icmp","canchooseservicecapability":false}]},{"name":"UserData"},{"name":"Vpn","capability":[{"name":"SupportedVpnTypes","value":"pptp,l2tp,ipsec","canchooseservicecapability":false},{"name":"VpnTypes","value":"removeaccessvpn","canchooseservicecapability":false}]},{"name":"SourceNat","capability":[{"name":"RedundantRouter","value":"true","canchooseservicecapability":false},{"name":"SupportedSourceNatTypes","value":"peraccount","canchooseservicecapability":false}]},{"name":"Dhcp"},{"name":"StaticNat"},{"name":"PortForwarding"},{"name":"Lb","capability":[{"name":"SupportedLBIsolation","value":"dedicated","canchooseservicecapability":false},{"name":"SupportedLbAlgorithms","value":"roundrobin,leastconn,source","canchooseservicecapability":false},{"name":"SupportedStickinessMethods","value":"[{\"methodname\":\"LbCookie\",\"paramlist\":[{\"paramname\":\"cookie-name\",\"required\":false,\"isflag\":false,\"description\":\" \"},{\"paramname\":\"mode\",\"required\":false,\"isflag\":false,\"description\":\" \"},{\"paramname\":\"nocache\",\"required\":false,\"isflag\":true,\"description\":\" \"},{\"paramname\":\"indirect\",\"required\":false,\"isflag\":true,\"description\":\" \"},{\"paramname\":\"postonly\",\"required\":false,\"isflag\":true,\"description\":\" \"},{\"paramname\":\"domain\",\"required\":false,\"isflag\":false,\"description\":\" \"}],\"description\":\"This is loadbalancer cookie based stickiness method.\"},{\"methodname\":\"AppCookie\",\"paramlist\":[{\"paramname\":\"cookie-name\",\"required\":false,\"isflag\":false,\"description\":\" \"},{\"paramname\":\"length\",\"required\":false,\"isflag\":false,\"description\":\" \"},{\"paramname\":\"holdtime\",\"required\":false,\"isflag\":false,\"description\":\" \"},{\"paramname\":\"request-learn\",\"required\":false,\"isflag\":true,\"description\":\" \"},{\"paramname\":\"prefix\",\"required\":false,\"isflag\":true,\"description\":\" \"},{\"paramname\":\"mode\",\"required\":false,\"isflag\":false,\"description\":\" \"}],\"description\":\"This is App session based sticky method. Define session stickiness on an existing application cookie. It can be used only for a specific http traffic\"},{\"methodname\":\"SourceBased\",\"paramlist\":[{\"paramname\":\"tablesize\",\"required\":false,\"isflag\":false,\"description\":\" \"},{\"paramname\":\"expire\",\"required\":false,\"isflag\":false,\"description\":\" \"}],\"description\":\"This is source based Stickiness method, it can be used for any type of protocol.\"}]","canchooseservicecapability":false},{"name":"SupportedProtocols","value":"tcp, udp","canchooseservicecapability":false}]}],"networkdomain":"cs4cloud.internal","physicalnetworkid":"0315fffb-7767-412b-8f5c-9b02dfe1a759","restartrequired":false,"specifyipranges":false,"canusefordeploy":true,"ispersistent":false,"tags":[]} }  }
