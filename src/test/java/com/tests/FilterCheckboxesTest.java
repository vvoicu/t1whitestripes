package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.MyRequestsSteps;
import com.selenium.steps.VacationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class FilterCheckboxesTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public MyRequestsSteps myRequestsSteps;
	String textToAssert = "No vacations were found.";

	@Test
	public void myRequestsCheckBoxes() {
		myRequestsSteps.clickOnMyRequests();
		myRequestsSteps.clickOnHolidayCheckBox();
		myRequestsSteps.clickOnOneToFiveCheckBox();
		myRequestsSteps.clickOnPendingCheckBox();
		myRequestsSteps.clickOnApplyButton();
		myRequestsSteps.assertText(textToAssert);
		myRequestsSteps.clickOnHolidayCheckBox();
		myRequestsSteps.clickOnOneToFiveCheckBox();
		myRequestsSteps.clickOnPendingCheckBox();
		myRequestsSteps.clickOnApplyButton();
	}
}
