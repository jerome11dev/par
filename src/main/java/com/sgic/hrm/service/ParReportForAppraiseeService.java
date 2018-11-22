package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.entities.ScoreParAppraisee;

public interface ParReportForAppraiseeService {

	/*
	 * save report entity -save list of par score -save report record
	 */
	public void saveReportAndScore(ReportParAppraise reportParAppraise, 
			List<ScoreParAppraisee>scoreParAppraiseeList,Integer parId);

	// update one par score
	public boolean updateParScore();
}
