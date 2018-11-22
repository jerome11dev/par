package com.sgic.hrm.serviceImpl.api;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.entities.ScoreParAppraisee;
import com.sgic.hrm.service.ParReportForAppraiseeService;
import com.sgic.hrm.service.ParService;
import com.sgic.hrm.service.ScoreParAppraiseeService;
import com.sgic.hrm.service.api.ReportParAppraiseeService;


@Service 
public class ParReportForAppraiseeServiceImpl implements ParReportForAppraiseeService {
	@Autowired 
	ParService parservice;
	@Autowired
	ReportParAppraiseeService reportParAppraiseService;
	@Autowired
	ScoreParAppraiseeService scoreParAppraiseeService;
	
	@Override
	public void saveReportAndScore(Integer parId,ReportParAppraise reportParAppraise, List<ScoreParAppraisee> scoreParAppraiseeList) {
		
		if(parservice.findParById(parId)!=null) {
			Par parObj=parservice.findParById(parId);
		reportParAppraiseService.createReportParAppraise(reportParAppraise,parObj);
		Iterator<ScoreParAppraisee> iterator = scoreParAppraiseeList.iterator();
		while (iterator.hasNext()) {
			scoreParAppraiseeService.createScoreParAppraisee(iterator.next(),reportParAppraise);
		}
		
		}
	}

	@Override
	public boolean updateParScore() {
	
		return false;
	}

	
}
