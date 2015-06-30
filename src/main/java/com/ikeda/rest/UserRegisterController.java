package com.ikeda.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;

import com.ikeda.jdbc.SQLSessionFactory;
import com.ikeda.model.Usuario;

@Path("/user")
public class UserRegisterController {
	
	@Path("/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response userRegister(Usuario user){
		
		try{
			SqlSession session = SQLSessionFactory.getSqlSessionFactory().openSession();
			int registerUser =  session.insert("registerNewUser", user);
			
			session.commit();
			session.close();
			
			System.out.println(registerUser);		
		}catch(Exception e){			
			System.out.println(e);
			return Response.status(500).build();
		}
		return Response.status(200).build();
	}
		
	

}
