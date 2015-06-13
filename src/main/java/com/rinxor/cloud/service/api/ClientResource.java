package com.rinxor.cloud.service.api;


import com.rinxor.cloud.service.api.command.Register;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


@Path("/cp/api")
public class ClientResource {
   
    @POST
    @Path("signin")
    @Produces("application/x-javascript")
    //@Consumes("application/x-www-form-urlencoded")
    public Response signin(@Context HttpHeaders headers, @Context UriInfo ui, MultivaluedMap<String, String> params, @Context HttpServletRequest req) {
        
        String res = "{ \"error"+Register.class.getSimpleName().toLowerCase()+"response\" : {\"uuidList\":[],\"errorcode\":\""+ErrorResponse.Error0000.code()+"\",\"errortext\":\""+ErrorResponse.Error0000.text()+"\"} }";

        String cookie = req.getHeader("Cookie");
        String email = (params.getFirst("email") == null)? "N/A" : params.getFirst("email");
        
        SigninSession signinsess;
    	if ( (signinsess = SigninSession.getSigninSession(req) ) != null) {
            
    		System.out.println("Loged in: " +signinsess.getSessionkey());
    	} else {
    		signinsess = new SigninSession();
                signinsess.setSessionkey(email);
    		SigninSession.addSigninSession(req, signinsess);
                System.out.println("New Session: "+ email);
    	}
        
        System.out.println("::"+cookie);
        
        return Response.ok(res).build();
        
    }
    
    @GET
    @Path("signout")
    @Produces("application/x-javascript")
    public Response signout(@Context HttpHeaders headers, @Context UriInfo ui, @Context HttpServletRequest req) {
        
        String res = "{ \"error"+Register.class.getSimpleName().toLowerCase()+"response\" : {\"uuidList\":[],\"errorcode\":\""+ErrorResponse.Error0000.code()+"\",\"errortext\":\""+ErrorResponse.Error0000.text()+"\"} }";

        SigninSession signinsess;
    	if ( (signinsess = SigninSession.getSigninSession(req) ) != null) {
    		System.out.println("Loged out: " +signinsess.getSessionkey());
                SigninSession.removeSigninSession(req);
    	} else {
    		System.out.println("Already Loged out: ");
    	}
        
        return Response.ok(res).build();
        
    }
    
}
