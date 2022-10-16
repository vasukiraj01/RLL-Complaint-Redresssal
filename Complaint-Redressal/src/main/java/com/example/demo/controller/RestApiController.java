package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Engineer;
import com.example.demo.entity.Manager;
import com.example.demo.repo.EngineerRepo;
import com.example.demo.repo.ManagerRepo;
import com.example.demo.RestApi.Exception.ManagerNotFoundException;
import com.example.demo.RestApi.Exception.EngineerNotFoundException;

@RestController
public class RestApiController {

	@Autowired
	private ManagerRepo managerrepo;

	@Autowired
	private EngineerRepo engineerrepo;

	// Manager
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Manager")
	public Iterable<Manager> getManager() {
		return managerrepo.findAll();
	}

	// Engineer
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Engineer")
	public Iterable<Engineer> getEngineer() {
		return engineerrepo.findAll();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Manager")
	public Manager create(@RequestBody Manager manager) {
		return managerrepo.save(manager);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Engineer")
	public Engineer create(@RequestBody Engineer engineer) {
		return engineerrepo.save(engineer);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Manager/Engineer/assign")
	public Manager update(@RequestBody Manager manager) {
		return managerrepo.save(manager);
	}
}
