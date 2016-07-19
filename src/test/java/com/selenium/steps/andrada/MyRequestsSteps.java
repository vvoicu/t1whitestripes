package com.selenium.steps.andrada;

import com.selenium.pages.andrada.MyRequestsPage;

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
	public void clickOnHolidayCheckBox() {
		myRequestsPage.clickOnHolidayCheckBox();
	}

	@Step
	public void clickOnOneToFiveCheckBox() {
		myRequestsPage.clickOnOneToFiveCheckBox();
	}

	@Step
	public void clickOnPendingCheckBox() {
		myRequestsPage.clickOnPendingCheckBox();
	}

	@Step
	public void clickOnApplyButton() {
		myRequestsPage.clickOnApplyButton();
	}

	@Step
	public void clickVacationTypeFilterList(String filter) {
		myRequestsPage.clickVacationTypeFilterList(filter);
	}

	@Step
	public void clickOnVacationDaysNumberFilterList(String filter) {
		myRequestsPage.clickOnVacationDaysNumberFilterList(filter);
	}

	@Step
	public void clickVacationStatusFilterContainerList(String filter) {
		myRequestsPage.clickVacationStatusFilterContainerList(filter);
	}

	@Step
	public void assertText(String textToVerify) {
		myRequestsPage.assertText(textToVerify);
	}

	@Step
	public void assertOnSelectedFilterInTableList(String elementText) {
		myRequestsPage.assertOnSelectedFilterInTableList(elementText);
	}

	@Step
	public void clickOnNameInTableList(String name) {
		myRequestsPage.clickOnNameInTableList(name);
	}

	@Step
	public void assertTextInStateVacationRequest(String assertText) {
		myRequestsPage.assertTextInStateVacationRequest(assertText);
	}

	@Step
	public void clickOnShowOnlyFutureVacationsCheckBox() {
		myRequestsPage.clickOnShowOnlyFutureVacationsCheckBox();
	}

	@Step
	public void assertDate(String text) {
		myRequestsPage.assertDate(text);
	}
	@Step
	public void clickOnStatusElementInList(String elementText) {
		myRequestsPage.clickOnStatusElementInList(elementText);
	}
}
