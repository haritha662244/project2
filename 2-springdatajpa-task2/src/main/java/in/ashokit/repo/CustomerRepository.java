package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer>{
	//procedure call cheyadam kosam
	
	@Procdure (ProcedureName=)
	  public int getcount();
	
	@Procdure (ProcedureName=)
	public int get AgeProc(int customerid);
	  
	  
	
	

}
