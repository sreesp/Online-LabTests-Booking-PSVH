package com.psvh.db.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Embeddable
public class UserPk implements Serializable{
	
	//@Column(name="userid")
	
	@SequenceGenerator(name="seq_UserPk", sequenceName = "sqUserPk", initialValue = 2000, allocationSize=2)
	@GeneratedValue(generator="seq_UserPk", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(length=20)
	private String username;
	
	public UserPk() {}

	public UserPk(String username) {
		super();
		this.username = username;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
