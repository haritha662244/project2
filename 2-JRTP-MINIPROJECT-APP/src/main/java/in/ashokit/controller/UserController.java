package in.ashokit.controller;

import java.util.Map;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashokit.dto.LoginDto;
import in.ashokit.dto.RegisterDto;
import in.ashokit.dto.ResetPwdDto;
import in.ashokit.dto.UserDto;
import in.ashokit.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userservice;

	// this method is responsible to read load this register page. when user click
	// on signup page.

	@GetMapping("/register")
	public String registerPage(Model model) {
		model.addAttribute("registerDto", new RegisterDto());// we have country data ui
		model.addAttribute("countries", userservice.getCountries());// form binding object.this method is uipage
																	// respones
		return "registerView";

		// Map<Integer, String> countriesMap = userservice.getCountries()
		// model.addAttribute("countries",countriesMap);

	}

	@GetMapping("/states")
	@ResponseBody
	public Map<Integer, String> getStates(@RequestParam("countryId") Integer cid) {
		return userservice.getStates(cid);
	}

	@GetMapping("/cities")
	@ResponseBody // direct response to the ui.
	public Map<Integer, String> getCities(@RequestParam("stateId") Integer sid) {
		return userservice.getCities(sid);
	}

	// Purpose of this method user registration based onthe email id .be four
	// calling the user service i will return get user uerdto obj
	@PostMapping("/register")
	public String register(@ModelAttribute RegisterDto regDto, Model model) {
		System.out.println("haii-1");
		UserDto user = userservice.getUser(regDto.getEmail());
		if (user != null) {
			model.addAttribute("emsg", "Duplicate Email");
			model.addAttribute("countries", userservice.getCountries());
			return "registerView";
		}

		boolean registerUser = userservice.registerUser(regDto);
		System.out.println(registerUser);
		if (registerUser) {
			model.addAttribute("smsg", "User Registered");
			model.addAttribute("countries", userservice.getCountries());
			return "registerView";
		} else {
			model.addAttribute("emsg", "Registration Failed");
			model.addAttribute("countries", userservice.getCountries());
			return "redirect:registerView";
		}
	}

	@GetMapping("/")
	public String loginPage(Model model) {
		model.addAttribute("loginDto", new LoginDto());// empty login method
		return "index";
	}

	@PostMapping("/login")
	public String login(LoginDto loginDto, Model model) {
		UserDto user = userservice.getUser(loginDto);
		System.out.println(user.getPwdUpdate());
		if (user == null) {
			model.addAttribute("emsg", "Invalid Credintials");
			return "index";
		}

		if ("YES".equals(user.getPwdUpdate())) {
			// pwd already updated - go to dashboard
			return "redirect:dashboard";

		} else {

			// pwd not updated- go to reset pwd page
			ResetPwdDto resetPwdDto = new ResetPwdDto();
			resetPwdDto.setEmail(user.getEmail());
			model.addAttribute("resetPwdDto", resetPwdDto);
			return "/resetPwd";
		}

	}

	// user the enter the method And enter the pwd and update the click button .user
	// click on the method we will the get the request the our method in the pwd
	// object.

	@PostMapping("/resetPwd")
	public String resetPwd( @ModelAttribute("resetPwd") ResetPwdDto resetPwd, Model model) {
		System.out.println(resetPwd.getNewPwd());
		System.out.println(resetPwd.getConfirmPwd());

		if(resetPwd.getNewPwd().equals(resetPwd.getConfirmPwd())) {
			model.addAttribute("emsg", "new password and confirm password shoud be same");
		}
		UserDto user = userservice.getUser(resetPwd.getEmail());

		if (user.getPwd().equals(resetPwd.getOldPwd())) {

			// match or mis match password check in the database

			boolean resetPwd1 = userservice.resetPwd(resetPwd);

			// curent pwd ity pwd anedhi update avutundhi.

			// not match ity else condition check chestundhi. worng pwd is else condition.

			if (resetPwd1) {
				return "/dashboard";
			} else {
				model.addAttribute("emsg", " Pwd Update Failed");
				return "resetPwd";
			}
		} else {
			model.addAttribute("emsg", "Given Old Pwd Is Worng");
			return "resetPwd";
		}

	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		String quote = userservice.getQuote();
		model.addAttribute("quote", quote);
		return "dashboard";

	}

	@GetMapping("/logout")
	public String logout() {
		// this line means login method will be call.
		return "redirect/";

	}

}
