package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Customer;
import in.ashokit.repository.CustomerRepository;
import in.ashokit.repository.ProductRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	public CustomerService(CustomerRepository customerRepository, ProductRepository productRepository) {
		super();
		this.customerRepository = customerRepository;
		this.productRepository = productRepository;
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> fetchAll(){
		return customerRepository.findAll();
		
	}

	
}
