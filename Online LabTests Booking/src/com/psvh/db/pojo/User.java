package com.psvh.db.pojo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity @Table(name="Users")
public class User {
	
	@EmbeddedId
	private UserPk pk;
	@Column(length=30)
	private String name;
	@Column(length=50)
	private String email;
	@Column(length=10)
	private Long phoneNumber;
	@Column(length=20)
	private String password;
	@Column(length=3)
	private int age;
	@Column(length=6)
	private String gender;
	
	public User() {}
	
	public User(String name, String email, Long phoneNumber, String password, int age, String gender, String username) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.age = age;
		this.gender = gender;
		pk = new UserPk(username);
	}

	
	public UserPk getPk() {
		return pk;
	}
	public void setPk(UserPk pk) {
		this.pk = pk;
	}
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
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
