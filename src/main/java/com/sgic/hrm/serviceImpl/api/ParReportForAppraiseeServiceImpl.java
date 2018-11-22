package com.sgic.hrm.serviceImpl.api;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.entities.ScoreParAppraisee;
import com.sgic.hrm.service.ParReportForAppraiseeService;
import com.sgic.hrm.serviceImpl.ReportParAppraiseServiceImpl;
import com.sgic.hrm.serviceImpl.ScoreParAppraiseeServiceImpl;

@Service 
public class ParReportForAppraiseeServiceImpl implements ParReportForAppraiseeService {
	@Autowired
	ReportParAppraiseServiceImpl reportParAppraiseService;
	@Autowired
	ScoreParAppraiseeServiceImpl scoreParAppraiseeService;
	@Override
	public void saveReportAndScore(ReportParAppraise reportParAppraise, List<ScoreParAppraisee> scoreParAppraiseeList,ScoreParAppraisee scoreParAppraisee) {
		// TODO Auto-generated method stub
		reportParAppraiseService.createReportParAppraise(reportParAppraise, null);
		Iterator<ScoreParAppraisee> iterator = scoreParAppraiseeList.iterator();
		while (iterator.hasNext()) {
			scoreParAppraiseeService.createScoreParAppraisee(iterator.next());
		}
		
	}

	@Override
	public boolean updateParScore() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
