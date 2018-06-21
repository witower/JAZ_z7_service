package rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestRest {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response test(){
		return Response.ok("working").build();
	}
}
