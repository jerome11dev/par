package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;

public interface ParScheduleService {

	/*
	 create entity in par
	 	par id
	 	emp id
	 	date
	 	time
	 save list of appraisors at parAppraisors table
	 	array of
	 	[par id
	 	apprasor id]
	 save list of par content
	 	array of
	 	[par id
	 	content id]
	 */
	
	public void createSchedulePar(Par par,
			List<ScheduleParAppraisor> scheduleParAppraisorList,
			List<ScheduleParContent> scheduleParContentList);
	
	
	//add par content 
	// remove par content
	
	// add par appraisor
	
	// delete schedule par
}
