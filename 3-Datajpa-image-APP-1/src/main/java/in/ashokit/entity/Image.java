package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity

public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String  description;
	@Lob
   private byte[] image;
	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public void setDecription(String decription) {
		// TODO Auto-generated method stub
		
	}
	public void setImage(byte[] bytes) {
		// TODO Auto-generated method stub
		
	}
	

}
