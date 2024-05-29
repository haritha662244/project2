package in.ashokit.binding;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
public class Student {
		@NotEmpty(message="Name is compulsory")
		@Size(min=3,max=8 ,message="min 3 and max 8 chars allowed")
		@NotNull(message="name is mandatory")
		private String name;

		private String email;
		
		private Long phno;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getPhno() {
			return phno;
		}
		public void setPhno(Long phno) {
			this.phno = phno;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", email=" + email + ", phno=" + phno + ", getName()=" + getName()
					+ ", getEmail()=" + getEmail() + ", getPhno()=" + getPhno() + "]";
		}

		
		
		}

