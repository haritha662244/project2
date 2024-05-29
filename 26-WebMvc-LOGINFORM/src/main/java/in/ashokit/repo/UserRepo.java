package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.UserDetails;

@Repository
public interface UserRepo extends JpaRepository<UserDetails, Integer> {
	public UserDetails findByMailAndPwd(String email, String pwd);
	// forgot password

}
