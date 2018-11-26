package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParContent;

public interface ScheduleParContentService {

	public void createScheduleParContent(ScheduleParContent scheduleParContent,Par par);
	public List<ScheduleParContent>findScheduleParContentByParId(Par parId);
}
