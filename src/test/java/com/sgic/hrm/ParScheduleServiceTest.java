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
import com.sgic.hrm.service.api.ParScheduleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParScheduleServiceTest {
	
	@Autowired
	ParScheduleService parScheduleService;
	
	@Test
	public void createParScheduleService() {
		Par parObj=new Par(3,"EM001",null);
		List<ScheduleParAppraisor> scheduleParAppraisorList=new ArrayList<ScheduleParAppraisor>();
		scheduleParAppraisorList.add(new ScheduleParAppraisor(4,"A001"));
		scheduleParAppraisorList.add(new ScheduleParAppraisor(2,"A002"));
		scheduleParAppraisorList.add(new ScheduleParAppraisor(3,"A003"));
		parScheduleService.createSchedulePar(parObj, scheduleParAppraisorList, null);
	}
}
