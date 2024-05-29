package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxct =
				SpringApplication.run(Application.class, args);
		
		ProductService bean=cxct.getBean(ProductService.class);
		
		bean.saveProduct();
	
		
	
	}

}
