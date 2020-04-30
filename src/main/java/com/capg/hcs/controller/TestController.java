package com.capg.hcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcs.entity.Test;
import com.capg.hcs.exception.TestException;
import com.capg.hcs.service.TestService;

@RestController
@CrossOrigin("*")
public class TestController {

	@Autowired
	TestService  testService;
	
	
	
	@GetMapping("/test")
	public ResponseEntity<List<Test>>  findAllTests() 
	{
		List<Test> list = testService.findAllTests();
		ResponseEntity<List<Test>>  rt = new ResponseEntity<List<Test>>(list,HttpStatus.OK);
		return rt;	
	}
	
	@GetMapping("/test/{id}")
	public ResponseEntity<List<Test>>  findAllTestsInCenter(@PathVariable("id") int centerId) 
	{
		List<Test> list = testService.FindTestInenter(centerId);
		ResponseEntity<List<Test>>  rt = new ResponseEntity<List<Test>>(list,HttpStatus.OK);
		return rt;	
	}
	
	@DeleteMapping("/test/{id}")
	public  ResponseEntity<Test>  deleteTestById(@PathVariable("id") int testId) throws  TestException
	{
		ResponseEntity<Test>  rt = null;
	    Test t =testService.deleteTestById(testId);
		rt= new ResponseEntity<Test>(t,HttpStatus.OK);	
		return rt;
	}
	
}
