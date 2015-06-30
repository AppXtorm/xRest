package com.ikeda.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/testconn")
public class TestConnection {
	
	@Path("/tester")
	@GET
	public Response testConnection(){
		return Response.status(200).build();
	}
}
