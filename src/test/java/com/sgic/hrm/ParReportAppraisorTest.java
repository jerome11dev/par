package com.sgic.hrm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.entities.ReportParAppraisor;
import com.sgic.hrm.entities.ScoreParAppraisor;
import com.sgic.hrm.service.api.ParReportForAppraisorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParReportAppraisorTest {
	@Autowired
	ParReportForAppraisorService parReportForAppraisorService;
	@Test
	public void  ParReportAppraisor() {
		ReportParAppraisor objParReport =new ReportParAppraisor(1,"A001",3.5);
		List<ScoreParAppraisor> scoreParAppraisorList=new ArrayList<ScoreParAppraisor>();
		scoreParAppraisorList.add(new ScoreParAppraisor(1,"C001",3));
		scoreParAppraisorList.add(new ScoreParAppraisor(2,"C002",2));
		scoreParAppraisorList.add(new ScoreParAppraisor(3,"C003",1));
		parReportForAppraisorService.saveReportAndScoreAppraisor(1, objParReport, scoreParAppraisorList);
	}

}
