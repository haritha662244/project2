package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.dao.UserDao;
import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		   // System.out.println(context.getClass().getName());
		   // System.out.println(context.getBeanDefinitionCount());
		//UserDao dao = context.getBean(UserDao.class);
		//String findName = dao.findName(100);
		
		//System.out.println(findName);
		
		UserService service = context.getBean(UserService.class);
		service.getName(100);
	}

}
