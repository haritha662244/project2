package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Counsellore;
@Repository
public interface CounselloreRepository extends JpaRepository<Counsellore, Integer> {
	
 public Counsellore findByEmailAndPwd(String email,String pwd);
 // if the email is alrady counsellore is registered i should  not allowed them to register
 public  Counsellore findByEmail(String email);
}
