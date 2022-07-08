package com.tyss.dashboard.users.mng.model;

import java.util.List;

public class StudentDto {

	private String name;
	private String email;
	private String phone;
	private String batchCode;
	private String branch;
	private boolean isRegistered;
	private List<String> licenseId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public List<String> getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(List<String> licenseId) {
		this.licenseId = licenseId;
	}

}
