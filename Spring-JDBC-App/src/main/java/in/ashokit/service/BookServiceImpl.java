package in.ashokit.service;

import java.util.List;

import in.ashokit.Book;
import in.ashokit.dao.BookDao;




public class BookServiceImpl  implements BookService{
	
	private BookDao bookdao;
	
	public void getBookDao( BookDao bookDao) {
		this.bookdao=bookdao;
	}
	
	@Override
	public boolean Savebook() {
		
		boolean status=bookdao.Save();
		if(status) {
			System.out.println(" Inserted sucessfull..... ");
		}else {
			System.out.println("Insertions failed");
		}
		return true;
	}
	

	@Override
	public boolean FindByid() {
		
      List<Book> FindByid=bookdao.FindByid();
	
		if(FindByid!=null) {
			System.out.println(FindByid.get(0));
		}else {
			System.out.println("no records found");
		}
		return true;
	}
	
     @Override
	public boolean Update() {
		boolean status3=bookdao.Update();
		if(status3) {
			System.out.println("update successfully");
		}else {
			System.out.println("update failed");
		}
		return true;
	}
	

	public List<Book>FindAll(){
		
		List<Book> records=bookdao.FindAll(){
			records.forEach(e->System.out.println(e));
			System.out.println("Retrieve all");
		}
			return records;	
		
		
	}

		
	}


