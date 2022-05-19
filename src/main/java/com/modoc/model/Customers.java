package com.modoc.model;



	import java.io.Serializable;

	import java.util.Collection;
	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
//	import javax.validation.constraints.Pattern;
//	import javax.validation.constraints.Size;

	/**
	 * User entity
	 * 
	 * @author admin
	 */
	@Entity
	@Table(name = "customers")
	public class Customers implements Serializable {

		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private Integer userId;
		

		@Column(name = "fname")
	//	@Size(min = 5, max = 30, message = "This is required field min 5 symbols")
		private String fname;
		@Column(name = "surname")
	//	@Size(min = 5, max = 30, message = "This is required field min 5 symbols")
		private String surname;
		@Column(name = "middlename")
		private String middlename;
		
		@Column(name = "username")
		//	@Size(min = 5, max = 30, message = "This is required field min 5 symbols")
			private String username;
	

		@Column(name = "password")
		//	@Size(min = 5, max = 50, message = "This is required field and min 5 symbols")
			private String password;
		
		@Column(name = "mobile")
		private String mobile;
//	private int mobile;	
		@Column(name = "email")
		//	@Size(min = 3, max = 30, message = "This is required field")
		//	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "valid email formate only")
			private String email;
		@Column(name = "gender")
		private String gender;
		
		@Column(name = "address") 
		private String address;
		@Column(name = "pincode")
		private Integer pincode;
		

		
		
		@OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
		private Collection<Contacts> contactsCollection;

		public Customers() {
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}


		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getMiddlename() {
			return middlename;
		}

		public void setMiddlename(String middlename) {
			this.middlename = middlename;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
		
		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
//		public Integer getMobile() {
//			return mobile;
//		}
//
//		public void setMobile(Integer mobile) {
//			this.mobile = mobile;
//		}
		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
	
/*
		public int getMobile() {
			return mobile;
		}

		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
*/
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Integer getPincode() {
			return pincode;
		}

		public void setPincode(Integer pincode) {
			this.pincode = pincode;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Collection<Contacts> getContactsCollection() {
			return contactsCollection;
		}

		public void setContactsCollection(Collection<Contacts> contactsCollection) {
			this.contactsCollection = contactsCollection;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((contactsCollection == null) ? 0 : contactsCollection.hashCode());

			result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		
			result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		
			result = prime * result + ((middlename == null) ? 0 : middlename.hashCode());
			result = prime * result + ((username == null) ? 0 : username.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
			result = prime * result + ((gender == null) ? 0 : gender.hashCode());
			result = prime * result + ((userId == null) ? 0 : userId.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customers other = (Customers) obj;
			if (contactsCollection == null) {
				if (other.contactsCollection != null)
					return false;
			} else if (!contactsCollection.equals(other.contactsCollection))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (middlename == null) {
				if (other.middlename != null)
					return false;
			} else if (!middlename.equals(other.middlename))
				return false;
			
			if (username == null) {
				if (other.username != null)
					return false;
			} else if (!username.equals(other.username))
				return false;
			
			if (gender == null) {
				if (other.gender != null)
					return false;
			} else if (!gender.equals(other.gender))
				return false;
			/*
			if (mobile == null) {
				if (other.mobile != null)
					return false;
			} else if (!mobile.equals(other.mobile))
				return false;
			*/
			if (pincode == null) {
				if (other.pincode != null)
					return false;
			} else if (!pincode.equals(other.pincode))
				return false;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			
			
			if (fname == null) {
				if (other.fname != null)
					return false;
			} else if (!fname.equals(other.fname))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (surname == null) {
				if (other.surname != null)
					return false;
			} else if (!surname.equals(other.surname))
				return false;
			if (userId == null) {
				if (other.userId != null)
					return false;
			} else if (!userId.equals(other.userId))
				return false;
			return true;
		}

		@Override
		public String toString() {
		/*
			return "Users [userId=" + userId + ", fname=" + fname + ", surname=" + surname + ", middlename=" + middlename
					+ ", gender=" + gender+",mobile=" + mobile+",address=" + address+",pincode=" + pincode+","
							+ " email=" + email + ", password=" + password + ",username="+ username + ",contactsCollection=" + contactsCollection + "]";
		*/
			return "Customers [userId=" + userId + ", fname=" + fname + ", surname=" + surname + ", middlename=" + middlename
					+ ", gender=" + gender+",address=" + address+",pincode=" + pincode+","
							+ " email=" + email + ", password=" + password + ",username="+ username + ",contactsCollection=" + contactsCollection + "]";
				
		}
		
	
		public Customers(Customers customer) {
			this.email=customer.getEmail();
			this.password=customer.getPassword();
		}
	
		
		


	}

