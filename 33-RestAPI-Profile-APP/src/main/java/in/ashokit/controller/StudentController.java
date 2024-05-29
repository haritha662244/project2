package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	// to read the data form the properties file
     @Value("${msgTxt}")
	public String msg;
     
	//Properties file into controller (or) controller into UI
	@GetMapping("/")
	@ResponseBody
	public String getMsg() {
		return msg;
	}
}
