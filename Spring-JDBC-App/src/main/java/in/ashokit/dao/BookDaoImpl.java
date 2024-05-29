package in.ashokit.dao;

import java.awt.print.Book;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.main.MyObjectMapper;

public class BookDaoImpl  implements BookDao {
	
  private JdbcTemplate jdbcTemplate;
  
  public  BookDaoImpl( JdbcTemplate jdbcTemplate) {
	  
    this. jdbcTemplate= jdbcTemplate;
}

public boolean Save() {
	
	String sql="INSERT INTO book values(1,'java',1000)(2,'spring',3000)";
	
	jdbcTemplate.execute(sql);
	
	 return true;
   }

   @Override
   public List<Book>FindByid(){
	   
   String sql1="select*from book where book_id=2";
   
   return jdbcTemplate.query(sql1,new MyObjectMapper());
   
  }
   
  @Override
  public List<Book>FindAll(){
  String sql="select*from book ";
  return jdbcTemplate.query(sql,new MyObjectMapper());
  
  }
  
  @Override
  public boolean Update() {
	  String sql="update book set book_price=1500 where book_id=1";
	  jdbcTemplate .update(sql);
	  return  true;
  }
  
}  
  
  
  