package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/greet")
		
	public ModelAndView getmag2() {
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("msg","Welcome to AshokIt");//key and value ivi
		
		mav.setViewName("index");// i want to you create index .html page.
		
		return mav;
	}
	@GetMapping("/welcome")//the means  url pattern view in will  response index page will be display
	//the controller returntype method  (modelAndView)
	//modelAndView nothing but  model means data in the key value, view means  logical find
	public ModelAndView getmag1() {
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("msg","Welcome to AshokIt");//key and value ivi
		
		mav.setViewName("index");// i want to you create index .html page.
		
		return mav;
		
		
	}

}
