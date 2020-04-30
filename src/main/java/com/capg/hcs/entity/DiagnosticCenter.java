package com.capg.hcs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="center_table")
public class DiagnosticCenter {

	  @Id
	  @Column(name="centerid")
	  private int centerId;
	  
	  @Column(name="centername",length=15)
	  private String centerName;
	  
	
	  @OneToMany(mappedBy="center")
	  @JsonIgnore
	  List<Test>  test = new ArrayList<>();

	public int getCenterId() {
		return centerId;
	}



	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}



	public String getCenterName() {
		return centerName;
	}



	public void setCenterName(String centerName) {
		this.centerName = centerName;
		
	}



	public List<Test> getTest() {
		return test;
	}



	public void setTest(List<Test> test) {
		this.test = test;
	}



	
}
