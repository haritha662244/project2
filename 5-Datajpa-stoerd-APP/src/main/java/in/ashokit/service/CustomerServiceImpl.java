package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.transaction.Transactional;

@Service("CustomerService")
public class CustomerServiceImpl  implements CustomerService{
	
	@Autowired
	private CustomerRepository CustomerRepository;
	
	@Override
	public Integer getCount() {
		return CustomerRepository.getCount();
	}
	
	

	@Override
	public Integer getAgeProc(int customerId) {
		return CustomerRepository.getAgeProc(customerId);
	}
	
	@Override
	@Transactional
	public  List<Customer> getAllCustomers() {
		return  CustomerRepository.findAll();
	}
}
