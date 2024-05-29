package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{
 
	@Procedure(name="getUserById")
	User getUserById(Integer UserId);
	
}
