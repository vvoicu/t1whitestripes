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


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/csv/newVacationRequest.csv")
public class NewVacationRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public VacationSteps vacationSteps;
    @Steps
    public LogInSteps logInSteps;
    private String username,password,comment,url,filter;
    
     @Steps
    public NewVacationRequestSteps newVacationRequestSteps;
   
    
    
    @Test
    public void evoPortalVacation(){
    	logInSteps.openEvoPortalPage(url);
    	logInSteps.enterUserName(username);
    	logInSteps.enterPassword(password);
    	logInSteps.clickOnSingInButton();
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