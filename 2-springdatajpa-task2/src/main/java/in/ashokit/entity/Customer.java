package in.ashokit.entity;

import jakarta.persistence.Entity;

@Entity
public class Customer {
	
	private  Integer cid;
	private String  cname;
	private Integer age;
	private String email;
	
public Customer() {
		
	}
	public Customer(Integer cid,String cname ,Integer age,String email) {
		this.cid=cid;
		this.cname=cname;
		this.age=age;
		this.email=email;
	}
	
	public Integer getcid() {
		return cid;
	}
	public void setcId(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ",age="+age+", getcid()=" + getcid()
		+ ", getcname()=" + getcid() + ", getemail()="  + ",getage()="+"]";
}

	}


