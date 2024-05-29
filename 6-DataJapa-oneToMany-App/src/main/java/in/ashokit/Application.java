package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		EmpService bean = context.getBean(EmpService.class);
		
		//bean.saveEmployee();
		
		//get emp method is which type of table created(or)
		//one to many annotations is only parent table created
		//this method is only emp _tbl is created(or)
		//fetch type method is a eager lady method will be allow
		//  fetch type  is join query is created  or executed and both table is created
		
	    
		//bean.getEmp();
		
		//bean.getAddress();
		
		bean.deleteEmp();
	}

}
