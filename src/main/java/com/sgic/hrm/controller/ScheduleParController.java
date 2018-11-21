package com.sgic.hrm.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.services.ParServices;
import com.sgic.hrm.services.ScheduleParAppraisorService;
import com.sgic.hrm.services.ScheduleParContentService;

@RestController
public class ScheduleParController {

	@Autowired 
	private ParServices parServices;
	
	@Autowired
	private ScheduleParAppraisorService scheduleParAppraisorService;
	
	@Autowired
	private ScheduleParContentService scheduleParContentService;
	
	
	
	@GetMapping("/parapp")
	public List<ScheduleParAppraisor> getParAppraissor() {
		scheduleParAppraisorService.addParAppraisor(new ScheduleParAppraisor(1,"A001"));
		scheduleParAppraisorService.addParAppraisor(new ScheduleParAppraisor(2,"A002"));
		
		return scheduleParAppraisorService.genererateParAppraisorsList();
	}
	
	
}
