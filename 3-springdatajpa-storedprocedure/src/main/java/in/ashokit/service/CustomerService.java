package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public Integer getCustomerCount() {
		return CustomerRepository.fetchCustomerCount();
	}
	
	public String getCustomerEmail(Integer id) {
		 String email= customerRepository.fetchCustomerEmail(id);
		 System.out.println(email);
		 return email;
	}
	
	public Integer FetchCustomerCountProcedure() {
		return customerRepository.fetchCustomerCountProcedure();
	}
	
	public  String fetchCustomerEmailProcedure(Integer id) {
		return customerRepository.fetchCustomerEmailProcedure(id);
	}
	
	

}
