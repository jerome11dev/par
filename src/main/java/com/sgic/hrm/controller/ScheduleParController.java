package com.sgic.hrm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.dto.ScheduleParDTO;
import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.service.api.ParScheduleService;



@RestController
public class ScheduleParController {

	@Autowired
	ParScheduleService parScheduleService;
	
	@GetMapping("/schedulepar")
public ScheduleParDTO getSchedulePar() {
	ScheduleParDTO objScheduleParDTO=new ScheduleParDTO();
	
	List<ScheduleParAppraisor> scheduleParAppraisorList=new ArrayList<ScheduleParAppraisor>();
	scheduleParAppraisorList.add(new ScheduleParAppraisor(1,"A001"));
	scheduleParAppraisorList.add(new ScheduleParAppraisor(2,"A002"));
	scheduleParAppraisorList.add(new ScheduleParAppraisor(3,"A003"));
	
	List<ScheduleParContent> scheduleParContentList=new ArrayList<ScheduleParContent>();
	scheduleParContentList.add(new ScheduleParContent(1,"C001"));
	scheduleParContentList.add(new ScheduleParContent(2,"C002"));
	scheduleParContentList.add(new ScheduleParContent(3,"C003"));
	scheduleParContentList.add(new ScheduleParContent(4,"C003"));
	
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
	
}
