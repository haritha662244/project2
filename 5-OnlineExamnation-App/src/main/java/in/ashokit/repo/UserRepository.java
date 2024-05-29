package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
     public User findByUsername(String username);
}
