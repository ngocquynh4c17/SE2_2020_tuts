package demo.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import demo.model.User;
import demo.service.UserService;


@Path("/user")
public class UserResource {
	UserService userService = new UserService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML) 
	public List<User> getStudent() {
		return userService.getAllStudents();
	}
}