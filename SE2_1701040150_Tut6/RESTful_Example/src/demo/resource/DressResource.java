package demo.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import demo.model.Dress;
import demo.service.DressService;


@Path("/dress")
public class DressResource {
	DressService DressService = new DressService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML) 
	public List<Dress> getDress() {
		return DressService.getAllDresses();
	}
}
