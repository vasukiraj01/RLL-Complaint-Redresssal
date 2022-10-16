package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Manager;

public interface ManagerRepo extends CrudRepository<Manager, Integer>{

}
