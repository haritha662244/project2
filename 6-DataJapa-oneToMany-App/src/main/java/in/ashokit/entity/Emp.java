package in.ashokit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Emp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//it will be Auto  generated in the  DB table
	private Integer eId;
	private String Ename;
	private Double esal;
	
	//you can store in address table
	@OneToMany(mappedBy = "emp",cascade=CascadeType.ALL)  
			//fetch=FetchType.EAGER
	private  List<Address> addrList;
	public Integer geteId() {
		return eId;
	}


	public void seteId(Integer eId) {
		this.eId = eId;
	}


	public String getEname() {
		return Ename;
	}


	public void setEname(String ename) {
		Ename = ename;
	}


	public Double getEsal() {
		return esal;
	}


	public void setEsal(Double esal) {
		this.esal = esal;
	}


	public List<Address> getAddrList() {
		return addrList;
	}


	public void setAddrList(List<Address> addrList) {
		this.addrList = addrList;
	}



}
