package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.CityEntity;
import in.ashokit.entity.UserEntity;
import jakarta.persistence.Entity;
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
	
	public UserEntity findByEmail(String email);

	public UserEntity findByEmailAndPwd(String email, String pwd);

}
