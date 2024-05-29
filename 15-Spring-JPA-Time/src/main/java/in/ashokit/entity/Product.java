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
	private String  name;
	private Double price;
	
	
	//what is use of this 2 tables u can  in the code
	
	//use insert in to the table  that created date value  should be  populated  table
	//just insert the record so no record in update date value
	
	@Column(updatable=false)
	@CreationTimestamp
	private LocalDate createDate;
	
	//record is updated  should be populated table
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
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public  String toString() {
		return"Product[pid="+pid+",name="+name+",price="+price+",creatDate="+createDate+",updateDate="+updateDate+"]";
	}
	
	

}
