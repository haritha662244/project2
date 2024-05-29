package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Profile;
import in.ashokit.entity.User;
import in.ashokit.service.ProfileService;
import in.ashokit.service.UserService;

	@Controller
	@RequestMapping("/api")
	public class ProfileController {

	    @Autowired
	    private ProfileService profileService;

	    @PutMapping("/profile/{userId}")
	    public ResponseEntity<String> updateProfile(@PathVariable Long userId, @RequestBody Profile profile) {
	        if (profileService.updateProfile(userId, profile)) {
	            return ResponseEntity.ok("Profile updated successfully");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	        }
	    }

	    @PutMapping("/updatePassword/{userId}")
	    public ResponseEntity<String> updatePassword(@PathVariable Long userId, @RequestParam String newPassword) {
	        if (profileService.updatePassword(userId, newPassword)) {
	            return ResponseEntity.ok("Password updated successfully");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	        }
	    }
	}


	    
	
