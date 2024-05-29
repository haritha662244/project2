package in.ashokit.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CUSTOMERTABLE")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private String email;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY, targetEntity=Product.class)
	
	@JoinTable(name="CUSTOMERPRODUCTTABLE",joinColumns= {
			@JoinColumn(name="customer_id",referencedColumnName="customer_id")
			
	},
	inverseJoinColumns= {
			@JoinColumn(name="product_id",referencedColumnName="productId")}
	
			)
	private Set<Product> products;
	
	public Customer() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Customer(Integer id, String name, String email, Set<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.products = products;
	}
	

}
