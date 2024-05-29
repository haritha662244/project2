package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="STUDENT_DTLS")
public class Course {
	@Id
	private  Integer sid;
	private String name;
	private Double marks;
	

}
