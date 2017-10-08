package niit.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table
public class User implements Serializable{
	private static final long serialVersionUID=1L;
			@Id
			int useId;
			private String email;
	        private String name;
	        
	      public int getUseId() {
				return useId;
			}
			public void setUseId(int useId) {
				this.useId = useId;
			}
		public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getPhno() {
				return Phno;
			}
			public void setPhno(int phno) {
				Phno = phno;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getRole() {
				return role;
			}
			public void setRole(String role) {
				this.role = role;
			}
			public String getCountry() {
				return country;
			}
			public void setCountry(String country) {
				this.country = country;
			}
			private int Phno;
	        private String address;	
	        private String role;
	        private String country;
	       
}
