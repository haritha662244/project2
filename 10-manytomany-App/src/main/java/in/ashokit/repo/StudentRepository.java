  package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Course;
import in.ashokit.entity.Student;
@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {

	
	List<Student>findById(Student id);
	  List<Student>findByNameContaing(String name);

	//List<Student> findByFeeLessThan(double fee);
	//List<Student> findByFeeLessThan(double fee);
	//List<Student> findByFeeLessThan(double fee);
	List<Student> findByFeeLessThan(double fee);
}
