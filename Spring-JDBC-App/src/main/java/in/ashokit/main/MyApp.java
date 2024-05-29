package in.ashokit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.service.BookService;
import in.ashokit.service.BookServiceImpl;

public class MyApp {

	public static void main(String[] args) {
    
    		 ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
    		 
     
     
        BookServiceImpl myService=Context.getBean(BookServiceImpl.class);
        
        myService.Savebook();
        myService.FindByid();
        myService.Update();
        myService.FindAll();
     
	}

}
