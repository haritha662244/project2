package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Counsellore;
@Repository
public interface CounselloreRepository extends JpaRepository<Counsellore, Integer> {
	
 public Counsellore findByEmailAndPwd(String email,String pwd);
 
 public  Counsellore findByEmail(String email);
}



