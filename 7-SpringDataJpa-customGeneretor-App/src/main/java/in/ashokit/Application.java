package in.ashokit;


import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.OrderDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		OrderDetails bean = ctxt.getBean(OrderDetails.class);
		OrderDetails entity= new OrderDetails ();
		entity.setorderBy("AIT1");
		
		entity.setOderPlaceDate(new Date(0));
		OrderDetails  savedEntity = bean.save(entity);
		System.out.println(savedEntity);
		ctxt.close();

	}

}
