package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Reservation;
import in.ashokit.entity.User;
import in.ashokit.service.ReservationService;
import in.ashokit.service.UserService;


@Controller
public class ReservationController {
	
	 
	 @Autowired
    private  ReservationService reservationService;
	 
	 @Autowired
	 private UserService userService;
	 
	 @GetMapping("/")
	    public String login(Model model) {
	        model.addAttribute("user", new User());
	        return "login";
	    }
	 

//    public ReservationController(ReservationService reservationService) {
//        this.reservationService = reservationService;
//    }
	   @GetMapping("/registration")
	    public String registration(Model model) {
	        model.addAttribute("user", new User());
	        return "registration";
	    }
	   @PostMapping("/login")
	    public String loginChecking(@ModelAttribute User user,Model model) {
	      
	        User findByUsername = userService.findByUsername(user.getUsername());
	        if(findByUsername.getPassword().equals(user.getPassword())) {
	        	  model.addAttribute("reservation", new Reservation()); 
	        	return "reservation";
	        }
	        else {
	        	  model.addAttribute("user", new User());
	        	  model.addAttribute("msg","Login Credentials are Wrong ,please enter valid details"); 
	        	  return "redirect:/login"; 
	        }
	        // Redirect to login page after successful registration
	    }

	    @PostMapping("/registration")
	    public String registrationSubmit(@ModelAttribute User user) {
	        userService.saveUser(user);
	        return "redirect:/"; // Redirect to login page after successful registration
	    }

    @GetMapping("/reservation")
    public String reservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation";
    }

    @PostMapping("/reservation")
    public String makeReservation(@ModelAttribute("reservation") Reservation reservation,Model model) {
    	reservation.setPnrNumber(reservation.getFromPlace().substring(0,4).toUpperCase()+reservation.getTrainNumber());
        Reservation saveReservation = reservationService.saveReservation(reservation);
        if(saveReservation!=null) {
        	 model.addAttribute("reservation", new Reservation());
        	 model.addAttribute("msg","Reservation is Successfull");
        	 model.addAttribute("pnrNumber",saveReservation.getPnrNumber());
        	 return "reservation";
        }
        else {
        	 model.addAttribute("msg","Reservation is Failed try Again");
        	 return "reservation";
        }
       
    }
}
