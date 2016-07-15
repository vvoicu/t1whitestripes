package com.tests.emanuel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.VacationSteps;
import com.selenium.steps.emanuel.NewVacationRequestSteps;
import com.selenium.steps.emanuel.VacationTypeSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class VacationTypeTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps logInSteps;

	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;

	@Steps
	public VacationTypeSteps vacationTypeSteps;

	String url = "http://172.22.4.88:9090/login";
	String userName = "petru.radac";
	String passWord = "test";
	String requestType = "Special vacation";
	String requestTypeName = "Funeral";
	String text = "Filter requests";

	@Test
	public void vacationTest() {
		logInSteps.openEvoPortalPage(url);
		logInSteps.enterUserName(userName);
		logInSteps.enterPassword(passWord);
		logInSteps.clickOnSingInButton();
		vacationSteps.clickOnVacationOption();
		vacationSteps.assertText(text);

		newVacationRequestSteps.clickOnNewVacationRequestPage();
		vacationTypeSteps.clickVacationType(requestType,requestTypeName);
		
		newVacationRequestSteps.selectSave();
	
	}

}
