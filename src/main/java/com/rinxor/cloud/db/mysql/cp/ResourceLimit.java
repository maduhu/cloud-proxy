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
public class ResourceLimit {
    public static final String Instance = "0"; //0 - Instance. Number of instances a user can create.
    public static final String IP = "1"; //1 - IP. Number of public IP addresses a user can own. 
    public static final String Volume = "2"; //2 - Volume. Number of disk volumes a user can create.
    public static final String Snapshot = "3"; //3 - Snapshot. Number of snapshots a user can create.
    public static final String Template = "4"; //4 - Template. Number of templates that a user can register/create.

    public static final String Network = "6"; //6 - Network. Number of guest network a user can create.
    public static final String VPC = "7"; //7 - VPC. Number of VPC a user can create.
    public static final String CPU = "8"; //8 - CPU. Total number of CPU cores a user can use.
    public static final String Memory = "9"; //9 - Memory. Total Memory (in MB) a user can use.
    public static final String PrimaryStorage = "10"; //10 - PrimaryStorage. Total primary storage space (in GiB) a user can use.
    public static final String SecondaryStorage = "11"; //11 - SecondaryStorage.
}
