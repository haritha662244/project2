package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQuery(
		name="getBookCountByAuthor",
		procedureName="get_count_of_books",
		parameters= {
				@StoredProcedureParameter(mode=ParameterMode.IN,name="auth",type=String.class),
				@StoredProcedureParameter(mode=ParameterMode.OUT,name="total",type=Integer.class),
				//@StoredProcedureParameter(mode=ParameterMode.IN,name="auth",type=String.class),
		}
		
		
		)

public class Book {
	
	@Id
	private Integer Bookid;
	private String name;
	private double price;
	private  String author;
	private String category;
	 public Book() {
		 super();
	 }
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", name=" + name + ", author=" + author + ", price=" + price + ", category="
				+ category + "]";
	}
	public Integer getBookid() {
		return Bookid;
	}
	public void setBookid(Integer bookid) {
		Bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
