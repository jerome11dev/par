package com.sgic.hrm.service.api;

import java.util.List;

import com.sgic.hrm.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.dto.ScheduleParContentDTO;
import com.sgic.hrm.dto.ScheduleParDTO;
import com.sgic.hrm.entities.Par;


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
			List<ScheduleParAppraisorsDTO> scheduleParAppraisorList,
			List<ScheduleParContentDTO> scheduleParContentList);
	// get schedule par
	
	public ScheduleParDTO getSchedulePar(Integer parId);
	
	//add par content 
	// remove par content
	
	// add par appraisor
	
	// delete schedule par
}
