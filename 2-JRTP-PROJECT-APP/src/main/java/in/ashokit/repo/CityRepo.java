package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<CityRepo,String> {
	
 public CityRepo findByEmail(String email);
	
	

}