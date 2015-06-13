/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rinxor.utils;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jampajeen
 */
public class Unique {
    /*
    * Generate unique value by combination of configable key and md5 hashing of system nano time
    */
    public static String genUnique(String additionConfigedUnique) throws NoSuchAlgorithmException {
        String res = additionConfigedUnique + "-" + CryptUtils.encodeMD5(System.nanoTime()+"");
        return res;
    }
    
    public static String genUnique() throws NoSuchAlgorithmException {
        String res = CryptUtils.encodeMD5(System.nanoTime()+"");
        return res;
    }
}
