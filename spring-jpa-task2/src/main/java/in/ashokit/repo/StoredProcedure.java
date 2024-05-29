package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.StoredProceder;
@Repository
public interface StoredProcedure extends JpaRepository<StoredProceder,Integer> {
	
	

}
