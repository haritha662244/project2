package com.ashokit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class ContactsMasterEntity {
	@Id
	private Integer contactId;
	
	private String contactName;
	
	private Long contactNumber;
	
	private double contactsalary;
	
	public  Integer getContactId() {
		
	  return contactId;
	}
	public void setContatcId(Integer contactId) {
		 this.contactId=contactId;
	}
	public String getcontactName() {
		return contactName;
	}
	public void setContectName(String contactName) {
		this.contactName=contactName;
	}
	
	public Long getcontactNumber() {
		return contactNumber;
	}
	
	public void setContectNumber(long contactNumber) {
		this.contactNumber=contactNumber;

	}
	   @Override
	   public String toString() {
		   return "contact [contactId="+contactId+",contactName="+contactName+",contactNumber="+contactNumber+"]";
	   }
}