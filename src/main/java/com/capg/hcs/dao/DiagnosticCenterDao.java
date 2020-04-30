package com.capg.hcs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.hcs.entity.DiagnosticCenter;
import com.capg.hcs.entity.Test;
@Repository
public interface DiagnosticCenterDao extends JpaRepository<DiagnosticCenter,Integer>{
	
}
