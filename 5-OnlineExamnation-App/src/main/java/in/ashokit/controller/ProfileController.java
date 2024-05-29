package in.ashokit.controller;

import javax.swing.text.PasswordView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ashokit.entity.User;
import in.ashokit.service.UserDetailsService;

@Controller
public class ProfileController {
	@Autowired
	private UserDetailsService userService;

    @GetMapping("/updateProfile")
    public String updateProfileForm() {
        return "updateProfile";
    }

    @PostMapping("/updateProfile")
    public String updateProfile(User user) {
        // Logic to update user profile
        return "redirect:/profile";
    }

    @GetMapping("/updatePassword")
    public String updatePasswordForm() {
        return "updatePassword";
    }

    @PostMapping("/updatePassword")
    public String updatePassword(PasswordView passwordUpdate) {
        // Logic to update password
        return "redirect:/profile";
    }
    //passwordUpdate
    
    
    
}
