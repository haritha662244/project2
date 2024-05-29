package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.Entity.Passport;

@Repository
public interface PassportRepo extends JpaRepository<Passport,Integer> {

}
