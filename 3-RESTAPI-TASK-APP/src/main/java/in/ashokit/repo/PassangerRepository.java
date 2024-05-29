package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.binding.Passanger;
@Repository
public interface PassangerRepository extends JpaRepository<Passanger,String> {

}
