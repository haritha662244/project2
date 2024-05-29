package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.UserDtls;

@Repository
public interface UserDtlsRepo extends JpaRepository<UserDtls,String> {
	
	UserDtls findByEmail(String email);

}