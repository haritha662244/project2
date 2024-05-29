package in.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ashokit.entity.Student;



import in.ashokit.repo.CourseRepository;
import in.ashokit.repo.StudentRepository;
@Controller
@RequestMapping("/student/course")
public class StudentCourseController {
	
	
	private  StudentRepository  studentRepository;
	
	private  CourseRepository  courseRepository;
	

	public StudentCourseController(StudentRepository  studentRepository,
			CourseRepository  courseRepository) {
		
		
		this.studentRepository=studentRepository;
		this.courseRepository=courseRepository;
		
	
	}
	
	
	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student student) {
	
	return studentRepository.save(student);
     }
	
	
	@GetMapping
	public List<Student>findAllStudents(){
		return studentRepository.findAll();
		
	}
	
	@GetMapping("/{studentid}")
	public Student findStudent  ( @PathVariable Studentid)) {
		
		return studentRepository.findById(  Studentid));
	}
	
	@GetMapping("/find/{name}")
	public List<Student> findStudentContoiningByName(@PathVariable String name){
		return  studentRepository.findByNameContaing(name);
	}
	
	@GetMapping("/search/{price}")
	public List<Student> findCourseLessThan(@PathVariable  double fee){
		return  studentRepository.findByFeeLessThan(fee);
	
	}
}
	
	
	
	
	
	
	

