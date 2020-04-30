package com.capg.hcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tests_table")
public class Test {

	

	@Id
	
	@Column(name="testid")
	private int testId;
	
	@Column(name="testname",length=15)
	private String testName;

	@ManyToOne
	@JoinColumn(name="centerid")
	private DiagnosticCenter center;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public DiagnosticCenter getCenter() {
		return center;
	}

	public void setCenter(DiagnosticCenter center) {
		this.center = center;
	}

	
}
