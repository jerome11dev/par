package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entities.Par;

public interface ParService {

	public Par findParById(Integer id);
	
	public boolean createPar(Par par);
	List<Par>parHistory();
	public List<Par> findByEmployeeId(String id);
}
