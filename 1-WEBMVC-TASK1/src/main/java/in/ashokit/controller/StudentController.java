package in.ashokit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.entity.StudentEntity;
import in.ashokit.service.StudentService;
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		 List<StudentEntity> students = studentService.getAllStudents();
	        model.addAttribute("students", students);
	        return "index";

		
	}

}
