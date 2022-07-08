package com.tyss.dashboard.users.mng.analytics.models;

public class DashboardComponents {

	private StudentsInfo studentsInfo;
	private ManualTestCasesInfo manualTestCases;
	private AutomationScripts automationScripts;

	public DashboardComponents(StudentsInfo studentsInfo, ManualTestCasesInfo manualTestCases,
			AutomationScripts automationScripts){
		super();
		this.studentsInfo = studentsInfo;
		this.manualTestCases = manualTestCases;
		this.automationScripts = automationScripts;
	}

	public StudentsInfo getStudentsInfo() {
		return studentsInfo;
	}

	public void setStudentsInfo(StudentsInfo studentsInfo) {
		this.studentsInfo = studentsInfo;
	}

	public ManualTestCasesInfo getManualTestCases() {
		return manualTestCases;
	}

	public void setManualTestCases(ManualTestCasesInfo manualTestCases) {
		this.manualTestCases = manualTestCases;
	}

	public AutomationScripts getAutomationScripts() {
		return automationScripts;
	}

	public void setAutomationScripts(AutomationScripts automationScripts) {
		this.automationScripts = automationScripts;
	}

}
