package com.controller;

import java.util.Optional;

import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.manager;
import com.example.demo.RestApi.Exception.EngineerNotFoundException;
import com.example.demo.RestApi.Exception.ManagerNotFoundException;
import com.entity.Admin;
import com.entity.EngineerDetails;
import com.entity.ManagerDetails;
import com.dao.AdminRepo;
import com.dao.EngineerRepo;
import com.dao.ManagerRepo;
import com.entity.complaint;
import com.entity.engineer;
import com.service.AppService;
import com.dao.MyRepo;

@RestController
public class MyRestApp {
	@Autowired
	private ManagerRepo managerrepo;

	@Autowired
	private EngineerRepo engineerrepo;
	
	@Autowired
	private AdminRepo adminrepo;
	//Admin 
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Admin")
	public Iterable<Admin> getAdmin() {
	
		return adminrepo.findAll();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Admin")
	public Admin create(@RequestBody Admin admin) {
		return adminrepo.save(admin);
	}

	// Manager
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Manager")
	public Iterable<ManagerDetails> getManager() {
		return managerrepo.findAll();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Manager/{id}")
	public ManagerDetails getManager(@PathVariable("id") Integer id) {
		Optional<ManagerDetails> optManager = managerrepo.findById(id);
		if (optManager.isEmpty()) {
			throw new ManagerNotFoundException(id);
		}
		return optManager.get();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Engineer/{id}")
	public EngineerDetails getAdmin(@PathVariable("id") Integer id) {
		Optional<EngineerDetails> optAdmin = engineerrepo.findById(id);
		if (optAdmin.isEmpty()) {
			throw new EngineerNotFoundException(id);
		}
		return optAdmin.get();
	}

	// Engineer
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Engineer")
	public Iterable<EngineerDetails> getEngineer() {
		return engineerrepo.findAll();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Manager")
	public ManagerDetails create(@RequestBody ManagerDetails manager) {
		return managerrepo.save(manager);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Engineer")
	public EngineerDetails create(@RequestBody EngineerDetails engineer) {
		return engineerrepo.save(engineer);
	}


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
	//public String userRegister2(@RequestParam(required=false,name="name") String name, @RequestParam(defaultValue="10",name="phonenumber") int phonenumber, @RequestParam(required=false,name="email") String email, @RequestParam(required=false,name="complaint1") String complaint1) {
	public String userRegister2(@RequestParam(required=false,name="name") String name, @RequestParam("phonenumber") int phonenumber, @RequestParam("email") String email, @RequestParam("complaint1") String complaint1) {
		
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

