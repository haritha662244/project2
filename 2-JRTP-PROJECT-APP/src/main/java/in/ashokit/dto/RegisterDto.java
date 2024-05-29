package in.ashokit.dto;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.UserDtls;

public class RegisterDto {
	
	@GetMapping("/register")
    public String showRegistrationForm(Model model) {
        // Create a new instance of User and add it to the model
        model.addAttribute("user", new UserDtls());
        model.addAttribute("smsg", ""); // Success message
        model.addAttribute("emsg", ""); // Error message
        return "register"; // This will return the name of your HTML file (register.html)
    }
	 @PostMapping("/register")
	    public String processRegistrationForm(@ModelAttribute("user") UserDtls userDtls, Model model) {
		 System.out.println("Name: " + userDtls.getUname());
	        System.out.println("Email: " + userDtls.getEmail());
	        System.out.println("Phone: " + userDtls.getPhno());
	        System.out.println("Country: " + userDtls.getCity());
	        System.out.println("State: " + userDtls.getState());
	        System.out.println("City: " + userDtls.getCity());
	        
	        model.addAttribute("smsg", "Registration successful!");

			return "register";

	 }
}