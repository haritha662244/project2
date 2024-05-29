package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Employee")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    private String email;
     
    private String password;
     
}
