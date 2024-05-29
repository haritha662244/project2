package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private Integer pid;
	private String name;
	private Double price;
	
	//when the record is insert into  the table that created a date  value populated based date
	
	@Column(updatable=false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	
	
	//when the record is update into  the table that created a date  value populated based date
	
	@Column(insertable=false)
	@UpdateTimestamp
	private LocalDate updateDate;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", createdDate=" + createdDate
				+ ", updateDate=" + updateDate + "]";
	}

}
