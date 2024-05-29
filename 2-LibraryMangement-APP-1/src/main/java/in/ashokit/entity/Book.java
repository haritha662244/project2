package in.ashokit.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BookId;
    private String bookName;
    private String authorName;
    private LocalDate IssuedDate;
    private LocalDate ExpiryDate;
   
    
    public Long getBookId() {
		return BookId;
	}
	public void setBookId(Long bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public LocalDate getIssuedDate() {
		return IssuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		IssuedDate = issuedDate;
	}
	public LocalDate getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		ExpiryDate = expiryDate;
	}
	
  
//    @Column(name = "publication_date")
//    private Date publicationDate;
//    private String isbn;
    
    
	
}
