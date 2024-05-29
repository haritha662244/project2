package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

 
import in.ashokit.entity.User;
import in.ashokit.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
	
	@PostMapping("/login")
    public String login(@RequestParam  User user,Model model) {
      
        User findByUsername = userService.username(user.getUsername());
        if(username.getPassword().equals(user.getPassword())) {
        	  model.addAttribute("registration", new registration()); 
        	return "registration";
        }
        else {
        	  model.addAttribute("user", new User());
        	  model.addAttribute("msg","Login Credentials are Wrong ,please enter valid details"); 
        	  return "redirect:/login"; 
        }
        // Redirect to login page after successful registration
    }
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "registerView";
	}

	// register - button - handle

	@PostMapping("/register")
	public String handleRegister(User user, Model model) {

		boolean status = userService.saveUser(user);

		if(status) {
			model.addAttribute("smsg", "registration Saved");
		}else {
			model.addAttribute("emsg", " Failed To Save");
		}

		return "registerView";
	}
}


   