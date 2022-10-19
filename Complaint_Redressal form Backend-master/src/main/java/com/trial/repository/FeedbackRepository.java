package com.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trial.entity.Feedback;
import com.trial.entity.Ticket;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

	
	List<Feedback> findByTicket(Ticket ticket);
	
}
