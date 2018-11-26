package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;

public interface ScheduleParAppraisorService {

	public void createScheduleParAppraisor(ScheduleParAppraisor scheduleParAppraisor,Par par);
	
	public List<ScheduleParAppraisor>findScheduleParAppraisorByParId(Par parId);

}
