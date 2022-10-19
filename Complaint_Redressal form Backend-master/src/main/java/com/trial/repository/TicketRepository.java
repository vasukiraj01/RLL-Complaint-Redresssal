package com.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.trial.entity.Customer;
import com.trial.entity.Engineer;
import com.trial.entity.Ticket;

@CrossOrigin
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	

	List<Ticket> findByCustomer(Customer customer);
	List<Ticket> findByZipcode(String zipcode);
	List<Ticket> findByEngineer(Engineer engineer);
}
