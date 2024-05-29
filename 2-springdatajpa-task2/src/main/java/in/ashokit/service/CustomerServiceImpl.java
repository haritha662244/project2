package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service( "CustomerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Atuowired
	private CustomerRepository customerRepository;
	
	
	
	@Override
	public int getCount() {
		return customerRepositorypo.getCount();
		
		
   @Override
   public int getAgeProc(int customerid) {
	   return cusRepo.getAgeProc(customerid)
   }
		
	}
	}
	

}
