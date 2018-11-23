package com.sgic.hrm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ReportParAppraisor;
import com.sgic.hrm.repository.ReportParAppraisorRepository;
import com.sgic.hrm.service.ReportParAppraisorService;
@Service
public class ReportParAppraisorServiceImpl implements ReportParAppraisorService {
@Autowired
ReportParAppraisorRepository reportParAppraisorRepo;
	@Override
	public void createReportParAppraise(ReportParAppraisor reportParAppraisor, Par par) {
		// TODO Auto-generated method stub
		reportParAppraisor.setParId(par);
		reportParAppraisorRepo.save(reportParAppraisor);
		
	}



}
