package com.sgic.hrm.serviceImpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.repository.ParRepository;
import com.sgic.hrm.repository.ScheduleParAppraisorRepository;
import com.sgic.hrm.repository.ScheduleParContentRepository;
import com.sgic.hrm.service.ParScheduleService;
import com.sgic.hrm.service.ParService;
import com.sgic.hrm.service.ScheduleParAppraisorService;

@Service
public class ParScheduleServiceImpl implements ParScheduleService{

	@Autowired
	ParService parService;
	
	@Autowired
	ScheduleParAppraisorService scheduleParAppraisorService;
	
	@Override
	public void createSchedulePar(Par par, List<ScheduleParAppraisor> scheduleParAppraisorList,
			List<ScheduleParContent> scheduleParContentList) {
	
		//save par object
		parService.createPar(par);
		
		//save Appraisor List
		Iterator<ScheduleParAppraisor> iterator = scheduleParAppraisorList.iterator();
		while (iterator.hasNext()) {
			scheduleParAppraisorService.createScheduleParAppraisor(iterator.next(), par);
		}
		
		//save Appraisor Content
		
	}

}
