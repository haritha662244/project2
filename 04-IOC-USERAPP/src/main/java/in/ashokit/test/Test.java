package in.ashokit.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokitservice.UserService;

public class Test {
	public static void main(String[] args) {
         ClassPathXmlApplicationContext cxct=new ClassPathXmlApplicationContext("beans.xml");
          UserService service= cxct.getBean(UserService.class);
    // System.out.println ( service.getClass().getName());
     String name=service.getName(100);
     System.out.println("User Name::"+name);
     
     
}
}