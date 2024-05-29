package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.PersonService;

@SpringBootApplication
public class SpringJpaTask1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringJpaTask1Application.class, args);
		  
	
		  PersonService personService = context.getBean(PersonService.class);
			personService.savePerson();


	}

}
