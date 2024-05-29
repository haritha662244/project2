package in.ashokit.entity;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//
//import org.hibernate.annotations.ManyToAny;
//
//import lombok.Data;
//
import jakarta.persistence.JoinTable;





@Data
@Entity
public class User {
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String username;
	private LocalDate userDob;
	private String gender;
	
	@ManyToAny(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(
			name="user_roles",
			joinColumns = {
		        @JoinColumn(name = "user_id")
		    },
		    inverseJoinColumns = {
		        @JoinColumn(name = "role_id")
		    }
	)
	private List<Role> roles;

}
