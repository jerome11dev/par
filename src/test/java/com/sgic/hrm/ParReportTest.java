package com.sgic.hrm;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScoreParAppraisee;
import com.sgic.hrm.service.ParReportForAppraiseeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParReportTest {
	@Autowired
	ParReportForAppraiseeService parReportForAppraiseeService;
//	ReportParAppraise objParReport = new ReportParAppraise(1);
//	List<ScoreParAppraisee> scoreParAppraiseeList=new ArrayList<ScoreParAppraisee>();
//	scoreParAppraiseeList.add(new ScoreParAppraisee(1,1,1,1));
	
}
