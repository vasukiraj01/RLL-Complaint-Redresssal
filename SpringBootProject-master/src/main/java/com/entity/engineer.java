package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="feedback")
public class engineer {
	@Override
	public String toString() {
		return "engineer [id=" + complaintid + ", status=" + status  + "]";
	}

	
	private int complaintid;
	private String status;
	
	
	public engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public engineer(int complaintid, String status) {
		super();
		this.complaintid = complaintid;
		this.status = status;
		
	}
	
	
}
