package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
  @Controller
   public class MsgController {
	  

      @GetMapping("/greet")
      private String getGreet(Model model) {
   	  
      model.addAttribute("msg", "Good Morning");
      return "index";
    }
	  
	  
       @GetMapping("/welcome")
       private String getWelcome(Model model) {
    	   //this line is is used to error msg display
    	   int i=10/0;
       model.addAttribute("msg", "Welcome To Ashok IT");
       return "index";
     }
       
//       @ExceptionHandler(value = ArithmeticException.class)
//       public  String handleAe(ArithmeticException ae) {
//    	   return "exView";
//       }
       
       @ExceptionHandler(value = Exception.class)
       public  String handleAe(Exception e) {
    	   return "exView";
       }
   }
