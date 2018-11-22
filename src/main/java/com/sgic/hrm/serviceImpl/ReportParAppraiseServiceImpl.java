
package com.sgic.hrm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.ReportParAppraise;
import com.sgic.hrm.repository.ReportParAppraiseRepository;
import com.sgic.hrm.service.api.ReportParAppraiseeService;

@Service
public class ReportParAppraiseServiceImpl implements ReportParAppraiseeService
{

	@Autowired
	ParServiceImpl parServices;
	
	@Autowired
	ReportParAppraiseRepository reportParAppraiseRepo;
	
	public boolean createReportParAppraise(ReportParAppraise reportParAppraise,Integer parId) {
		if(parServices.findParById(parId)!=null) {
			reportParAppraise.setPar(parServices.findParById(parId));
			reportParAppraiseRepo.save(reportParAppraise);
			return true;
		}
		return false;
		
	}
}
