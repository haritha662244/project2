package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

}
