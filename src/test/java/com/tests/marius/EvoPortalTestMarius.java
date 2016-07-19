package com.tests.marius;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.marius.DayPickerSteps;
import com.selenium.steps.marius.InboxSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;



@RunWith(SerenityRunner.class)
public class EvoPortalTestMarius extends BaseTestMarius {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
            
    @Steps
    public InboxSteps inboxSteps;
    
    @Steps
    public DayPickerSteps dayPickerSteps;
    
    @Test
    public void evoPortalVacation(){
    	
    	logInSteps.openEvoPortalPage(url);
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
//    	inboxSteps.clickOnLineRequest();
    	
    	inboxSteps.clickOnCheckBox();
    	inboxSteps.clickOnRejectButton();
    }


}
