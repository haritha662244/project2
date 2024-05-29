package in.ashokit;

import org.hibernate.service.internal.ProvidedService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		
		
		ProductService service=context.getBean(ProductService.class);
		//service.saveProduct();
		//service.getProduct();
		
		service.getProductSpecification("Samsung",5000.00,20000.00);//null/30000/50000
	}

}
//o/p=>id=6
//name ap
//price=> 50000.00
//category=mobiles
//============================
//id=8
//oppo
//price40000.00
//category=moiles
