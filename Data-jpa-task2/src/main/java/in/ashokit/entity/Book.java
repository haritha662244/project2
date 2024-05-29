package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	
	@Id
	private String bid;
	private String bname;
	private double price;
	
	public Book() {
		
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
		
	}
}