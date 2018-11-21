package com.sgic.hrm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ReportParAppraise;

import com.sgic.hrm.serviceImpl.ParServiceImpl;
import com.sgic.hrm.serviceImpl.ReportParAppraiseService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ParSystemApplicationTests {

	
	@Autowired
	private ParServiceImpl parService;
	
	
	
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
	
	
	
	
	

}
