package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.service.UserDetailsService;
import jakarta.servlet.http.HttpServletRequest;



@Controller
public class LogoutController {
	@Autowired
	public UserDetailsService userDetailsService;
	
//	@GetMapping("/session")
//    public String sessionPage() {
//        return "session";
//    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/login?logout";
    }
    
    
}

