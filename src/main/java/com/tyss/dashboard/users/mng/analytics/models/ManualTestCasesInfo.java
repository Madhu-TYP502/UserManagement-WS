package com.tyss.dashboard.users.mng.analytics.models;

import java.util.List;

public class ManualTestCasesInfo {

	private int totalStudentsWritten;
	private int totalStudentNotsWritten;
	private double avgTestCases;
	private double avgStepsPerTestCase;
	private List<Student> studentsList;
	
	public int getTotalStudentsWritten() {
		return totalStudentsWritten;
	}

	public void setTotalStudentsWritten(int totalStudentsWritten) {
		this.totalStudentsWritten = totalStudentsWritten;
	}

	public int getTotalStudentNotsWritten() {
		return totalStudentNotsWritten;
	}

	public void setTotalStudentNotsWritten(int totalStudentNotsWritten) {
		this.totalStudentNotsWritten = totalStudentNotsWritten;
	}

	public double getAvgTestCases() {
		return avgTestCases;
	}

	public void setAvgTestCases(double avgTestCases) {
		this.avgTestCases = avgTestCases;
	}

	public double getAvgStepsPerTestCase() {
		return avgStepsPerTestCase;
	}

	public void setAvgStepsPerTestCase(double avgStepsPerTestCase) {
		this.avgStepsPerTestCase = avgStepsPerTestCase;
	}

	public List<Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

}
