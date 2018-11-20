package com.sgic.hrm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ScoreParAppraisee {
	@Id
	private Integer id;
	private String parContentId;
	private Double Score;
	
	@ManyToOne
	@JoinColumn(name="report_par_appraise_id")
	private ReportParAppraise reportParAppraise;

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

	public Double getScore() {
		return Score;
	}

	public void setScore(Double score) {
		Score = score;
	}

	public ReportParAppraise getReportParAppraise() {
		return reportParAppraise;
	}

	public void setReportParAppraise(ReportParAppraise reportParAppraise) {
		this.reportParAppraise = reportParAppraise;
	}

	

}
