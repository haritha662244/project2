package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.User;
import in.ashokit.service.TimerService;
import in.ashokit.service.UserService;
@Controller
@RequestMapping("/api")
public class LoginController{

	    @Autowired
	    private TimerService Timerervice;
	    
	    @GetMapping("/login")
	    public String loginPage() {
	    	return "login";
	    }
	    

	    @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
	        if (Timerervice.authenticate(username, password)) {
	            return ResponseEntity.ok("Login successful");
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
	        }
	    }
	}



