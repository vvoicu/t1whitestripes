package com.selenium.steps;

import com.selenium.pages.MyRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class MyRequestsSteps extends ScenarioSteps {
	MyRequestsPage myRequestsPage;

	@Step
	public void clickOnMyRequests() {
		myRequestsPage.clickOnMyRequests();
	}
	@Step
	public void clickOnHolidayCheckBox(){
		myRequestsPage.clickOnHolidayCheckBox();
	}
	@Step
	public void clickOnOneToFiveCheckBox(){
		myRequestsPage.clickOnOneToFiveCheckBox();
	}
	@Step
	public void clickOnPendingCheckBox(){
		myRequestsPage.clickOnPendingCheckBox();
	}
	@Step
	public void clickOnApplyButton(){
		myRequestsPage.clickOnApplyButton();
	}
}
