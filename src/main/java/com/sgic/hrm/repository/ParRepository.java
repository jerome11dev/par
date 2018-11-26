package com.sgic.hrm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.entities.Par;

@Repository
public interface ParRepository extends JpaRepository<Par, Integer>{

	Par findParById(Integer id);
	
	@Query("select pr from Par as pr where pr.empId = ?1")
	public List<Par> findByEmployeeId(String id);
	
	}
