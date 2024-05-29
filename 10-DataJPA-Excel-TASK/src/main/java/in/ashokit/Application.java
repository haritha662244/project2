package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	    @Autowired
	    private StudentService studentService;

	    public static void main(String[] args) {
	    	 SpringApplication.run(Application.class, args);

	        
	    }
	    @Override
	    public void run(String...a) {
	        for (int i = 0; i <= 10; i++) {
	            Student student = new Student();
	            student.setStudentName("Student Name");
	            student.setEmail("student@mail.com");
	            student.setMobileNo("XXXXXXXXXX");
	            studentService.addStudent(student);
	        }
	    }
	
	}


