package in.ashokit.service;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
	
	public boolean Savebook();
	public boolean FindByid();
	public List<Book> FindAll();
  public boolean Update();

}
