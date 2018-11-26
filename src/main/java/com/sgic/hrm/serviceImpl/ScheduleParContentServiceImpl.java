package com.sgic.hrm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ScheduleParContent;
import com.sgic.hrm.repository.ScheduleParContentRepository;
import com.sgic.hrm.service.ScheduleParContentService;

@Service
public class ScheduleParContentServiceImpl implements ScheduleParContentService{

	@Autowired
	ScheduleParContentRepository scheduleParContentRepo;
	
	@Override
	public void createScheduleParContent(ScheduleParContent scheduleParContent, Par par) {
		scheduleParContent.setParId(par);
		scheduleParContentRepo.save(scheduleParContent);
	}

	@Override
	public List<ScheduleParContent> findScheduleParContentByParId(Par parId) {
		// TODO Auto-generated method stub
		return scheduleParContentRepo.findByParId(parId);
	}

	
}
