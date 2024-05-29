package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Integer eid;
	private String ename;
	private Double esalary;
	private String eaddress;
	
	
	public Employee() {
		
	}
	public Employee(Integer eid,String ename,Double esalary ,String eaddress) {
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.eaddress=eaddress;
	}


	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ",eaddress="+eaddress+", getEsalary()=" + getEsalary()
				+ ", getEname()=" + getEname() + ", getEid()=" + getEid() + ",getEaddress()="+getEaddress()+"]";
	}

  
} 
  
  
  
  
  
  