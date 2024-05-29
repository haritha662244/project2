package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@NamedStroedProcederQuery(name="Customer.getAge",procedureName="CUSTOMER_AGE_PROC",parameter= {
		@StroedProcedurePameters(mode=parametersMode.IN,name="customerId",type= Integer.class),
		@StroedProcedurePameters(mode=parametersMode.OUT,name="age",type=Integer.class})
		

	

public class Customer {
			@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", email=" + email + ", gender=" + gender + ", PhnoNumber=" + PhnoNumber + "]";
	}

			@Id
			private Integer customerId;
			private String  firstName;
			private String lastName;
			private Integer age;
			private String email;
			private Character gender;
			private Long PhnoNumber;
		
			
			public Customer() {
				super();
			}
			
			public Customer (Integer customerId,String firstName,String lastName,Integer age,String email,
					Character gender, Long PhnoNumber) {
				
				super();
				
				
				this.customerId=customerId;
				
				}	
			
	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Long getPhnoNumber() {
		return PhnoNumber;
	}

	public void setPhnoNumber(Long phnoNumber) {
		PhnoNumber = phnoNumber;
	}
	
	

		
	}
	


