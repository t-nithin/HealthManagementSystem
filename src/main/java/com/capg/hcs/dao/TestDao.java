package com.capg.hcs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.hcs.entity.Test;

@Repository
public interface TestDao extends JpaRepository<Test,Integer>{
	@Query(" FROM Test where center.centerId=:id")
	public List<Test>  findTestInCenter(@Param("id") int id);
}
