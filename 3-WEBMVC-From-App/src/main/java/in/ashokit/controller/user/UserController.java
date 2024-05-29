package in.ashokit.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binidings.Book;
@Controller
public class UserController {
	//method- to load from(get Request)
	
		@GetMapping("/book")
		public ModelAndView loadForm() {
			
			ModelAndView mav= new  ModelAndView();
			mav.addObject("bookObj", new Book());
			mav.setViewName("bookView");
			return mav;
			
			
		}
		
	//method-2:to handle from submission (post)
	@PostMapping("/book")	
	 public ModelAndView handleBookSubmit(Book book) {
		 System.out.println(book);
		//todo: save data into db 
		 
		 ModelAndView  mav= new ModelAndView();
		 mav.addObject("msg","Book saved sucessfully...........");
		 mav.setViewName("sucess");
		 return mav;
}
}
