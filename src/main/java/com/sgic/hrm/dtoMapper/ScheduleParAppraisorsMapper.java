package com.sgic.hrm.dtoMapper;

import com.sgic.hrm.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.entities.ScheduleParAppraisor;

public class ScheduleParAppraisorsMapper {

	public static ScheduleParAppraisor dtoToEntity(ScheduleParAppraisorsDTO scheduleParAppraisorsDTO) {
		ScheduleParAppraisor scheduleParAppraisor=new ScheduleParAppraisor();
		scheduleParAppraisor.setAppraisor_id(scheduleParAppraisorsDTO.getAppraisorId());
		return scheduleParAppraisor;
	}
	
	public static ScheduleParAppraisorsDTO entityToDto(ScheduleParAppraisor scheduleParAppraisor) {
		ScheduleParAppraisorsDTO scheduleParAppraisorDTO=new ScheduleParAppraisorsDTO();
		scheduleParAppraisorDTO.setAppraisorId(scheduleParAppraisor.getAppraisor_id());
		return scheduleParAppraisorDTO;
	}
}
