/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.cloud.db.mysql.cp;

/**
 *
 * @author jampajeen
 */
public class Packages {
    public Integer id;
    
    public double cpuspeed;
    public int cpucore;
    public int ram;
    public int storage;
    
    public double datatransfer;
    public double bandwidth;
    
    public int ip;
    public int domain;
    public int instance;
    public int snapshot;
    
    public String networktype; // PRIVATE, SHARED
    
    public String name;
    public String description;
}
