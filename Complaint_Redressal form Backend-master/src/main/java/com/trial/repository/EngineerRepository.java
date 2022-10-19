package com.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trial.entity.Engineer;
import com.trial.entity.User;

public interface EngineerRepository extends JpaRepository<Engineer, Long>{

	List<Engineer> findByUser(User user);
	List<Engineer> findByZipcode(String zipcode);
}
