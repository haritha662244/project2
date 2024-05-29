package in.ashokit.entity;
import java.time.LocalDate;

import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Counsellore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer counselloreId;
	private String name;
	private String email;
	private String pwd;
	private Long phno;
	
	
	public Integer getcounselloreId() {
		return counselloreId;
	}

	public void setcounselloreId(Integer counselloreId) {
		this.counselloreId = counselloreId;
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

	public  String getpwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
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

	public List<Enquiry> getEnqueries() {
		return enqueries;
	}

	public void setEnqueries(List<Enquiry> enqueries) {
		this.enqueries = enqueries;
	}

	@CreationTimestamp
	private LocalDate createDate;
	
	@UpdateTimestamp
	private LocalDate updateDate;
	
	//many to relationship
	@OneToMany(mappedBy = "counsellore" ,cascade=CascadeType.ALL)//default fetchtype=lazy
	private List<Enquiry> enqueries;


	@Override
	public String toString() {
		return "Counsellore [counselloreId=" + counselloreId + ", name=" + name + ", email=" + email + ", pwd=" + pwd
				+ ", phno=" + phno + ", createDate=" + createDate + ", updateDate=" + updateDate + 
				"]";
	}
	}

	




