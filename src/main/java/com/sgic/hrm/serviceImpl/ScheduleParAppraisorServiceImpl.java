package com.sgic.hrm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.repository.ScheduleParAppraisorRepository;
import com.sgic.hrm.service.ScheduleParAppraisorService;

@Service
public class ScheduleParAppraisorServiceImpl implements ScheduleParAppraisorService{

	@Autowired
	ScheduleParAppraisorRepository scheduleParAppraisorRepo;
	
	@Override
	public void createScheduleParAppraisor(ScheduleParAppraisor scheduleParAppraisor, Par par) {
		scheduleParAppraisor.setParId(par);
		scheduleParAppraisorRepo.save(scheduleParAppraisor);
	}
	
}
