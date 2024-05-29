package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StoredProceder {
	
	@Id
	private long id;
	private String name;
	
	
	
	public long getid() {
		return id;
	}
	public void setid(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
