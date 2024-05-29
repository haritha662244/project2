package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;

public class StudentService {
	
	private StudentRepository studentRepo;
	
	public StudentService(StudentRepository repo) {
		this.studentRepo=repo;
	}
	
	public void GetAllStudents() {
		
		  List<Student> students = studentRepo.findAll();
		  students.forEach(s->System.out.println(s));
	}
	
	

}
