package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;
@Service
public class StudentServiceImpl   implements StudentService{

	@Autowired
	private StudentRepository studentService;
	
	@Override
	public List<Student> getAllStudent() {
	return studentService.findAll();
	
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return  studentService.save(student);
	}
    	

}
