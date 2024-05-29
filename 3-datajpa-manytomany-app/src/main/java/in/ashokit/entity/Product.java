package in.ashokit.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCTTABLE")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private String dept;
	private double price;
	
    @ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="Products")
    @JsonBackReference
	private Set<Customer>Customers;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Customer> getCustomers() {
		return Customers;
	}

	public void setCustomers(Set<Customer> customers) {
		Customers = customers;
	}

	public Product(Integer productId, String productName, String dept, double price, Set<Customer> customers) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.dept = dept;
		this.price = price;
		Customers = customers;
	}

	public Product() {
		super();
	
	}
	
	

}
