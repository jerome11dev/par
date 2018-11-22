
package com.sgic.hrm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.repository.ReportParAppraiseRepository;
import com.sgic.hrm.service.api.ReportParAppraiseeService;

@Service
public class ReportParAppraiseServiceImpl implements ReportParAppraiseeService
{

	@Autowired
	ReportParAppraiseRepository reportParAppraiseRepo;
	
	public void createReportParAppraise(ReportParAppraise reportParAppraise,Par par) {
	
			reportParAppraise.setPar(par);
			reportParAppraiseRepo.save(reportParAppraise);
		
	}
}
