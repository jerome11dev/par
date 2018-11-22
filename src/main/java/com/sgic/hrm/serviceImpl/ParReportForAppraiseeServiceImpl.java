package com.sgic.hrm.serviceImpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.entities.ScoreParAppraisee;
import com.sgic.hrm.service.ParReportForAppraiseeService;

@Service 
public class ParReportForAppraiseeServiceImpl implements ParReportForAppraiseeService {
	@Autowired
	ReportParAppraiseServiceImpl reportParAppraiseService;
	@Autowired
	ScoreParAppraiseeServiceImpl scoreParAppraiseeService;
	@Override
	public void saveReportAndScore(ReportParAppraise reportParAppraise, List<ScoreParAppraisee> scoreParAppraiseeList,Integer parId) {
		
		reportParAppraiseService.createReportParAppraise(reportParAppraise, null);
		Iterator<ScoreParAppraisee> iterator = scoreParAppraiseeList.iterator();
		while (iterator.hasNext()) {
			scoreParAppraiseeService.createScoreParAppraisee(iterator.next());
		}
		
	}

	@Override
	public boolean updateParScore() {
	
		return false;
	}

	
}
