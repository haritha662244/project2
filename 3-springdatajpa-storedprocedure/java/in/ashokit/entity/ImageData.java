package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="imageData")
public class ImageData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Long id;
	private String name;
	private String type;
	
	@Lob
	@Column(name="imagedata", length=1000)
	private byte[] imageData;
	

}
