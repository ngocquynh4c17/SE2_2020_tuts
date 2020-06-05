package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/HelloWorld")
public class HelloWorld {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayPlainTextHello() {
		String text = "<html>\n" +
	             "<body>" + 
	             "<h1> SE2 Spring 2020</h1>\n" +
	             "<p> This's just a HelloWorld demo Page!!! No more function!!! Thanks U!!! </p> \n" +
	             "</body>" +
	             "</html>";
		return text;
	}
	
}