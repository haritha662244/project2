package in.ashokit;

import java.security.Provider.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.CustomerService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		

		CustomerService empService = context.getBean(CustomerService.class);
	
		System.out.println(Service.getcount());
		System.out.println(CustomerService.getcount());
		System.out.println(CustomerService.getAgeProc());
		
	}

}
