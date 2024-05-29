package in.ashokit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.service.IBookService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		
		
	}
	
	@Autowired
	private IBookService bookservice;
	
	
	//@Override
	public void run(String ...args) throws Exception{
		 int total =bookservice.getcountofbooks("Robin");
		System.out.println(total);
		
		
      total =bookservice.getBookCount("Robin");
		System.out.println(total);
		
		
	  total =bookservice.getCountByAuthor("Robin");
			System.out.println(total);
				
				
				
				
	  total =bookservice.getcountofbooks("Robin");//named  query
			System.out.println(total);
					
					
     List<Book> books =bookservice.getBookListByAuth("Robin");
			books.forEach(System.out::println);
		
	}

}
