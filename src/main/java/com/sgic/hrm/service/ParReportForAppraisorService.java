package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entities.ReportParAppraisor;
import com.sgic.hrm.entities.ScoreParAppraisor;

public interface ParReportForAppraisorService {
	/*
	 * save report entity -save list of par score -save report record
	 * find the par object by par id
	 * save the ReportParAppraise including par object
	 * write iteratoror to save the List of ScoreParAppraisee
	 */
	public void  saveReportAndScoreAppraisor (Integer parId,ReportParAppraisor reportParAppraisor, 
			List<ScoreParAppraisor> scoreParAppraisorList);

}
