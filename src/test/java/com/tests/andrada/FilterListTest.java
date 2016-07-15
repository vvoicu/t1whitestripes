package com.tests.andrada;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.MyRequestsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class FilterListTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public MyRequestsSteps myRequestsSteps;
	String typeFilter = "Holiday";
	String daysNumberFilter = "1 - 5";
	String vacationStatusFilter = "Pending";
	String textToAssert = "No vacations were found.";

	@Test
	public void myRequestFilterList() {
		myRequestsSteps.clickOnMyRequests();
		myRequestsSteps.clickVacationTypeFilterList(typeFilter);
		myRequestsSteps.clickOnVacationDaysNumberFilterList(daysNumberFilter);
		myRequestsSteps.clickVacationStatusFilterContainerList(vacationStatusFilter);
		myRequestsSteps.clickOnApplyButton();
		myRequestsSteps.assertText(textToAssert);
	}

}
