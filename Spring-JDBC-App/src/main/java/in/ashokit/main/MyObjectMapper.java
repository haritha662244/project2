package in.ashokit.main;

import java.awt.print.Book;

import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;


public class MyObjectMapper implements RowMapper<Book> {
	
	@Override
	public Book RowMapper (Resultset rs,int rowNum) throws SQLException{
		
		Book book= new Book();
		book.book_id(rs.getInt(1));
		book.Book_name(rs.getString(2));
	    book.Book_price(rs.getInt(3));
		return book;
	}

}
