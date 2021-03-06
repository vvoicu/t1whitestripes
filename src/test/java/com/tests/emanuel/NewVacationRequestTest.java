package com.tests.emanuel;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.VacationSteps;
import com.selenium.steps.emanuel.NewVacationRequestSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import utils.Constants;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = Constants.CSV_FILES_PATH + "NewVacationRequest.csv")

public class NewVacationRequestTest extends BaseTestEmanuel{

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
  vacationSteps.vacationPageTopText(filter);

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