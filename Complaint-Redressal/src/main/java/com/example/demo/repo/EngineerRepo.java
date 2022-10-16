package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Engineer;

public interface EngineerRepo extends CrudRepository<Engineer, Integer>{

}
