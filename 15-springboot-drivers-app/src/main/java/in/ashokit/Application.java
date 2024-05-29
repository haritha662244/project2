package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.ashokit.entities.ContactsMasterEntity;
import com.ashokit.repositories.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cxtc = SpringApplication.run(Application.class, args);
		
		ContactsMasterRepo bean=cxtc.getBean(ContactsMasterRepo.class);
		
		ContactsMasterEntity entity=new ContactsMasterEntity();
		
		 entity.setContatcId(101);
		 entity.setContectName("Hajeer");
		 entity.setContectNumber(896754849);
		 
		 bean.save(entity);
		
		cxtc.close();
		
	}

}
