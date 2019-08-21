
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/user")
public class sampleService {
	
	@Path("{name}")
	@GET
	@Produces("application/json")
	public String convertCtoFfromInput(@PathParam("name") String name) {
		
 		return "{ name : Hello " + name + "}";

	}

}
