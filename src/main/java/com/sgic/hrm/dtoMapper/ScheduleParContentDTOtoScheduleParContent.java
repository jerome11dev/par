package com.sgic.hrm.dtoMapper;

import com.sgic.hrm.dto.ScheduleParContentDTO;
import com.sgic.hrm.entities.ScheduleParContent;

public class ScheduleParContentDTOtoScheduleParContent {
	public static ScheduleParContent getmapped(ScheduleParContentDTO scheduleParContentDTO) {
		ScheduleParContent scheduleParContent =new ScheduleParContent();
		scheduleParContent.setParContentId(scheduleParContentDTO.getParContentId());
		return scheduleParContent;
		
	}

}
