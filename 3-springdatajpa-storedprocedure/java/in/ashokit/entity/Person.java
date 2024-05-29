package in.ashokit.entity;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer pid;
	 private String name;
	 private String gender;
	 private Date dob;
	 
	 @Lob
	 private byte[] photoImage;
	 @Lob
	 private byte[] resumePdf;
	public Integer getId() {
		return pid;
	}
	public void setId(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public byte[] getPhotoImage() {
		return photoImage;
	}
	public void setPhotoImage(byte[] photoImage) {
		this.photoImage = photoImage;
	}
	public byte[] getResumePdf() {
		return resumePdf;
	}
	public void setResumePdf(byte[] resumePdf) {
		this.resumePdf = resumePdf;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", photoImage="
				+ Arrays.toString(photoImage) + ", resumePdf=" + Arrays.toString(resumePdf) + "]";
	}
	}

