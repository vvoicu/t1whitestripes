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

	
	String text = "Filter requests";
	String textToAssert = "No vacations were found.";
	String text2 = "Holyday";
	String name = "Andrada Maniac";
	String assertVacation = "Vacation Request";
	@Test
	public void filterAndTableTest() {
		logInSteps.openEvoPortalPage(url);
		logInSteps.enterUserName(userName);
		logInSteps.enterPassword(passWord);
		logInSteps.clickOnSingInButton();
		vacationSteps.clickOnVacationOption();
		vacationSteps.assertText(text);
		myRequestsSteps.clickOnMyRequests();
		myRequestsSteps.clickOnHolidayCheckBox();
		myRequestsSteps.clickOnApplyButton();
		myRequestsSteps.assertOnSelectedFilterInTableList(text2);
		myRequestsSteps.clickOnNameInTableList(name);
		myRequestsSteps.assertTextInStateVacationRequest(assertVacation);

	}

}
