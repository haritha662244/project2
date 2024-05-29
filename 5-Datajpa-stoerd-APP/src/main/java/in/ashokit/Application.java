package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit;
import in.ashokit.service.CustomerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		CustomerService  service= (CustomerService) context.getBean("CustomerService.class");
		
//		System.out.println(service.getCount());
//		
//		System.out.println("Customer age............");
//		
//		System.out.println(service.getAgeProc(4));
		
		List<Customer> customerList= service.getAllCustomer();
		for(Customer customer : customerList) {
			System.out.println(customer);
		}
		
	}

}
