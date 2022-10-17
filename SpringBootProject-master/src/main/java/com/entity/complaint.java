package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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

	@Id @GeneratedValue
	private int id;
	private String name;
	private int phonenumber;
	private String email;
	private String complaint1;
	
	
	
	
	
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
