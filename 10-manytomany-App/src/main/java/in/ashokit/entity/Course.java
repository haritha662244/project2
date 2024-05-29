package in.ashokit.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="COURSE_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
   private String name;
	//private String title;
	//private String obbrevation;
	//private int modules;
	private double fee;
	
	@ManyToMany(mappedBy="course",fetch=FetchType.LAZY)//Owner entity
	private Set<Student> student;
	

}
