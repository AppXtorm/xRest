package com.ikeda.rest;

import java.io.UnsupportedEncodingException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.ibatis.session.SqlSession;

import com.ikeda.data.AuthenticateRequest;
import com.ikeda.jdbc.SQLSessionFactory;
import com.ikeda.model.Usuario;

@Path("/login/")
public class LoginController {
	
	@POST
	@Path("/authenticate")	
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response authenticate(AuthenticateRequest data) throws UnsupportedEncodingException {
		SqlSession session = SQLSessionFactory.getSqlSessionFactory().openSession();
		
		try{
			Usuario user = session.selectOne("getUserByCPF", data.getCpf());
			
			if(data.getPassword().equalsIgnoreCase(user.getPassword())){
				System.out.println("Deu sucesso");
				return Response.status(200).entity("{\"success\":true}").build();
			}
			else{
				System.out.println("Deu erro");
				return Response.status(401).entity("{}").build();
			}
				
		}catch(Exception e){
			System.out.println(e);
			return Response.status(500).build();
		}
		
	}
}
