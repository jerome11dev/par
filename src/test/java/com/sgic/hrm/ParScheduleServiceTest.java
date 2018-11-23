package com.sgic.hrm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.dto.ScheduleParContentDTO;
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
		Par parObj=new Par(1,"EM002",null);
		List<ScheduleParAppraisorsDTO> scheduleParAppraisorList=new ArrayList<ScheduleParAppraisorsDTO>();
		scheduleParAppraisorList.add(new ScheduleParAppraisorsDTO("A001"));
		scheduleParAppraisorList.add(new ScheduleParAppraisorsDTO("A002"));
		
		List<ScheduleParContentDTO> scheduleParContentList=new ArrayList<ScheduleParContentDTO>();
		scheduleParContentList.add(new ScheduleParContentDTO("C001"));
		scheduleParContentList.add(new ScheduleParContentDTO("C002"));
		scheduleParContentList.add(new ScheduleParContentDTO("C003"));
	
		parScheduleService.createSchedulePar(parObj, scheduleParAppraisorList,scheduleParContentList);
	}
}
