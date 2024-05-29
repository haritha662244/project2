package in.ashokit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	//public Student findByEmailAndPassword(String email, String password);

	public Optional<Student> findById(Integer studentId);

	public Student findByEmailAndPassword(String email, String password);

}