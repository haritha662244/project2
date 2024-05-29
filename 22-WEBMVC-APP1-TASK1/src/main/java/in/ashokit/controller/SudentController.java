package in.ashokit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;
import in.ashokit.service.StudentService;

@Controller
public class SudentController {
	
	
	@Autowired
	private StudentService studentRepository;
	
	@PostMapping("/savestudent")
	 public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
	   return new ResponseEntity<>(studentRepository.saveStudent(student),HttpStatus.CREATED);
		 
	 }
	
	
	//display list of employee
	@GetMapping("/studentList")
	public String   getALLStudents(Model model ) {
		List<Student> student = studentRepository.getAllStudent();
		model.addAttribute("students",student);
		//student.student("index");
	return  "index";
	
	}
	
}


