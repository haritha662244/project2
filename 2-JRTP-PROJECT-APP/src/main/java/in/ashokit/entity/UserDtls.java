package in.ashokit.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User_management")
public class UserDtls {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uname;
    private String email;
     private Long phno;
     
     @ManyToOne
     private City city;
   
   public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getState() {
		// TODO Auto-generated method stub
		return null;
	}
   

}