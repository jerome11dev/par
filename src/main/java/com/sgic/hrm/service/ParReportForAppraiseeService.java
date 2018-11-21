package com.sgic.hrm.service;


public interface ParReportForAppraiseeService {

	/*
	 * save report entity -save list of par score -save report record
	 */
	public boolean saveReportAndScore();

	// update one par score
	public boolean updateParScore();
}
