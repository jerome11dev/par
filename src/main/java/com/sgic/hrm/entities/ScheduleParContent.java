package com.sgic.hrm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ScheduleParContent {

	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="par_id")
	private Par parId;
	
	private String parContentId;
	
	

	public ScheduleParContent(Integer id, String parContentId) {
	
		this.id = id;
		this.parContentId = parContentId;
	}
	
	public ScheduleParContent() {
	
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

	public String getParContentId() {
		return parContentId;
	}

	public void setParContentId(String parContentId) {
		this.parContentId = parContentId;
	}

	
	

}
