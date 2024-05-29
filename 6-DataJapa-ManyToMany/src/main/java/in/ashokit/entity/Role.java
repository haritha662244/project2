package in.ashokit.entity;

import java.util.List;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;




@Entity
@Data
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;
	private String roleName;

	@ManyToMany(mappedBy = "roles")
	private List<User> users;

	public void setRoleName(String string) {
		// TODO Auto-generated method stub
		
	}

	}



