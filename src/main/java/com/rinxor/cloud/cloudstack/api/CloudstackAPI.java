/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rinxor.cloud.cloudstack.api;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.postgresql.util.Base64;

/**
 *
 * @author jampajeen
 */
public class CloudstackAPI {

    /* Generate signature */
    private static String signature(String request, String secretKey) {

        try {

            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "HmacSHA1");
            mac.init(keySpec);
            mac.update(request.getBytes());
            byte[] encryptedBytes = mac.doFinal();

            return URLEncoder.encode(Base64.encodeBytes(encryptedBytes), "UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* Build completed API request URL with User API Keys */
    public static String buildRequestURL(String apiUrl, String apiKey, String secretKey, String command) {

        try {

            String encodedApiKey = URLEncoder.encode(apiKey.toLowerCase(), "UTF-8");

            List sortedParams = new ArrayList();
            sortedParams.add("apikey=" + encodedApiKey);
            StringTokenizer st = new StringTokenizer(command, "&");
            while (st.hasMoreTokens()) {
                String paramValue = st.nextToken().toLowerCase();
                String param = paramValue.substring(0, paramValue.indexOf("="));
                String value = URLEncoder.encode(paramValue.substring(paramValue.indexOf("=") + 1, paramValue.length()), "UTF-8");
                sortedParams.add(param + "=" + value);
            }

            Collections.sort(sortedParams);

            String sortedUrl = null;
            boolean first = true;
            for (Object param : sortedParams) {
                if (first) {
                    sortedUrl = (String) param;
                    first = false;
                } else {
                    sortedUrl = sortedUrl + "&" + param;
                }
            }
            String encodedSignature = signature(sortedUrl, secretKey);
            String finalUrl = apiUrl + "?" + command + "&apiKey=" + apiKey + "&signature=" + encodedSignature;

            return finalUrl;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    /* Redirect from Client (URL with User Credentials) */
    public static String buildApiRequestURL(String apiUrl, String commandWithSessionKey) {
        String finalUrl = apiUrl + "?" + commandWithSessionKey;
        return finalUrl;
    }
}
