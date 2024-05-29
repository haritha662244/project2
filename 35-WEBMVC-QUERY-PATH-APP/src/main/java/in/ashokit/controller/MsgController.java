package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class MsgController {
	@GetMapping("/welcome")//with out any UI
    @ResponseBody
	public String  welcomeMethod(@RequestParam("name") String  name) {
		return name+ " ,Welcome to Ashokit";
	}
	
	//direct to  cilents to 
	//quriry  para is used to send the data from UI to controller from in the url
	//any data from send to the  client to server in the url then ,
	//u can go for quary parameters
	//quriry param represenrt to data in the key value format name is key john is tha value
	//Multiple query param send to & symblo parameters
	
	
	@GetMapping("/greet/{name}")//path parameters can represent  any where n the url
	public String greetMethod(@PathVariable ("name")String name,Model model) {//which position well come we need to represent show
		model.addAttribute("msg",name+"Good morning");
		return "index";
	}
}