package com.tests.andrada;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.MyRequestsSteps;
import com.selenium.steps.andrada.VacationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class FilterAndTableTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public MyRequestsSteps myRequestsSteps;

	
	String url = "http://172.22.4.88:9090/login";
	String userName = "andrada.maniac";
	String passWord = "test1";
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
