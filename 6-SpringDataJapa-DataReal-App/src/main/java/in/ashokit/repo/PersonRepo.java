package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.Entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {

}
