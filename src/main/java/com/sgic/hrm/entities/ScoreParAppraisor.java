package com.sgic.hrm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ScoreParAppraisor {
	@Id
	private Integer id;
	private String parContentId;
	private Integer Score;
	
	@ManyToOne
	@JoinColumn(name="report_par_appraisor_id")
	private ReportParAppraisor reportParAppraisor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getParContentId() {
		return parContentId;
	}

	public void setParContentId(String parContentId) {
		this.parContentId = parContentId;
	}

	public Integer getScore() {
		return Score;
	}

	public void setScore(Integer score) {
		Score = score;
	}

	public ReportParAppraisor getReportParAppraisor() {
		return reportParAppraisor;
	}

	public void setReportParAppraisor(ReportParAppraisor reportParAppraisor) {
		this.reportParAppraisor = reportParAppraisor;
	}
	
	
}
