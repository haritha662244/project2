package in.ashokit.controller;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.validation.annotation.Validated;
	import org.springframework.web.bind.annotation.GetMapping;

	import in.ashokit.binding.Student;
	import jakarta.validation.Valid;

	@Controller
	public class StudentController {
		
		@GetMapping("/")
		public String loadForm(Model model) {
			model.addAttribute("student",new Student());
			return "index";
		}
		 
		@GetMapping("/student")
		public String handleSubmit(@Valid Student student , BindingResult result ,Model model) {
			if(result.hasErrors()) {
				return "index";
				
			}else {
				System.out.println(student);
		        model.addAttribute("msg","Student Saved");
		     
			return "index";
		}
		}

	}

