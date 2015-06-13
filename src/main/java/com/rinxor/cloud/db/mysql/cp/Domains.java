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
public class Domains {
    public Integer id;
    public String name;
    
    public String registra;
    public Date registerdate;
    
    public double buyprice;
    public double saleprice;
    
    public Integer accountid;
    public Integer packagesid;
}
