package com.sgic.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sgic.hrm.entities.ScheduleParContent;

@Repository
public interface ScheduleParContentRepository extends JpaRepository<ScheduleParContent, Integer> {

}
