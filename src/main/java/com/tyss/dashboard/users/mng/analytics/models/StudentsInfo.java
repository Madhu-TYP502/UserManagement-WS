package com.tyss.dashboard.users.mng.analytics.models;

import java.util.List;

import com.tyss.dashboard.users.mng.entities.StudentEntity;

public class StudentsInfo {

	private int totalStudents;
	private int flinkoRegistered;
	private int flinkoNotRegistered;
	private List<StudentEntity> studentList;

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public int getFlinkoRegistered() {
		return flinkoRegistered;
	}

	public void setFlinkoRegistered(int flinkoRegistered) {
		this.flinkoRegistered = flinkoRegistered;
	}

	public int getFlinkoNotRegistered() {
		return flinkoNotRegistered;
	}

	public void setFlinkoNotRegistered(int flinkoNotRegistered) {
		this.flinkoNotRegistered = flinkoNotRegistered;
	}

	public List<StudentEntity> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentEntity> studentList) {
		this.studentList = studentList;
	}

}
