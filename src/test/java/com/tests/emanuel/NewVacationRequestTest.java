package com.tests.emanuel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.VacationSteps;
import com.selenium.steps.emanuel.NewVacationRequestSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import utils.Constants;

//@RunWith(SerenityRunner.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = Constants.CSV_FILES_PATH + "newVacationRequest.csv")
public class NewVacationRequestTest extends BaseTest{

	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public LogInSteps logInSteps;
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;

	private String comment, filter;

	@Test
	public void evoPortalVacation() {
		
		vacationSteps.clickOnVacationOption();
		vacationSteps.assertText(filter);

		newVacationRequestSteps.clickOnNewVacationRequestPage();
		newVacationRequestSteps.clickStartDate();
		newVacationRequestSteps.selectDate();
		newVacationRequestSteps.clickEndDate();
		newVacationRequestSteps.selectEndDate();
		newVacationRequestSteps.clickCommentArea();
		newVacationRequestSteps.addComment(comment);
		newVacationRequestSteps.selectSave();

	}

}