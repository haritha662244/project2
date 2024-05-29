package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.binding.User;


public interface UserRepository extends JpaRepository<User,Serializable> {

}
