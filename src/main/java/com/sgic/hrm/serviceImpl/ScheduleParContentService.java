package com.sgic.hrm.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.ScheduleParContent;

@Service
public class ScheduleParContentService {

List<ScheduleParContent> parContentList =new ArrayList<>();
	
	public List<ScheduleParContent> genererateParContentList(){
		return parContentList;
	}
	
	public void addParContent(ScheduleParContent parContent) {
		parContentList.add(parContent);
	}
	
}
