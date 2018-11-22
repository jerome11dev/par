package com.sgic.hrm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.service.api.ParScheduleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParScheduleServiceTest {
	
	@Autowired
	ParScheduleService parScheduleService;
	
	@Test
	public void createParScheduleService() {
		Par parObj=new Par(1,"EM001",null);
		List<ScheduleParAppraisor> scheduleParAppraisorList=new ArrayList<ScheduleParAppraisor>();
		scheduleParAppraisorList.add(new ScheduleParAppraisor(1,"A001"));
		scheduleParAppraisorList.add(new ScheduleParAppraisor(2,"A002"));
		scheduleParAppraisorList.add(new ScheduleParAppraisor(3,"A003"));
		List<ScheduleParContent> scheduleParContentList=new ArrayList<ScheduleParContent>();
		scheduleParContentList.add(new ScheduleParContent(1,"C001"));
		scheduleParContentList.add(new ScheduleParContent(2,"C002"));
		scheduleParContentList.add(new ScheduleParContent(3,"C003"));
		scheduleParContentList.add(new ScheduleParContent(4,"C003"));
		parScheduleService.createSchedulePar(parObj, scheduleParAppraisorList,scheduleParContentList);
	}
}
