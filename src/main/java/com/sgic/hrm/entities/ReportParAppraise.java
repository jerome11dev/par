package com.sgic.hrm.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ReportParAppraise {

	@Id
	private Integer id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="par_id")
	private Par par;

	@OneToMany(mappedBy="reportParAppraise",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	private List<ScoreParAppraisee> scoreParAppraiseeList;

	public ReportParAppraise(int id) {
		// TODO Auto-generated constructor stub
		this.id =id;
	}
	public ReportParAppraise() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Par getPar() {
		return par;
	}

	public void setPar(Par par) {
		this.par = par;
	}

	public List<ScoreParAppraisee> getScoreParAppraiseeList() {
		return scoreParAppraiseeList;
	}

	public void setScoreParAppraiseeList(List<ScoreParAppraisee> scoreParAppraiseeList) {
		this.scoreParAppraiseeList = scoreParAppraiseeList;
	}



}
