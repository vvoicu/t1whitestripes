package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyRequestsSteps;
import com.selenium.steps.VacationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class EvoPortalTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public VacationSteps vacationSteps;
    @Steps
    public MyRequestsSteps myRequestsSteps;
    @Steps
    public LogInSteps logInSteps;
    String url = "http://172.22.4.88:9090/login";
    String userName = "andrada.maniac";
    String passWord = "test1";
    String text = "Filter requests";
    
    @Test
    public void evoPortalVacation(){
    	logInSteps.openEvoPortalPage(url);
    	logInSteps.enterUserName(userName);
    	logInSteps.enterPassword(passWord);
    	logInSteps.clickOnSingInButton();
    	vacationSteps.clickOnVacationOption();
    	vacationSteps.assertText(text);
    	myRequestsSteps.clickOnMyRequests();
    	myRequestsSteps.clickOnHolidayCheckBox();
    	myRequestsSteps.clickOnOneToFiveCheckBox();
    	myRequestsSteps.clickOnPendingCheckBox();
    	myRequestsSteps.clickOnApplyButton();
    	
    }

}
