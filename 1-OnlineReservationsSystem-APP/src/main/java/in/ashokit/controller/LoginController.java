package in.ashokit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class LoginController {
	@GetMapping("/logout")	
    public String logout(HttpServletRequest req,Model model) {
    	HttpSession session = req.getSession(false);//get session
    	session.invalidate();
    	return "redirect:/login";//means login method is call it will display index.
      }
    	
    	//login - page -display
    	@GetMapping("/login")
    	public String login(Model model) {
    		model.addAttribute("user", new User());
    		return "index";
    	}

    	// login - button - handle
    	@PostMapping("/login")
//    	//public String handleLogin(User user,HttpServletRequest req, Model model) {
//
//    		//User u =
//    				//UserService.getUser(u.getUsername(), u.getPassword());
//    		
//    		if (user == null) {
//    			model.addAttribute("emsg", "Invalid Credentials");
//    			return "index";
//    		} else {
//    			//set counsellor-id in session obj.and save the  get the enquires bsed on the counsellore.
//    			
//    			//HttpSession session=req.getSession(true);//always new session
//    			//session.setAttribute("cid",user1.getusername());
//    			
////    		Dashboard dbinfo = enquiryService.getDashboardInfo(counselloreObj.getcounselloreId() );
////    		model.addAttribute("dashboard", dbinfo);
////    			return "dashboard";
//  		}
//    	}
    	@GetMapping("/dashboard")
    	public String buildDashBoard(HttpServletRequest req, Model model) {
    		HttpSession session=req.getSession(false);//always new session
    		
    		Integer cid=(Integer)session.getAttribute("cid");
    		//Dashboard dbinfo = enquiryService.getDashboardInfo(cid );
    		//model.addAttribute("dashboard", dbinfo);
    			return "dashboard";
    	}
    	

    	// register - page - display

    	@GetMapping("/register")
    	public String register(Model model) {
    		//model.addAttribute("counsellore", new Counsellore());
    		return "registerView";
    	}

    	// register -button -handle

    	@PostMapping("/register")
    	public String handleRegister(User user, Model model) {

    		//boolean status = UserService.saveUser(user);
    		model.addAttribute("user", new User());
//    		if(status) {
//    			model.addAttribute("smsg", "user  Saved");
//    		}else {
//    			model.addAttribute("emsg", " Failed To Save");
//    		}

    		return "register";
    	}
    
}
