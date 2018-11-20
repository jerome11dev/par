package com.sgic.hrm.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ScheduleParAppraisor {
	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="par_id")
	private Par parId;
	
	// to be enhanced
	private String appraisor_id;
	
	

	public ScheduleParAppraisor(Integer id,String appraisor_id) {
		this.id = id;
		this.appraisor_id = appraisor_id;
	}

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

	public String getAppraisor_id() {
		return appraisor_id;
	}

	public void setAppraisor_id(String appraisor_id) {
		this.appraisor_id = appraisor_id;
	}

	

}
