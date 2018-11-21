package com.sgic.hrm.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.ScheduleParAppraisor;

@Service
public class ScheduleParAppraisorService {
	
	List<ScheduleParAppraisor> parAppraisorsList =new ArrayList<>();
	
	public List<ScheduleParAppraisor> genererateParAppraisorsList(){
		return parAppraisorsList;
	}
	
	public void addParAppraisor(ScheduleParAppraisor parAppraisor) {
		parAppraisorsList.add(parAppraisor);
	}
	
}
