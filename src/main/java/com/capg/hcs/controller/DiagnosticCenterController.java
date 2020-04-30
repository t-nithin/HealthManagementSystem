package com.capg.hcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcs.entity.DiagnosticCenter;
import com.capg.hcs.entity.Test;
import com.capg.hcs.service.DiagnosticCenterService;
@RestController
@CrossOrigin("*")
public class DiagnosticCenterController {
	@Autowired
	DiagnosticCenterService diagnosticCenterService;
	@GetMapping("/center")
	public ResponseEntity<List<DiagnosticCenter>>  findAllTests() 
	{
		List<DiagnosticCenter> list = diagnosticCenterService.findAll();
		ResponseEntity<List<DiagnosticCenter>>  rt = new ResponseEntity<List<DiagnosticCenter>>(list,HttpStatus.OK);
		return rt;	
	}
}
