package com.sgic.hrm.dto;

import java.util.List;
import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScoreParAppraisee;

public class ReportParAppraiseeDTO {
	
	private Integer id;
	private Integer parId;
	private List<ScoreParAppraisee> scoreParAppraiseeList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParId() {
		return parId;
	}
	public void setParId(Integer parId) {
		this.parId = parId;
	}
	public List<ScoreParAppraisee> getScoreParAppraiseeList() {
		return scoreParAppraiseeList;
	}
	public void setScoreParAppraiseeList(List<ScoreParAppraisee> scoreParAppraiseeList) {
		this.scoreParAppraiseeList = scoreParAppraiseeList;
	}
	
	
}
