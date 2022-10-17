package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.dao.MyRepo2;

@Entity @Table(name="complaint_table")
public class complaint {
	@Override
	public String toString() {
		return "complaint [id=" + id + ", name=" + name + ", phone=" + phonenumber + ", email=" + email
				+"]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int phonenumber;
	private String email;
	private String complaint1;
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComplaint1() {
		return complaint1;
	}

	public void setComplaint1(String complaint1) {
		this.complaint1 = complaint1;
	}

	public complaint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public complaint(String name, int phonenumber, String email ,String complaint1) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.email= email;
		this.complaint1 = complaint1;
		
	}
	
	
}
