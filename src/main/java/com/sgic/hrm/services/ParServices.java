package com.sgic.hrm.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.repository.ParRepository;

@Service
public class ParServices {

	@Autowired
	ParRepository parRepo;
	
	// find par object by id
	public Par findParById(Integer id) {
		return parRepo.findParById(id);
	}
	
	// create a new par record
	public boolean createPar(Par par) {
		if(parRepo.save(par)!=null) {
			return true;
		}
		return false;
	}
	
	
}
