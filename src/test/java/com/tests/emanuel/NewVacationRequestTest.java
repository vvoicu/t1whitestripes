package com.tests.emanuel;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.VacationSteps;
import com.selenium.steps.emanuel.NewVacationRequestSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class NewVacationRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public VacationSteps vacationSteps;
    @Steps
    public LogInSteps logInSteps;
    
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;
    
    String url = "http://172.22.4.88:9090/login";
    String userName = "petru.radac";
    String passWord = "test";
    String text = "Filter requests";
   
   
    
    @Test
    public void evoPortalVacation(){
    	logInSteps.openEvoPortalPage(url);
    	logInSteps.enterUserName(userName);
    	logInSteps.enterPassword(passWord);
    	logInSteps.clickOnSingInButton();
    	vacationSteps.clickOnVacationOption();
    	vacationSteps.assertText(text);
    	
    	
    	
    	newVacationRequestSteps.clickOnNewVacationRequestPage();
    	newVacationRequestSteps.clickStartDate();
    	newVacationRequestSteps.selectDate();
    	newVacationRequestSteps.clickEndDate();
    	newVacationRequestSteps.selectEndDate();
   
    	newVacationRequestSteps.selectSave();
    	
    }

}