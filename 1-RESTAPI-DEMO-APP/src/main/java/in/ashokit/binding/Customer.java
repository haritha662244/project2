package in.ashokit.binding;

public class Customer {
	private Integer cid;
	private String cname;
	private String email;
	
	public Customer() {
		
	}
	public Customer(Integer cid, String cname, String email) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
