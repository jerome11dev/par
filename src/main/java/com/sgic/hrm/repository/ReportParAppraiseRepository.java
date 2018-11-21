package com.sgic.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.entities.ReportParAppraise;

@Repository
public interface ReportParAppraiseRepository extends JpaRepository<ReportParAppraise, Integer> {

}
