package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binidings.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public ModelAndView loadform() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("userObj",new User());
		mav.setViewName("index");
		
		return mav;
		
		
	}
	
	@PostMapping("/user")
	public ModelAndView handelUserFormSubmit( User user) {
		System.out.println(user);
		ModelAndView mav= new ModelAndView();
		mav.addObject("userObj","userDetailsSave");
		mav.setViewName("sucess");
		
		return mav;
	}	

}
