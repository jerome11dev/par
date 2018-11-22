package com.sgic.hrm.serviceImpl.api;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.service.ParService;
import com.sgic.hrm.service.ScheduleParAppraisorService;
import com.sgic.hrm.service.ScheduleParContentService;
import com.sgic.hrm.service.api.ParScheduleService;

@Service
public class ParScheduleServiceImpl implements ParScheduleService{

	@Autowired
	ParService parService;
	
	@Autowired
	ScheduleParAppraisorService scheduleParAppraisorService;
	
	@Autowired
	ScheduleParContentService scheduleParContentService;
	
	@Override
	public void createSchedulePar(Par par, List<ScheduleParAppraisor> scheduleParAppraisorList,
			List<ScheduleParContent> scheduleParContentList) {
	
		//save par object
		parService.createPar(par);
		
		//save Appraisor List
		Iterator<ScheduleParAppraisor> iteratorScheduledAppraisor = scheduleParAppraisorList.iterator();
		while (iteratorScheduledAppraisor.hasNext()) {
			scheduleParAppraisorService.createScheduleParAppraisor(iteratorScheduledAppraisor.next(), par);
		}
		
		//save Content List
		Iterator<ScheduleParContent> iteratorScheduledContent = scheduleParContentList.iterator();
		while (iteratorScheduledContent.hasNext()) {
			scheduleParContentService.createScheduleParContent(iteratorScheduledContent.next(), par);
		}
		
	}

}
