package com.sgic.hrm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.entities.ScoreParAppraisee;
import com.sgic.hrm.repository.ScoreParAppraiseeRepository;
import com.sgic.hrm.service.ScoreParAppraiseeService;
@Service
public class ScoreParAppraiseeServiceImpl implements ScoreParAppraiseeService {
@Autowired
ScoreParAppraiseeRepository scoreParAppraiseeRepo;
	@Override
	public void createScoreParAppraisee(ScoreParAppraisee scoreParAppraisee,ReportParAppraise reportParAppraise) {
		scoreParAppraisee.setReportParAppraise(reportParAppraise);
		scoreParAppraiseeRepo.save(scoreParAppraisee);
		
	}

}
