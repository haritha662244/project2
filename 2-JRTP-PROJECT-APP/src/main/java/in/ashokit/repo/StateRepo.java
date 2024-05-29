package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepo extends JpaRepository<StateRepo,String> {
	
	StateRepo findByEmail(String email);

}