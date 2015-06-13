/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.cloud.service.api;

import com.rinxor.cloud.service.api.command.Register;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author jampajeen
 */

@Path("/cp/api/volumes")
public class VolumesResource {
    
    @GET
    @Produces("application/x-javascript")
    public Response get(@Context HttpHeaders headers, @Context UriInfo ui, @Context HttpServletRequest req) {
        
        String res = "{ \"error"+Register.class.getSimpleName().toLowerCase()+"response\" : {\"uuidList\":[],\"errorcode\":\""+ErrorResponse.Error0000.code()+"\",\"errortext\":\""+ErrorResponse.Error0000.text()+"\"} }";

    	SigninSession signinsess;
    	if ( (signinsess = SigninSession.getSigninSession(req) ) != null) {
            
    	} else {
    		System.out.println("Please login first! ");
    	}
        
        return Response.ok(res).build();
    }
    
    @GET
    @Path("/rootdisks")
    @Produces("application/x-javascript")
    public Response rootdisks(@Context HttpHeaders headers, @Context UriInfo ui, @Context HttpServletRequest req) {
        
        String res = "{ \"error"+Register.class.getSimpleName().toLowerCase()+"response\" : {\"uuidList\":[],\"errorcode\":\""+ErrorResponse.Error0000.code()+"\",\"errortext\":\""+ErrorResponse.Error0000.text()+"\"} }";

    	SigninSession signinsess;
    	if ( (signinsess = SigninSession.getSigninSession(req) ) != null) {
            
    	} else {
    		System.out.println("Please login first! ");
    	}
        
        return Response.ok(res).build();
    }
    
    @GET
    @Path("/datadisks")
    @Produces("application/x-javascript")
    public Response datadisks(@Context HttpHeaders headers, @Context UriInfo ui, @Context HttpServletRequest req) {
        
        String res = "{ \"error"+Register.class.getSimpleName().toLowerCase()+"response\" : {\"uuidList\":[],\"errorcode\":\""+ErrorResponse.Error0000.code()+"\",\"errortext\":\""+ErrorResponse.Error0000.text()+"\"} }";

    	SigninSession signinsess;
    	if ( (signinsess = SigninSession.getSigninSession(req) ) != null) {
            
    	} else {
    		System.out.println("Please login first! ");
    	}
        
        return Response.ok(res).build();
    }
    
    @GET
    @Path("/{id}/backup")
    @Produces("application/x-javascript")
    public Response BackupById(@Context HttpHeaders headers, @Context UriInfo ui, @Context HttpServletRequest req) {
        
        String res = "{ \"error"+Register.class.getSimpleName().toLowerCase()+"response\" : {\"uuidList\":[],\"errorcode\":\""+ErrorResponse.Error0000.code()+"\",\"errortext\":\""+ErrorResponse.Error0000.text()+"\"} }";

    	SigninSession signinsess;
    	if ( (signinsess = SigninSession.getSigninSession(req) ) != null) {
            
    	} else {
    		System.out.println("Please login first! ");
    	}
        
        return Response.ok(res).build();
    }
    
    @GET
    @Path("create")
    @Produces("application/x-javascript")
    public Response create(@Context HttpHeaders headers, @Context UriInfo ui, @Context HttpServletRequest req) {
        
        String res = "{ \"error"+Register.class.getSimpleName().toLowerCase()+"response\" : {\"uuidList\":[],\"errorcode\":\""+ErrorResponse.Error0000.code()+"\",\"errortext\":\""+ErrorResponse.Error0000.text()+"\"} }";

    	SigninSession signinsess;
    	if ( (signinsess = SigninSession.getSigninSession(req) ) != null) {
    		System.out.println("API with session: " +signinsess.getSessionkey());
    	} else {
    		System.out.println("Please login first! ");
    	}
        
        return Response.ok(res).build();
    }
    
    @GET
    @Path("/{id}/destroy")
    @Produces("application/x-javascript")
    public Response destroyById(@Context HttpHeaders headers, @Context UriInfo ui, @Context HttpServletRequest req) {
        
        String res = "{ \"error"+Register.class.getSimpleName().toLowerCase()+"response\" : {\"uuidList\":[],\"errorcode\":\""+ErrorResponse.Error0000.code()+"\",\"errortext\":\""+ErrorResponse.Error0000.text()+"\"} }";

    	SigninSession signinsess;
    	if ( (signinsess = SigninSession.getSigninSession(req) ) != null) {
            
    	} else {
    		System.out.println("Please login first! ");
    	}
        
        return Response.ok(res).build();
    }
    
}
