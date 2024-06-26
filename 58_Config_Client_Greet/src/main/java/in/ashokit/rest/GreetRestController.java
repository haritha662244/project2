package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@Value("${msg}")
	private String msgTxt;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return msgTxt;
	}
	
	//main logic
	public String getDataFromRedis() {
		//logic to fetch data from redis
		return null;
	}
	
	
	//fallback logic(every time logic is failed)
	public String getDataFromDB() {
		//logic to fetch data from redis
		return null;
	}
}
