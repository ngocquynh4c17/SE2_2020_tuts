package demo.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import demo.model.Shirt;
import demo.service.ShirtService;


@Path("/shirt")
public class ShirtResource {
	ShirtService ShirtService = new ShirtService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML) 
	public List<Shirt> getShirt() {
		return ShirtService.getAllShirts();
	}
}
