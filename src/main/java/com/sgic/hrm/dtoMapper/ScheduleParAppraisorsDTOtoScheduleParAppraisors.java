package com.sgic.hrm.dtoMapper;

import com.sgic.hrm.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.entities.ScheduleParAppraisor;

public class ScheduleParAppraisorsDTOtoScheduleParAppraisors {

	public static ScheduleParAppraisor getmapped(ScheduleParAppraisorsDTO scheduleParAppraisorsDTO) {
		ScheduleParAppraisor scheduleParAppraisor=new ScheduleParAppraisor();
		scheduleParAppraisor.setAppraisor_id(scheduleParAppraisorsDTO.getAppraisorId());
		return scheduleParAppraisor;
	}
}
