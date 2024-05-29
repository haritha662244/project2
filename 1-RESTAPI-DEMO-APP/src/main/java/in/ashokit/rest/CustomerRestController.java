package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;

@RestController
public class CustomerRestController {
	@GetMapping(value="/customers" ,produces="application/json   ")
	public ResponseEntity<List<Customer>>getCustomers() {
		Customer c1= new Customer(1,"siva","siva2@gmail.com");
		Customer c2= new Customer(2,"Pandu","Pandu2@gmail.com");
		Customer c3= new Customer(3,"murali","murali2@gamil.com");
		List<Customer> list=Arrays.asList(c1,c2,c3);
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/customer")
	public ResponseEntity<Customer> getCustomer() {
		Customer c= new Customer(1,"siva","siri2@gmail.com");
		return new ResponseEntity<>(c,HttpStatus.OK);
	}

}
