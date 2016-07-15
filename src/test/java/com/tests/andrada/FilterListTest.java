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
public class FilterListTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public MyRequestsSteps myRequestsSteps;
	@Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	String url = "http://172.22.4.88:9090/login";
	String userName = "andrada.maniac";
	String passWord = "test1";
	String text = "Filter requests";
	String typeFilter = "Holiday";
	String daysNumberFilter = "1 - 5";
	String vacationStatusFilter = "Pending";
	String textToAssert = "No vacations were found.";

	@Test
	public void myRequestFilterList() {
		logInSteps.openEvoPortalPage(url);
		logInSteps.enterUserName(userName);
		logInSteps.enterPassword(passWord);
		logInSteps.clickOnSingInButton();
		vacationSteps.clickOnVacationOption();
		vacationSteps.assertText(text);
		myRequestsSteps.clickOnMyRequests();
		myRequestsSteps.clickVacationTypeFilterList(typeFilter);
		myRequestsSteps.clickOnVacationDaysNumberFilterList(daysNumberFilter);
		myRequestsSteps.clickVacationStatusFilterContainerList(vacationStatusFilter);
		myRequestsSteps.clickOnApplyButton();
		myRequestsSteps.assertText(textToAssert);
	}

}
