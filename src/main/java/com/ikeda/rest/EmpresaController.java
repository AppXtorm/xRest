package com.ikeda.rest;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.ikeda.model.Empresa;
import com.ikeda.model.QuadraHorario;
import com.ikeda.service.EmpresaService;

@Path("/company/")
public class EmpresaController {
	
	@Path("/bycep")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCompanyByCep(@QueryParam("cep") String cep){
		List<Empresa> empresas = null;
		try{
			empresas = EmpresaService.getEmpresasByCep(cep);
		}catch(Exception e){
			return Response.status(500).entity("{}").build();
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empresas", empresas);
		
		return Response.status(200).entity(map).build();
	}
	
	@Path("/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registerCompan(Empresa empresa){
		Boolean registered;
		
		try {
			registered = EmpresaService.registerCompany(empresa);
			if (registered) {
				return Response.status(200).entity("{success: " + true + "}")
						.build();
			} else {
				return Response.status(200).entity("{success: " + false + "}")
						.build();
			}

		} catch (Exception e) {
			return Response.status(500).entity("{}").build();
		}
		
		/*
		try{
			SqlSession session = SQLSessionFactory.getSqlSessionFactory().openSession();
			int registerUser =  session.insert("cadastrarEmpresa", empresa);
		
			session.commit();
			session.close();
		
			System.out.println(registerUser);
			return Response.status(200).entity("{success: " + true + "}").build();
		}catch(Exception e)
		{
			System.out.println(e);
			return Response.status(500).entity("{}").build();
		}
		*/				
	}
	
	@Path("/byname")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCompanyByName(@QueryParam("name") String name){
		List<Empresa> companies = null;			
		try{
			companies = EmpresaService.getCompaniesByName(name);
		}catch(Exception e){
			return Response.status(500).entity("{}").build();
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empresas", companies);
		
		return Response.status(200).entity(companies).build();
	}
	
	
	@Path("/schedule")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response registerCompanySchedule(@QueryParam("cnpj") String cnpj){
		List<QuadraHorario> schedule = null;
		
		try{
			schedule = EmpresaService.getFieldSchedule(cnpj);
		}catch(Exception e){
			return Response.status(500).entity("{}").build();
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("horarios", schedule);		
		return Response.status(200).entity(schedule).build();
	}
	
	

	
		
	
	
	
}
