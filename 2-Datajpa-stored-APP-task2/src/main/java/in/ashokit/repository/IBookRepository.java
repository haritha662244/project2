package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Book;
@Repository
public interface IBookRepository  extends JpaRepository<Book,Integer>{
	
	
	//use procedure name as the method name
	@Procedure
	 int get_count_of_books(String author);
	
	
	
	
	//using @Proceduer  with different method name
	//use attributes name to pass procedureName
	
	@Procedure(procedureName="get_count_of_books")
	int getBookCount(String author);
	
	
	//using @NamedStroedprocedureQuery annotations
	
	@Procedure(name="getBookCountByAuthor")
     int   getCountByAuthor(@Param("auth")String author);
	
	
	// using @query annotations 
	@Query(value=" call get _books_by_author(:author)",nativeQuery=true)
	List<Book>getBookListByAuth(@Param("auth")String author);
}
