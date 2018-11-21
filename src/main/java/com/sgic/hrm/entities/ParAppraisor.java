package com.sgic.hrm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParAppraisor {

	@Id
	private Integer id;
	private String empId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public ParAppraisor(Integer id, String empId) {

		this.id = id;
		this.empId = empId;
	}

	public ParAppraisor() {

	}

}
