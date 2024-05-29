package in.ashokit.controller;

	
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.*;

import in.ashokit.dto.LoginDto;
import in.ashokit.dto.RegisterDto;
import in.ashokit.dto.ResetPwdDto;
import in.ashokit.entity.City;
import in.ashokit.entity.State;
import in.ashokit.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

	@Controller
	public class UserController {

	    @GetMapping("/registerPage")
	    public String registerPage(Model model) {
	        model.addAttribute("registerDto", new RegisterDto());
	        return "registerPage";
	    }

	    @GetMapping("/getStates/{cid}")
	    @ResponseBody
	    public Map<Integer, String> getStates(@PathVariable Integer cid) {
	        List<State> states = userService.getStatesByCountryId(cid); // Assume userService.getStatesByCountryId() fetches states from the database
	        Map<Integer, String> statesMap = new HashMap<>();
	        for (State state : states) {
	            statesMap.put(state.getId(), state.getName());
	        }
	        return statesMap;
	    }
	

	    @GetMapping("/getCities/{sid}")
	    @ResponseBody
	    public Map<Integer, String> getCities(@PathVariable Integer sid) {
	        List<City> cities = userService.getCitiesByStateId(sid); // Assume userService.getCitiesByStateId() fetches cities from the database
	        Map<Integer, String> citiesMap = new HashMap<>();
	        for (City city : cities) {
	            citiesMap.put(city.getId(), city.getName());
	        }
	        return citiesMap;
	    }
	    @PostMapping("/register")
	    public String register(@ModelAttribute RegisterDto regDto) {
	        // Logic to register the user using regDto
	        return "redirect:/loginPage";
	    }

	    @GetMapping("/loginPage")
	    public String loginPage(Model model) {
	        model.addAttribute("loginDto", new LoginDto());
	        return "loginPage";
	    }

	    @PostMapping("/login")
	    public String login(@ModelAttribute LoginDto loginDto, Model model) {
	        // Logic to authenticate user using loginDto
	        // If authentication successful, redirect to dashboard
	        // If authentication fails, return to login page with error message
	        return "redirect:/dashboard";
	    }

	    @PostMapping("/resetPwd")
	    public String resetPwd(@ModelAttribute ResetPwdDto pwdDto) {
	        // Logic to reset password using pwdDto
	        return "redirect:/loginPage";
	    }

	    @GetMapping("/dashboard")
	    public String dashboard(Model model) {
	        // Logic to populate dashboard data
	        return "dashboard";
	    }

	    @GetMapping("/logout")
	    public String logout(HttpServletRequest request) {
	        // Retrieve the session associated with the request
	        HttpSession session = request.getSession(false); // false means don't create a new session if it doesn't exist
	        
	        if (session != null) {
	            // Invalidate the session to logout the user
	            session.invalidate();
	        }

	        // Redirect the user to the login page
	        return "redirect:/loginPage";
	}



