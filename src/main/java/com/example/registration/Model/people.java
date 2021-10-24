package com.example.registration.Model;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="people")
public class people {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "birthday")
	private String birthday;
	@Column(name = "gender")
	private String gender;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "password")
	private String password;
	private String password_confirmation;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	public String getPassword_confirmation() {
		return password_confirmation;
	}
	public void setPassword_confirmation(String password_confirmation) {
		this.password_confirmation = password_confirmation;
	}
}
