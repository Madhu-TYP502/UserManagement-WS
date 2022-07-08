package com.tyss.dashboard.users.mng.analytics.services;

import com.tyss.dashboard.users.mng.analytics.models.AutomationScripts;
import com.tyss.dashboard.users.mng.analytics.models.DashboardComponents;
import com.tyss.dashboard.users.mng.analytics.models.ManualTestCasesInfo;
import com.tyss.dashboard.users.mng.analytics.models.StudentsInfo;

public class UserAnalyticsImpl implements UserAnalytics {

	StudentsInfo studentsInfo;
	ManualTestCasesInfo manualTestCases;
	AutomationScripts automationScripts;

	@Override
	public DashboardComponents getDashboardStats() {

		buildStudentsInfo();
		buildManualTestCasesInfo();
		buildAutomationScriptsInfo();

		return new DashboardComponents(studentsInfo, manualTestCases, automationScripts);
	}

	public void buildStudentsInfo() {

	}

	public void buildManualTestCasesInfo() {

	}	

	public void buildAutomationScriptsInfo() {

	}

	public void verifyStudentsInfo() {

		//get users info from flinko
		
		//find users with userID(email) from students repo
		
		//if found update feild isRegistered as true
		
		//find super admin of LicID(s)
		
		//latest super admin is the new trainer
		
		//add LiceneseID to end of LidList
		
		//update student script info	
		
	}
	
	public void verifyOneStudentInfo(String email) {

		//get user info from flinko
		
		//find user with userID(email) from students repo
		
		//if found update feild isRegistered as true
		
		//add LiceneseID to end of LidList
	}

}
