package com.tests.emanuel;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.VacationSteps;
import com.selenium.steps.emanuel.MyFreeDaysSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import utils.Constants;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = Constants.CSV_FILES_PATH + "MyFreeDays.csv")

public class MyFreeDaysTest extends BaseTestEmanuel {

	@Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public MyFreeDaysSteps myFreeDaysSteps;

	private String filter;

	@Test
	public void myFreeDays() {

		vacationSteps.clickOnVacationOption();
		vacationSteps.vacationPageTopText(filter);
		myFreeDaysSteps.clickOnMyFreeDays();
		myFreeDaysSteps.clickOnYear1();
		myFreeDaysSteps.clickOnYear2();
		myFreeDaysSteps.backButton();

	}

}
