package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.manager;

import com.entity.complaint;
import com.entity.engineer;
import com.service.AppService;
import com.dao.MyRepo;

@RestController
public class MyRestApp {

	@Autowired
	private AppService service;

		
	@PostMapping("/manager")
	public String userRegister(@RequestParam("complaintid") int complaintid, @RequestParam("assignee") String assignee) {
	manager f = new manager (complaintid, assignee);
	boolean data= service.addmanager(f);
	if(data) {
		return "assignee added succesfully!";
	}
	else {
		return "Unable to add the assignee";
	}
	}
	@PostMapping("/engineer")
	public String userRegister1(@RequestParam("complaintid") int complaintid, @RequestParam("status") String status) {
	engineer f = new engineer(complaintid, status);
	boolean data= service.addengineer(f);
	if(data) {
		return "Complain assigned succesfully!";
	}
	else {
		return "Unable to add the assinee";
	}
		
	}
	@PostMapping("/complaint")
	public String userRegister2(@RequestParam(required=false,name="name") String name, @RequestParam(defaultValue="10",name="phonenumber") int phonenumber, @RequestParam(required=false,name="email") String email, @RequestParam(required=false,name="complaint1") String complaint1) {
	complaint f = new complaint(name, phonenumber, email,complaint1);
	boolean data= service.addcomplaint(f);
	if(data) {
		return "complaint added succesfully!";
	}
	else {
		return "Unable to add the complaint";
	}
		
	}
}

