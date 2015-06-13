/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.cloud.db.mysql.cp;

import java.sql.Date;

/**
 *
 * @author jampajeen
 */
public class Account {
    public Integer id;
    
    public String email;
    public String password;
    public String randompassword;
    
    public String firstname;
    public String lastname;
    
    public String street;
    public String city;
    public String province;
    public String postalcode;
    public String country;
    public String phonenumber;
    
    public Date subscribedate;
    
    public String zoneid;
    public String domainid;
}
