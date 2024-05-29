package in.ashokit.entity;

import jakarta.persistence.Entity;

@Entity
public class Student {
	private Integer sid;
	private String sname;
	private Double sfee;
	
	public Student() {
		
	}
	public Student(Integer sid,String sname,Double sfee) {
		this.sid=sid;
		this.sname=sname;
		this.sfee=sfee;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getSfee() {
		return sfee;
	}
	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}

}
