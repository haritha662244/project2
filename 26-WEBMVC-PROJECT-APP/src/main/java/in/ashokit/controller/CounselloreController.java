package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.dto.Dashboard;
import in.ashokit.entity.Counsellore;
import in.ashokit.service.CounselloreService;
import in.ashokit.service.EnquiryService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
public class CounselloreController {
	@Autowired
	private CounselloreService counselloreService;
	
	@Autowired
	private EnquiryService enquiryService;
	
@GetMapping("/logout")	
public String logout(HttpServletRequest req,Model model) {
	HttpSession session = req.getSession(false);//get session
	session.invalidate();
	return "redirect:/login";//means login method is call it will display index.
  }
	
	//login - page -display
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("counsellore", new Counsellore());
		return "index";
	}

	// login - button - handle
	@PostMapping("/login")
	public String handleLogin(Counsellore counsellore,HttpServletRequest req, Model model) {

		Counsellore counselloreObj =
				counselloreService.getCounsellore(counsellore.getEmail(), counsellore.getpwd());
		
		//means  if the given email id ,pwd i am not getting counsellore
		//what is meaning of in valid credintail.
		if (counselloreObj == null) {
			model.addAttribute("emsg", "Invalid Credentials");
			return "index";
		} else {
			//set counsellor-id in session obj.and save the  get the enquires bsed on the counsellore.
			
			HttpSession session=req.getSession(true);//always new session
			session.setAttribute("cid",counselloreObj.getcounselloreId());
			
		Dashboard dbinfo = enquiryService.getDashboardInfo(counselloreObj.getcounselloreId() );
		model.addAttribute("dashboard", dbinfo);
			return "dashboard";
		}
	}
	@GetMapping("/dashboard")
	public String buildDashBoard(HttpServletRequest req, Model model) {
		HttpSession session=req.getSession(false);//always new session
		
		Integer cid=(Integer)session.getAttribute("cid");
		Dashboard dbinfo = enquiryService.getDashboardInfo(cid );
		model.addAttribute("dashboard", dbinfo);
			return "dashboard";
	}
	

	// register - page - display

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("counsellore", new Counsellore());
		return "registerView";
	}

	// register -button -handle

	@PostMapping("/register")
	public String handleRegister(Counsellore counsellore, Model model) {

		boolean status = counselloreService.saveCounsellore(counsellore);
		model.addAttribute("counsellore", new Counsellore());
		if(status) {
			model.addAttribute("smsg", "Counsellore Saved");
		}else {
			model.addAttribute("emsg", " Failed To Save");
		}

		return "registerView";
	}
}



