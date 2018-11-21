package com.sgic.hrm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.serviceImpl.ParServices;
import com.sgic.hrm.serviceImpl.ReportParAppraiseService;
import com.sgic.hrm.serviceImpl.ScheduleParAppraisorService;
import com.sgic.hrm.serviceImpl.ScheduleParContentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParSystemApplicationTests {

	
	@Autowired
	private ParServices parService;
	
	@Autowired
	private ScheduleParAppraisorService scheduleParAppraisorService;
	
	@Autowired
	private ScheduleParContentService scheduleParContentService;
	
	@Autowired
	ReportParAppraiseService reportParAppraiseService;
	
	@Test
	public void createReportParAppraise1() {
		ReportParAppraise objReportParAppraise=new ReportParAppraise();
		objReportParAppraise.setId(1);
		assertEquals(reportParAppraiseService.createReportParAppraise(objReportParAppraise, 1), true);
	}
	
	@Test
	public void createReportParAppraise3() {
		ReportParAppraise objReportParAppraise=new ReportParAppraise();
		objReportParAppraise.setId(2);
		assertEquals(reportParAppraiseService.createReportParAppraise(objReportParAppraise, 1), true);
	}
	@Test
	public void createReportParAppraise2() {
		ReportParAppraise objReportParAppraise=new ReportParAppraise();
		objReportParAppraise.setId(1);
		assertEquals(reportParAppraiseService.createReportParAppraise(objReportParAppraise, 2), true);
	}
	
	@Test
	public void createPar() {
		Par parObj=new Par(1,"E001",3.5,null);
		parService.createPar(parObj);
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
