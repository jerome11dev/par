package com.sgic.hrm.serviceImpl.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.dto.ScheduleParContentDTO;
import com.sgic.hrm.dto.ScheduleParDTO;
import com.sgic.hrm.dtoMapper.ScheduleParAppraisorsMapper;
import com.sgic.hrm.dtoMapper.ScheduleParContentMapper;
import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.service.ParService;
import com.sgic.hrm.service.ScheduleParAppraisorService;
import com.sgic.hrm.service.ScheduleParContentService;
import com.sgic.hrm.service.api.ParScheduleService;

@Service
public class ParScheduleServiceImpl implements ParScheduleService {

	@Autowired
	ParService parService;

	@Autowired
	ScheduleParAppraisorService scheduleParAppraisorService;

	@Autowired
	ScheduleParContentService scheduleParContentService;

	@Override
	public void createSchedulePar(Par par, List<ScheduleParAppraisorsDTO> scheduleParAppraisorList,
			List<ScheduleParContentDTO> scheduleParContentList) {

		// save par object
		parService.createPar(par);

		// save Appraisor List
		Iterator<ScheduleParAppraisorsDTO> iteratorScheduledAppraisor = scheduleParAppraisorList.iterator();
		while (iteratorScheduledAppraisor.hasNext()) {

			scheduleParAppraisorService.createScheduleParAppraisor(
					ScheduleParAppraisorsMapper.dtoToEntity(iteratorScheduledAppraisor.next()), par);
		}

		// save Content List
		Iterator<ScheduleParContentDTO> iteratorScheduledContent = scheduleParContentList.iterator();
		while (iteratorScheduledContent.hasNext()) {
			scheduleParContentService.createScheduleParContent(
					ScheduleParContentMapper.dtoToEntity(iteratorScheduledContent.next()), par);
		}

	}

	@Override
	public ScheduleParDTO getSchedulePar(Integer parId) {
	
		Par par = parService.findParById(parId);
		Iterator<ScheduleParAppraisor> iteratorScheduledAppraisor = scheduleParAppraisorService
				.findScheduleParAppraisorByParId(par).iterator();
	
		List<ScheduleParAppraisorsDTO> listScheduleParAppraisorDTO = new ArrayList<>();
		while (iteratorScheduledAppraisor.hasNext()) {

			listScheduleParAppraisorDTO.add(ScheduleParAppraisorsMapper.entityToDto(iteratorScheduledAppraisor.next()));
		}
		
		Iterator<ScheduleParContent> iteratorScheduleParContent = scheduleParContentService
				.findScheduleParContentByParId(par).iterator();
		List<ScheduleParContentDTO> listScheduleParContentDTO = new ArrayList<>();
		while (iteratorScheduleParContent.hasNext()) {
			listScheduleParContentDTO.add(ScheduleParContentMapper.entityToDto(iteratorScheduleParContent.next()));
		}

		ScheduleParDTO scheduleParDTO = new ScheduleParDTO();
		scheduleParDTO.setScheduleParAppraisorsList(listScheduleParAppraisorDTO);
		scheduleParDTO.setScheduleParContentList(listScheduleParContentDTO);
		return scheduleParDTO;
	}

}
