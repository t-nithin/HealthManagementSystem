package com.capg.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.TestDao;
import com.capg.hcs.entity.Test;
import com.capg.hcs.exception.TestException;
@Service
public class TestServiceImpl implements TestService {


	
	 @Autowired
	  TestDao  testDao;

	
	@Override
	public List<Test> findAllTests() {
		List<Test> list =  testDao.findAll();
		return list;
	}

	@Override
	public Test deleteTestById(int testId) throws  TestException {
		
	Test test =null;
		
		if(  testDao.existsById(testId))
		{
			 test =  testDao.findById(testId).get();
			 testDao.deleteById(testId);
		}
		else
		{
			throw new  TestException("Test ID "+testId+" NOT FOUND ");
		}
		return test ;
	}

	@Override
	public List<Test> FindTestInenter(int centerID) {
		// TODO Auto-generated method stub
		return testDao.findTestInCenter(centerID);
	}

}  

