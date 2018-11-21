package com.sgic.hrm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sgic.hrm.entities.ParContent;
import com.sgic.hrm.repository.ParContentRepository;
import com.sgic.hrm.service.ParContentService;

@Service
public class ParContentServiceImpl implements ParContentService {

	@Autowired
	private ParContentRepository parContentRepository;

	@Override
	public List<ParContent> getParContent() {
		
		return parContentRepository.findAll() ;
	}

	@Override
	public void createParContent(ParContent parContent) {
		parContentRepository.save(parContent);

	}

	@Override
	public void updateParContent(ParContent parContent, Integer id) {
		ParContent existParContent = parContentRepository.getOne(id);

		if (existParContent .getId() != null) {
			parContent.setId(id);
			parContentRepository.save(parContent);
		}

	}

	@Override
	public void deleteParContent(Integer id) {
		parContentRepository.deleteById(id);
	}

}
