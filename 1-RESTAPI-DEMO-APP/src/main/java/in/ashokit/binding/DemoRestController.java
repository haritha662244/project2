package in.ashokit.binding;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class DemoRestController {
	
	
	@GetMapping(value="/msg",produces="text/plain")
	public ResponseEntity<String> getMsg() {
		String msg= "Welcome to ashok IT";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@GetMapping("/greet{name}")
	public String getGreetMsg(@PathVariable("name")String name) {
		String msg= name+",Good Moring..!!";
		return msg;
	}
	
	@GetMapping("/welcome")
	public String getWelcomMsg(@RequestParam("name")String name) {
		String msg= name+", Welcome to Rest API";
		return msg;
	}

}
