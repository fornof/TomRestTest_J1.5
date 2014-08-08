/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fornof.jersey1;
import java.security.Principal;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

/**
 *
 * @author Robert Fornof
 * note: if the import / roles allowed are not importing
 * 1. download the jersey 1.15 Jersey zip with dependencies  from here: https://jersey.java.net/nonav/documentation/1.15/chapter_deps.html and extract 
 * 2. add to project libraries --> right click on project-> Properties -> libraries -> add Jar/Folder --> select all jars from extracted folder
 */
@PermitAll
@Path("/hello")                     // this @Path is necessary to run
@DeclareRoles({"admin","robert"})
public class RestTest {
    @GET                            //this @GET (or @PUT, @POST, @DELETE) is required to run the method
    @Path("/admin")                 // this @Path is optional 
    @RolesAllowed("admin")          // roles by default are using the UserDatabase Realm found in server.xml -which uses tomcat-users.xml roles and usernames.
    @Produces(MediaType.TEXT_HTML)  // @Produces is optional
    public String GetText(@Context SecurityContext sc){
       // return "hi admin"     ;
        return "hi , you are logged in as: " + sc.getUserPrincipal().getName() + "</br>" +
                "SecurityContect.getUserPrincipal() output: " + sc.getUserPrincipal().toString();
        
      
    }
    @Path("/robert")
    //@PermitAll
    @GET
     @RolesAllowed("robert")
      public String GetRobert(@Context SecurityContext sc){
            
         
        return "hi , you are logged in as: " + sc.getUserPrincipal().getName() + "</br>" +
                "SecurityContect.getUserPrincipal() output: " + sc.getUserPrincipal().toString();
        
      
    }
    }
    

