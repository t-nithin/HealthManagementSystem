package com.capg.hcs.service;

import java.util.List;

import com.capg.hcs.entity.Test;
import com.capg.hcs.exception.TestException;



public interface TestService {

	public List<Test>  findAllTests();
	public Test deleteTestById(int testId) throws  TestException;
	public List<Test> FindTestInenter(int centerID) ;
	}
