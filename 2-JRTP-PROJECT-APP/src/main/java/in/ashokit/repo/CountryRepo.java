package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo  extends JpaRepository<CountryRepo,String> {
	
	CountryRepo findByEmail(String email);

}