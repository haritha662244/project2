package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	//login- page 
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";

   }
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	
	@PostMapping("/register")
	public String registerSave() {
		return "register";
	}
	
}