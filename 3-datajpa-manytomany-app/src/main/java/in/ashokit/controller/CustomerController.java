package in.ashokit.controller;

import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Customer;
import in.ashokit.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/manyToMany")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
    //fetch all kosam e method use chasm
	@GetMapping("/fetchALL")
	public List<Customer> fetchALL(){
		return service.fetchAll();
	}
}
