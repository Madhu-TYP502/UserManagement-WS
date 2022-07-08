package com.tyss.dashboard.users.mng.analytics.models;

import java.util.List;

public class AutomationScripts {

	private int totalStudentsWritten;
	private int totalStudentNotsWritten;
	private double avgStepsperScript;
	private double avgStcripts;
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

	public double getAvgStepsperScript() {
		return avgStepsperScript;
	}

	public void setAvgStepsperScript(double avgStepsperScript) {
		this.avgStepsperScript = avgStepsperScript;
	}

	public double getAvgStcripts() {
		return avgStcripts;
	}

	public void setAvgStcripts(double avgStcripts) {
		this.avgStcripts = avgStcripts;
	}

	public List<Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

}
