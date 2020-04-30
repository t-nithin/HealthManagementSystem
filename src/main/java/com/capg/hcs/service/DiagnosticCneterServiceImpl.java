package com.capg.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.DiagnosticCenterDao;
import com.capg.hcs.entity.DiagnosticCenter;

@Service
public class DiagnosticCneterServiceImpl implements DiagnosticCenterService {

	@Autowired
	DiagnosticCenterDao diagnosticCenterDao;

	@Override
	public List<DiagnosticCenter> findAll() {
		// TODO Auto-generated method stub
		return diagnosticCenterDao.findAll();
	}
}
