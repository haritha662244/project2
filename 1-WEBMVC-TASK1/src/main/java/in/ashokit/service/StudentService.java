package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.entity.StudentEntity;
import in.ashokit.repo.StudentRepository;
@Service
public abstract class StudentService {
	@Autowired
	   private StudentRepository studentRepository;
	   public List<StudentEntity> getAllStudents()
		   
	   }
		   
}
		 

	


