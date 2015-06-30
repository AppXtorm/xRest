package com.ikeda.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.ibatis.session.SqlSession;

import com.ikeda.jdbc.SQLSessionFactory;
import com.ikeda.model.Usuario;
import com.ikeda.service.GCMRegistrationService;

@Path("/gcm")
public class GCMRegistrationController {
	
	/*
	@Path("/registrationid")
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRegistrationId(@QueryParam("cpf") String cpf){
		
		try{
			SqlSession session = SQLSessionFactory.getSqlSessionFactory().openSession();
			int registerUser =  session.update("updateRegistrationId", cpf);			
			session.commit();
			session.close();			
			System.out.println(registerUser);		
		}catch(Exception e){			
			System.out.println(e);
			return Response.status(500).build();
		}
		return Response.status(200).build();
	}
	*/
	
	@Path("/registrationid")
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRegistrationId(@QueryParam("cpf") String cpf){
		
		String registrationId = null;		
		
		try{
			 registrationId = GCMRegistrationService.getRegistrationId(cpf);
			System.out.println("TOIS: " + registrationId);		
		}catch(Exception e){			
			System.out.println(e);
			return Response.status(500).build();
		}		
		
		return Response.status(200).entity("{registration:" + registrationId + "}").build();
	}	
	
	@Path("/registrationid")
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateRegistrationId(Usuario user){
		
		boolean isUpdated;		
		
		try{
			 isUpdated = GCMRegistrationService.setRegistrationId(user);			 
			 if(isUpdated){
				 return Response.status(200).entity("{}").build();
			 }
			 else{
				 return Response.status(500).build();
			 }
		}catch(Exception e){			
			System.out.println(e);
			return Response.status(500).build();
		}						
	}	
	

}
