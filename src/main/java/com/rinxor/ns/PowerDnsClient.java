/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.ns;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author jampajeen
 */
public class PowerDnsClient {
    
    private Map<String,String> cookies;
    
    public void test() {
        login();
        listZone();
    }
    
    public void login() {
        try {
            Response response = Jsoup.connect("http://localhost/pdns/index.php")
                    .method(Connection.Method.GET)
                    .execute();
            
            Response pageResponse = Jsoup.connect("http://localhost/pdns/index.php")
                    .method(Connection.Method.POST)
                    .data("username", "admin")
                    .data("password", "****")
                    .data("authenticate", "Go")
                    .cookies(response.cookies())
                    .execute();
            
            if(pageResponse != null && pageResponse.body().contains("Welcome Administrator")) {
                System.out.println("Login Success: " + response.cookies().size());
                this.cookies = response.cookies();
                for(Entry entry : this.cookies.entrySet()) {
                System.out.println("" + entry.getKey() + ", "+ entry.getValue());
            }
            } else {
                System.out.println("Login Fail");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(PowerDnsClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listZone() {
        try {
            Document page = Jsoup.connect("http://localhost/pdns/list_zones.php")
                    .cookies(this.cookies)
                    .get();
            
            Elements form = page.body().select("form").select("a");
            
            for(Element el : form) {
                if(el.toString().contains("edit.php?id=")) {
                    System.out.println(el.toString());
                    System.out.println(el.select("img").attr("title").split(" ")[2]);
                }
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(PowerDnsClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void requestRoot() {
        try {
            Connection.Response response = Jsoup.connect("http://localhost/pdns/index.php")
                    .method(Connection.Method.GET)
                    .execute();
            
            Document page = Jsoup.connect("http://localhost/pdns/index.php")
                    .data("username", "admin")
                    .data("password", "****;")
                    .data("authenticate", "Go")
                    .cookies(response.cookies())
                    .post();
            
            if(page != null && page.toString().contains("Welcome Administrator")) {
                System.out.println("Login Success");
            } else {
                System.out.println("Login Fail");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(PowerDnsClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
