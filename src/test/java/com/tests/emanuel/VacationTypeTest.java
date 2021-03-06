package com.tests.emanuel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.VacationSteps;
import com.selenium.steps.emanuel.NewVacationRequestSteps;
import com.selenium.steps.emanuel.VacationTypeSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import utils.Constants;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value=Constants.CSV_FILES_PATH + "VacationType.csv")

public class VacationTypeTest extends BaseTestEmanuel {

	@Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	@Steps
	public VacationTypeSteps vacationTypeSteps;

	private String filter, requestType, requestTypeName;

	@Test
	public void vacationTest() {
		
		vacationSteps.clickOnVacationOption();
		vacationSteps.vacationPageTopText(filter);
		newVacationRequestSteps.clickOnNewVacationRequestPage();
		vacationTypeSteps.clickVacationType(requestType, requestTypeName);
		newVacationRequestSteps.selectSave();

	}

}
