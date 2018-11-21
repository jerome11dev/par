package com.sgic.hrm.service;

import com.sgic.hrm.entities.Par;

public interface ParService {

	public Par findParById(Integer id);
	
	public boolean createPar(Par par);
}
