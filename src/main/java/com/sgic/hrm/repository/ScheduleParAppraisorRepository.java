package com.sgic.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.entities.ScheduleParAppraisor;

@Repository

public interface ScheduleParAppraisorRepository extends JpaRepository<ScheduleParAppraisor, Integer> {

}
