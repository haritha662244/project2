package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	
	Student saveStudent(Student student); 
		
	}


