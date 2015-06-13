/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rinxor.cloud.cloudstack.api;


import com.rinxor.cloud.conf.CloudStackCfg;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.Response;
import com.ning.http.client.providers.grizzly.GrizzlyAsyncHttpProvider;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author jampajeen
 */
public class CloudstackClient {

    /* Http client  */
    private AsyncHttpClient client;

    /* Cloudstack Configuration from file */
    private CloudStackCfg cfg;

    public CloudstackClient() {

        AsyncHttpClientConfig httpconfig = new AsyncHttpClientConfig.Builder().build();
        client = new AsyncHttpClient(new GrizzlyAsyncHttpProvider(httpconfig), httpconfig);
        cfg = new CloudStackCfg(CloudStackCfg.DEFAULT_CFG_FILE);
    }

    /*
     * tranlate Post to Get request before send to Cloudstack
     */
    public CloudstackResponse executeApiChangeJsonPostToGetRedirect(CloudstackRequest cloudstackRequest) {
        
        CloudstackResponse cloudstackResponse = new CloudstackResponse();
        try {
            JSONObject obj = new JSONObject(cloudstackRequest.getUrlCommand());
            String urlCommand = "response=json&";

            Iterator itr = obj.keys();
            while (itr.hasNext()) {
                Object element = itr.next();
                String key = (String) element;
                urlCommand += key + "=" + (String) obj.get(key) + "&";
            }
            System.out.println("request: " + urlCommand);
            
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(CloudstackAPI.buildApiRequestURL(cfg.getApiUrl(), urlCommand));

            getRequest.addHeader("Cookie", cloudstackRequest.getCookie());
            getRequest.addHeader("Referer", cloudstackRequest.getReferer());
            URI u = new URI(cfg.getApiUrl());
            getRequest.addHeader("Host", u.getHost() + ":" + u.getPort());

            HttpResponse response = httpClient.execute(getRequest);

            cloudstackResponse.setStatusCode(response.getStatusLine().getStatusCode());
            cloudstackResponse.setResponseBody(EntityUtils.toString(response.getEntity()));
            
            if(response.getFirstHeader("Set-Cookie") != null) {
                cloudstackResponse.setSetCookie(response.getFirstHeader("Set-Cookie").getValue());
            }
            
        } catch (JSONException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cloudstackResponse;
    }

    /*
    *  GET forward
    */
    public CloudstackResponse executeApiGetRedirect(CloudstackRequest cloudstackRequest) {

        CloudstackResponse cloudstackResponse = new CloudstackResponse();

        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(CloudstackAPI.buildApiRequestURL(cfg.getApiUrl(), cloudstackRequest.getUrlCommand()));
            
            // login do not require Cookie but we send.
            getRequest.addHeader("Cookie", cloudstackRequest.getCookie());
            getRequest.addHeader("Referer", cloudstackRequest.getReferer());
            URI u=new URI(cfg.getApiUrl());
            getRequest.addHeader("Host", u.getHost()+":"+u.getPort());

            HttpResponse response = httpClient.execute(getRequest);

            cloudstackResponse.setStatusCode(response.getStatusLine().getStatusCode());
            cloudstackResponse.setResponseBody(EntityUtils.toString(response.getEntity()));
            
            // login response we must send cookie back to client
            if(response.getFirstHeader("Set-Cookie") != null) {
                cloudstackResponse.setSetCookie(response.getFirstHeader("Set-Cookie").getValue());
            }

        } catch (ClientProtocolException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cloudstackResponse;
    }

    public HttpResponse executeApiGetWithAdminCredential(String urlCommand) {

        HttpResponse response = null;
        try {
            String url = CloudstackAPI.buildRequestURL(cfg.getApiUrl(), cfg.getApiKey(), cfg.getSecretKey(), urlCommand);
            
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(url);
            response = httpClient.execute(getRequest);
            
        } catch (IOException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        return response;
    }
    
    public CloudstackResponse executeConsoleGetRedirect(CloudstackRequest cloudstackRequest) {

        CloudstackResponse cloudstackResponse = new CloudstackResponse();

        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet getRequest = new HttpGet(CloudstackAPI.buildApiRequestURL(cfg.getConsoleUrl(), cloudstackRequest.getUrlCommand()));

            getRequest.addHeader("Cookie", cloudstackRequest.getCookie());
            getRequest.addHeader("Referer", cloudstackRequest.getReferer());
            URI u=new URI(cfg.getConsoleUrl());
            getRequest.addHeader("Host", u.getHost()+":"+u.getPort());

            HttpResponse response = httpClient.execute(getRequest);

            String responseString = new BasicResponseHandler().handleResponse(response);
            cloudstackResponse.setStatusCode(response.getStatusLine().getStatusCode());
            cloudstackResponse.setResponseBody(responseString);

        } catch (ClientProtocolException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(CloudstackClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cloudstackResponse;
    }
}
