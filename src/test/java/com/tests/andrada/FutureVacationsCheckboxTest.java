package com.tests.andrada;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.MyRequestsSteps;
import com.selenium.steps.andrada.VacationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class FutureVacationsCheckboxTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;
    @Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	
    @Steps
    public MyRequestsSteps myRequestsSteps;
  
    String url = "http://172.22.4.88:9090/login";
	String userName = "andrada.maniac";
	String passWord = "test1";
	String text = "Filter requests";
    String text3 = "2016";
    
    @Test
    public void showOnlyFutureVacationCheckBox(){
    	logInSteps.openEvoPortalPage(url);
		logInSteps.enterUserName(userName);
		logInSteps.enterPassword(passWord);
		logInSteps.clickOnSingInButton();
		vacationSteps.clickOnVacationOption();
		vacationSteps.assertText(text);
       	myRequestsSteps.clickOnMyRequests();
       	myRequestsSteps.clickOnShowOnlyFutureVacationsCheckBox();
       	myRequestsSteps.clickOnApplyButton();
       	myRequestsSteps.assertDate(text3);
       	myRequestsSteps.clickOnShowOnlyFutureVacationsCheckBox();
       	myRequestsSteps.clickOnApplyButton();
    	
    }

}
