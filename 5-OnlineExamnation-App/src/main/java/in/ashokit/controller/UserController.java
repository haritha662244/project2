package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.User;


import java.security.Principal;
import java.util.Optional;




@Controller
public class UserController {

    @Autowired
    private UserDetailsService userService;

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

//    @PostMapping("/login")
//    public String login(User user) {
//        if (userService.authenticate)(user.getUsername(), user.getPassword())) {
//            return "redirect:/profile";
//        }
//        return "redirect:/login?error";
//    }
    
    
    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user) {
        if (userService.authenticate(user.getUsername(), user.getPassword())) {
            return "redirect:/dashboard";
        } else {
            return "redirect:/login?error";
        }
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        User user = userService.getCurrentUser();
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping("/updateProfile")
    public String updateProfileForm(Model model) {
        User user = userService.getCurrentUser();
        model.addAttribute("user", user);
        return "updateProfile";
    }

    @PostMapping("/updateProfile")
    public String updateProfile(User user) {
        userService.updateProfile(user);
        return "redirect:/profile";
    }

    @GetMapping("/updatePassword")
    public String updatePasswordForm() {
        return "updatePassword";
    }

    @PostMapping("/updatePassword")
    public String updatePassword(PasswordUpdate passwordUpdate) {
        userService.updatePassword(passwordUpdate);
        return "redirect:/profile";
    }

    @GetMapping("/mcq")
    public String mcq() {
        // Load MCQs and render the MCQ page
        return "mcq";
    }

    @PostMapping("/submitMCQ")
    public String submitMCQ(@RequestParam("answer") String answer) {
        // Process submitted MCQ answer
        return "redirect:/profile";
    }

    @PostMapping("/logout")
    public String logout() {
      userService.logout();
        return "redirect:/login";
    }
}
