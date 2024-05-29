package in.ashokit.service;

import in.ashokit.repo.BookRepo;

public class BookService {

    private BookRepo bookRepo;
    
    public void Book() {
  	  
    }
    
    public BookService( BookRepo bookRepo) {
   	 this.bookRepo=bookRepo;

}
public void saveBook() {
	 
	 System.out.println("Imple class:"+bookRepo.getClass().getName());
	 
	 Book book= new Book();
	 book.setbid(101);
	 book.setbname("English");
	 book.setEsalary(2000.30);
	 
	//inserting record based on given object
	  bookRepo.save(book);//upsert method
	  
	  System.out.println("Record saved.....");//polimorphism method
}
}