package com.sgic.hrm.serviceImpl.api;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.entities.ReportParAppraisor;
import com.sgic.hrm.entities.ScoreParAppraisor;
import com.sgic.hrm.service.ParReportForAppraisorService;
import com.sgic.hrm.service.ParService;
import com.sgic.hrm.service.ScoreParAppraisorService;
import com.sgic.hrm.service.api.ReportParAppraisorService;

@Service
public class ParReportForAppraisorServiceImpl implements ParReportForAppraisorService {
	@Autowired
	ParService parService;
	@Autowired
	ReportParAppraisorService reportParAppraisorService;
	@Autowired
	ScoreParAppraisorService scoreParAppraisorService;

	@Override
	public void saveReportAndScoreAppraisor(Integer parId, ReportParAppraisor reportParAppraisor,
			List<ScoreParAppraisor> scoreParAppraisorList) {
		if (parService.findParById(parId) != null) {
			Par parObj = parService.findParById(parId);
			reportParAppraisorService.createReportParAppraise(reportParAppraisor, parObj);
			Iterator<ScoreParAppraisor> iterator = scoreParAppraisorList.iterator();
			while (iterator.hasNext()) {
				scoreParAppraisorService.createScoreParAppraisor(iterator.next(), reportParAppraisor);
			}

		}
	}

}
