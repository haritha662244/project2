package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		//only understanding purpose of the load balancing
		// which request on the which port number based on the  port number.
		String port=env.getProperty("server.port");
		
		
		String msg="Welcome to ashok IT ("+ port+")";
		
		return msg;
	}

}
