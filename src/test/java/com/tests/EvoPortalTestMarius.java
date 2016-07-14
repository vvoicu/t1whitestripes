package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.DayPickerSteps;
import com.selenium.steps.InboxSteps;
import com.selenium.steps.LogInSteps;
import com.selenium.steps.VacationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class EvoPortalTestMarius {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public VacationSteps vacationSteps;
    @Steps
    public LogInSteps logInSteps;
    String url = "http://172.22.4.88:9090/login";
    String userName = "marius.chesovan";
    String passWord = "010485";
    
    String userName2 = "petru.radac";
    String passWord2 = "test";
    
    
    @Steps
    public InboxSteps inboxSteps;
    
    @Steps
    public DayPickerSteps selectStartDate;
    
    @Test
    public void evoPortalVacation(){
    	logInSteps.openEvoPortalPage(url);
    	logInSteps.enterUserName(userName2);
    	logInSteps.enterPassword(passWord2);   	
    	logInSteps.clickOnSingInButton();
    	inboxSteps.clickOnVacation();    	
    	
    	
    	logInSteps.enterUserName(userName);
    	logInSteps.enterPassword(passWord);
    	logInSteps.clickOnSingInButton();
    	inboxSteps.clickOnVacation();
    	inboxSteps.clickOnInbox();
    	inboxSteps.clickOnCheckBox();
    	inboxSteps.clickOnCheckBox();
    	inboxSteps.clickOnCheckBox();
    	inboxSteps.clickOnApproveButton();
    	inboxSteps.clickOnCheckBox();
    	inboxSteps.clickOnRejectButton();
    	inboxSteps.clickOnCheckBoxMultiple();
    	inboxSteps.clickOnCheckBoxMultiple();
    	inboxSteps.clickOnLineRequest();
    	inboxSteps.clickOnRejectButtonInsideRequest();
    	inboxSteps.clickOnLineRequest();
    	inboxSteps.clickOnApproveButtonInsideRequest();
    	inboxSteps.clickOnLineRequest();
    }

}
