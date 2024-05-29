package in.ashokit.dao;

import java.awt.print.Book;
import java.util.List;

public interface BookDao {
	public boolean Save();
    public List<Book> FindByid();
    public List<Book> FindAll();
	public boolean Update();
}
