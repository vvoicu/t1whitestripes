package com.tests.emanuel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.VacationSteps;
import com.selenium.steps.emanuel.MyFreeDaysSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import utils.Constants;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = Constants.CSV_FILES_PATH + "myFreeDays.csv")

public class MyFreeDaysTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public MyFreeDaysSteps myFreeDaysSteps;

	private String username, password, filter;

	@Test
	public void myFreeDays() {

		logInSteps.openEvoPortalPage(Constants.URL);
		logInSteps.enterUserName(username);
		logInSteps.enterPassword(password);
		logInSteps.clickOnSingInButton();
		vacationSteps.clickOnVacationOption();
		vacationSteps.assertText(filter);

		myFreeDaysSteps.clickOnMyFreeDays();
		myFreeDaysSteps.clickOnYear1();
		myFreeDaysSteps.clickOnYear2();
		myFreeDaysSteps.backButton();

	}

}
