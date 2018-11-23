package com.sgic.hrm.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ScheduleParContent{


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="par_id")
	private Par parId;
	
	private String parContentId;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ScheduleParContent(String parContentId) {
	
		this.parContentId = parContentId;
	}
	
	public ScheduleParContent() {
	
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
