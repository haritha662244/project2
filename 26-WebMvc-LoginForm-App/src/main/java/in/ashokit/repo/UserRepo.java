package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.User;
import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	     // this line to retrieve the record based on the given  email id  ,pwd
	    public User findByEmailAndPwd(String email,String pwd);

}
