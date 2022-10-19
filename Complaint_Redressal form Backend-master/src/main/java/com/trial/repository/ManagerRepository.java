package com.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trial.entity.Manager;
import com.trial.entity.User;

public interface ManagerRepository extends JpaRepository<Manager, Long>{

	List<Manager> findByUser(User user);
}
