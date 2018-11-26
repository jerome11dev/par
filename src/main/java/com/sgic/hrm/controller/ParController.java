package com.sgic.hrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.entities.Par;
import com.sgic.hrm.service.ParService;

@RestController
@CrossOrigin
public class ParController {
	@Autowired
	ParService parService;

	@GetMapping("/par")
	public ResponseEntity<List<Par>> parHistory() {
		List<Par> par = parService.parHistory();
		ResponseEntity<List<Par>> response = new ResponseEntity<>(par, HttpStatus.OK);
		return response;
	}
}
