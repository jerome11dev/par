package com.sgic.hrm.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.repository.ParRepository;
import com.sgic.hrm.service.ParService;

@Service
public class ParServiceImpl implements ParService {

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

	@Override
	public List<Par> parHistory() {
		// TODO Auto-generated method stub
		return parRepo.findAll();
	}

	@Override
	public List<Par> findByEmployeeId(String id) {
		// TODO Auto-generated method stub
		return parRepo.findByEmployeeId(id);
	}


	
	
}
