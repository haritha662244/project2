package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Course;
import in.ashokit.entity.Student;
@Repository
public interface CourseRepository  extends JpaRepository<Course,Integer>{

	
	List<Course>findByFeeLessThan(double fee);
	
}
