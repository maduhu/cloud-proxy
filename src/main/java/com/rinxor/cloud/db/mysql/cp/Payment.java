/*
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
public class Payment {
    public Integer id;
    
    public Date paydate;
    
    public String paytype; // CREDITCARD, PAYPAL, CASHCARD
    public Integer invoiceid;
    
}
