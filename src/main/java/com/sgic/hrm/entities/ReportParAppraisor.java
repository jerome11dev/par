package com.sgic.hrm.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ReportParAppraisor {

	@Id
	private Integer id;
	
	@ManyToOne()
	@JoinColumn(name="par_id")
	private Par parId;
	
	private String appraisorId;
	
	private Double appraisorScore;
	
	@OneToMany(mappedBy="reportParAppraisor",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	private List<ScoreParAppraisor> scoreParAppraisors;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Par getParId() {
		return parId;
	}

	public void setParId(Par parId) {
		this.parId = parId;
	}

	public String getAppraisorId() {
		return appraisorId;
	}

	public void setAppraisorId(String appraisorId) {
		this.appraisorId = appraisorId;
	}

	
	public Double getAppraisorScore() {
		return appraisorScore;
	}

	public void setAppraisorScore(Double appraisorScore) {
		this.appraisorScore = appraisorScore;
	}

	public List<ScoreParAppraisor> getScoreParAppraisors() {
		return scoreParAppraisors;
	}

	public void setScoreParAppraisors(List<ScoreParAppraisor> scoreParAppraisors) {
		this.scoreParAppraisors = scoreParAppraisors;
	}
	
	
}
