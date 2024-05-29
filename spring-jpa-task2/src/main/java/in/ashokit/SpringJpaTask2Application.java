package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.PersonService;

@SpringBootApplication
public class SpringJpaTask2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringJpaTask2Application.class, args);
	
		 StoredService StoredService=context.getBean(StoredService.class);
		  
		  StoredService.savePerson();
	
	
	
	}

}
