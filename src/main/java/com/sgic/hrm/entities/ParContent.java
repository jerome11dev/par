package com.sgic.hrm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParContent {

	@Id
	private Integer id;
	private String contentName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	
	public ParContent(Integer id, String contentName) {
		this.id = id;
		this.contentName = contentName;
	}
	
	public ParContent() {
	
	}
	
	
	
	
}
