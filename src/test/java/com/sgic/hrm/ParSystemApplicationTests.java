package com.sgic.hrm;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.services.ParServices;
import com.sgic.hrm.services.ScheduleParAppraisorService;
import com.sgic.hrm.services.ScheduleParContentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParSystemApplicationTests {

	
	
	@Autowired
	private ScheduleParAppraisorService scheduleParAppraisorService;
	
	@Autowired
	private ScheduleParContentService scheduleParContentService;
	
	@Before
	public void initDb() {
	
		System.out.println("Testing ..... ");
		
	}
	
	@Test
	public void testScheduleParAppraisorService() {
		scheduleParAppraisorService.addParAppraisor(new ScheduleParAppraisor(1,"A001"));
		scheduleParAppraisorService.addParAppraisor(new ScheduleParAppraisor(2,"A002"));
		assertNotNull(scheduleParAppraisorService.genererateParAppraisorsList());
	}
	
	@Test
	public void testScheduleParContentService()  {
		scheduleParContentService.addParContent(new ScheduleParContent(1,"Communication"));
		scheduleParContentService.addParContent(new ScheduleParContent(2,"Attitude"));
		assertNotNull(scheduleParAppraisorService.genererateParAppraisorsList());
	}
	
	
	

}
