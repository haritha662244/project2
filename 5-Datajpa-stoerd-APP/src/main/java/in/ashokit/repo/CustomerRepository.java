package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


import in.ashokit.entity.CustomerDTO;
@Repository
public interface CustomerRepository  extends JpaRepository<CustomerDTO,Integer>{
	
	@Procedure(procedureName="sample_proc")
	public Integer getCount();
	
	@Procedure(procedureName="CUSTOMER_AGE__PROC")
	public int getAgeProc(int customerId);

}
