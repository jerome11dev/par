package com.sgic.hrm.services;

import java.util.List;

import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.entities.ScoreParAppraisee;

public class ReportParAppraiseService {

	public void addReportParAppraise(ReportParAppraise reportParAppraise,List<ScoreParAppraisee> scoreParAppraiseeList) {
		reportParAppraise.setScoreParAppraiseeList(scoreParAppraiseeList);
		
	}
}
