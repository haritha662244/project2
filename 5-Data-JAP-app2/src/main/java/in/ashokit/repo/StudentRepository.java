package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;
//jpa repository is a interface which is curdopretions.
public interface StudentRepository extends JpaRepository<Student,Integer> {
	

}
