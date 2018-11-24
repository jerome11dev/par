package com.sgic.hrm.controller;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.dto.ScheduleParContentDTO;
import com.sgic.hrm.dto.ScheduleParDTO;
import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.service.api.ParScheduleService;



@RestController
public class ScheduleParController {

	@Autowired
	ParScheduleService parScheduleService;
	
	@GetMapping("/schedulepartemp")
public ScheduleParDTO getSchedulePar() {
	ScheduleParDTO objScheduleParDTO=new ScheduleParDTO();
	
	List<ScheduleParAppraisorsDTO> scheduleParAppraisorList=new ArrayList<ScheduleParAppraisorsDTO>();
	scheduleParAppraisorList.add(new ScheduleParAppraisorsDTO("A001"));
	scheduleParAppraisorList.add(new ScheduleParAppraisorsDTO("A002"));
	scheduleParAppraisorList.add(new ScheduleParAppraisorsDTO("A003"));
	
	List<ScheduleParContentDTO> scheduleParContentList=new ArrayList<ScheduleParContentDTO>();
	scheduleParContentList.add(new ScheduleParContentDTO("C001"));
	scheduleParContentList.add(new ScheduleParContentDTO("C002"));
	
	
	objScheduleParDTO.setScheduleParAppraisorsList(scheduleParAppraisorList);
	objScheduleParDTO.setScheduleParContentList(scheduleParContentList);
	return objScheduleParDTO;
}
	
	@PostMapping("/schedulepar")
	public void createSchedulePar(@RequestBody ScheduleParDTO objScheduleParDTO) {
		//boolean=
		Par par=new Par();
		par.setId(objScheduleParDTO.getId());
		par.setEmpId(objScheduleParDTO.getEmpId());
		par.setScheduleDate(objScheduleParDTO.getScheduleDate());
		parScheduleService.createSchedulePar(par,
				objScheduleParDTO.getScheduleParAppraisorsList(), 
				objScheduleParDTO.getScheduleParContentList());
	}
	
//	@GetMapping("/schedulepar/{empid}")
//public Par getScheduleParEmpId(@PathVariable("empid") String empid) {
//	
//	return objScheduleParDTO;
//}
	
}
