package com.tests.andrada;


import org.junit.Test;
import org.junit.runner.RunWith;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.MyRequestsSteps;
import com.selenium.steps.andrada.VacationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class FilterAndTableTest extends BaseTest{


	@Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public MyRequestsSteps myRequestsSteps;

	
	String totPageText = "Filter requests";
	String filterNameOnTable = "Holyday";
	String nameInTableList = "Andrada Maniac";
	String vacationRequestTopPageText = "Vacation Request";
	String statusText = "Pending";
	@Test
	public void filterAndTableTest() {
		logInSteps.openEvoPortalPage(url);
		logInSteps.enterUserName(userName);
		logInSteps.enterPassword(passWord);
		logInSteps.clickOnSingInButton();
		vacationSteps.clickOnVacationOption();
		vacationSteps.vacationPageTopText(totPageText);
		myRequestsSteps.clickOnMyRequests();
		myRequestsSteps.clickOnHolidayCheckBox();
		myRequestsSteps.clickOnApplyButton();
		myRequestsSteps.assertOnSelectedFilterInTableList(filterNameOnTable);
		myRequestsSteps.clickOnNameInTableList(nameInTableList);
		myRequestsSteps.assertTextInStateVacationRequest(vacationRequestTopPageText);
		myRequestsSteps.clickOnStatusElementInList(statusText);

	}

}
