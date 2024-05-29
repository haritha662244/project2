package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student1")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer sid;
	private  String name;
	private   String email;
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + "]";
	}
    
	}

