package in.ashokit;

public class Book {
	private Integer book_id;
	private String book_name;
	private Integer book_price;
	public Book() {
		
	}
	public Book(Integer book_id,String book_name,Integer book_price) {
		  this.book_id=book_id;
		  this.book_name=book_name;
		  this.book_price=book_price;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Integer getBook_price() {
		return book_price;
	}
	public void setBook_price(Integer book_price) {
		this.book_price = book_price;
	}
	@Override
	public String toString() {
		return  "Book [book_id="+book_id+",book_name="+book_name+",book_price="+book_price+"]";
	}
	

}
