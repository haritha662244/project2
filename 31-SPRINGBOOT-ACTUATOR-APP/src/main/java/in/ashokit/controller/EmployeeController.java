package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	@GetMapping("/welcome")
    @ResponseBody
	public String welcomeMsg() {
		return "Welcome to String Boot";

	}
}
