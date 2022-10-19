package com.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trial.entity.Customer;
import com.trial.entity.User;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByUser(User user);

}
