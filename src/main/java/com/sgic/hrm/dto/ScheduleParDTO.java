package com.sgic.hrm.dto;

import java.util.Date;
import java.util.List;


import com.sgic.hrm.entities.ScheduleParAppraisor;
import com.sgic.hrm.entities.ScheduleParContent;

public class ScheduleParDTO {

	private Integer id;
	private String empId;
	private Date scheduleDate;
	
	private List<ScheduleParAppraisor> scheduleParAppraisorsList;
	private List<ScheduleParContent> scheduleParContentList;
	
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
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public List<ScheduleParAppraisor> getScheduleParAppraisorsList() {
		return scheduleParAppraisorsList;
	}
	public void setScheduleParAppraisorsList(List<ScheduleParAppraisor> scheduleParAppraisorsList) {
		this.scheduleParAppraisorsList = scheduleParAppraisorsList;
	}
	public List<ScheduleParContent> getScheduleParContentList() {
		return scheduleParContentList;
	}
	public void setScheduleParContentList(List<ScheduleParContent> scheduleParContentList) {
		this.scheduleParContentList = scheduleParContentList;
	}
	
	
}
