package com.sgic.hrm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.entities.ParAppraisor;
import com.sgic.hrm.service.ParAppraisorService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class parAppraisorsTest {

	@Autowired
	ParAppraisorService  parAppraisorService;
	
	@Test
	public void saveParAppraisorTest() {
		parAppraisorService.createParAppraisor(new ParAppraisor(1,"appraisor1"));
	}
}
