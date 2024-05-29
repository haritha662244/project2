package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.UserDetails;
import in.ashokit.service.UserService;
import in.ashokit.service.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	// login-page-display
	@GetMapping("/login")
	public String login(Model model) {
		// UserDetails user1= new UserDetails();
		model.addAttribute("user", new UserDetails());
		return "index";
	}

	// login-button-handle

	@PostMapping("/loginUser")
	public String handleLogin(UserDetails user, Model model) {
		System.out.println(user);
		UserDetails userObj = userService.getUser(user.getMail(), user.getPwd());
		System.out.println(userObj);
		if (userObj == null) {
			model.addAttribute("emsg", "Invalid credentials");
			UserDetails user1 = new UserDetails();
			model.addAttribute("user", user1);
			return "index";
		} else {
			model.addAttribute("msg", "Welcome to Ashok IT..");
			model.addAttribute("user", userObj);
			return "dashboard";
		}

	}

	@PostMapping("/saveUser")
	public String saveUserDetails(UserDetails user, Model model) {
		System.out.println(user);
		boolean userDetails = userService.saveUser(user);
		UserDetails user1 = new UserDetails();
		model.addAttribute("user", user1);
		if (userDetails) {
			model.addAttribute("msg", "Successfully Saved");
		} else {
			model.addAttribute("msg", "User saving is Failed ");
		}
		return "registerView";
	}

	// register-page-display
	@GetMapping("/register")
	public String register(Model model) {
		UserDetails user = new UserDetails();
		model.addAttribute("user", user);

		return "registerView";

	}

	// register -button- handle
//	@PostMapping("/registerForm")
//	public String handleRegister( User user,Model model) {
//		System.out.println(user);
//		boolean status =userService.saveUser(user);
//		if(status) {
//			model.addAttribute("smg","User Registered");
//		}else {
//			model.addAttribute("emsg", "Registration Failed");
//		}
//		return  "registerView";
//	}

	// logout-method
	@GetMapping("/logout")
	public String logout(Model model) {
		model.addAttribute("user", new UserDetails());
		return "index";
	}

}
