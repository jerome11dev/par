package com.sgic.hrm.serviceImpl;

import java.util.List;

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

	@Override
	public List<ScheduleParAppraisor> findScheduleParAppraisorByParId(Par parId) {
		// TODO Auto-generated method stub
		return scheduleParAppraisorRepo.findByParId(parId);
	}


	
}
