
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
		BigDecimal bd2 = new BigDecimal(1.1);
		int target = -5;
int num = 3;

target =- num;  // Noncompliant; 

		
 		return "{ name : Hello " + name + "}";

	}

}
