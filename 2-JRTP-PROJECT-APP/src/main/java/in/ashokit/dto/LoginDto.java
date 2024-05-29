package in.ashokit.dto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.UserDtls;

public class LoginDto {
	
     @GetMapping("/")
    public String showIndexPage() {
		  return "index"; 	 
     }

     @GetMapping("/login")
     public String showLoginForm(Model model) {
         // Add empty user object to the model
         model.addAttribute("user", new UserDtls());
         model.addAttribute("smsg", ""); // Success message
         model.addAttribute("emsg", ""); // Error message
         return "login"; // This will return the name of your HTML file (login.html)
     }
     
     @PostMapping("/login")
     public String processLoginForm(@RequestParam String email, @RequestParam String password, Model model) {
		return "password";
    	 
     }
}