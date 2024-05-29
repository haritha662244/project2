package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
				SpringApplication.run(Application.class, args);
		//System.out.println(ctxt.getClass().getName());
	}

}
