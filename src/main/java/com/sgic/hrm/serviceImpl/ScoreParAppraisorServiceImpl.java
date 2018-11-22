package com.sgic.hrm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.ReportParAppraisor;
import com.sgic.hrm.entities.ScoreParAppraisor;
import com.sgic.hrm.repository.ScoreParAppraisorRepository;
import com.sgic.hrm.service.ScoreParAppraisorService;
@Service
public class ScoreParAppraisorServiceImpl implements  ScoreParAppraisorService {
@Autowired
ScoreParAppraisorRepository scoreParAppraisorRepo;
	@Override
	public void createScoreParAppraisor(ScoreParAppraisor scoreParAppraisor, ReportParAppraisor reportParAppraisor) {
		// TODO Auto-generated method stub
		scoreParAppraisor.setReportParAppraisor(reportParAppraisor);
		scoreParAppraisorRepo.save(scoreParAppraisor);
		
	}

}
