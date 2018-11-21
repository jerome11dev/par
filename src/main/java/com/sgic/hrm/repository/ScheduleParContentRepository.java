package com.sgic.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.entities.ParContent;

@Repository
public interface ScheduleParContentRepository extends JpaRepository<ParContent, Integer> {

}
