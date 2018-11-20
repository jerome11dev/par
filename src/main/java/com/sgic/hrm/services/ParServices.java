package com.sgic.hrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.repository.ParRepository;

@Service
public class ParServices {

	@Autowired
	ParRepository parRepo;
	
	public Par createScheduleNewPar(Par par,
			List<ScheduleParAppraisor> scheduleParAppraisor,
			List<ScheduleParContent> scheduleParContent
			) {
		
		par.setScheduleParAppraisorsList(scheduleParAppraisor);
		par.setScheduleParContentList(scheduleParContent);
		return par;
			}
	
	
}
