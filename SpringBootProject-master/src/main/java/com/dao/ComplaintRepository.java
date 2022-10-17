package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<complaint, Integer> {

}
