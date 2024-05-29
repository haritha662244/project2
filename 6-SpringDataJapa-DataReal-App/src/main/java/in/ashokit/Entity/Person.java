package in.ashokit.Entity;

import org.hibernate.annotations.GeneratedColumn;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_tbl")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer personId;
	private String Name;
	private  String gender;
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;
	

	
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	
	

}
