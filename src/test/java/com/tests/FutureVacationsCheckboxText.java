package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.MyRequestsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class FutureVacationsCheckboxText {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public MyRequestsSteps myRequestsSteps;
  
   
    
 
    String text3 = "2016";
    
    
    @Test
    public void showOnlyFutureVacationCheckBox(){
    
       	myRequestsSteps.clickOnMyRequests();
       	myRequestsSteps.clickOnShowOnlyFutureVacationsCheckBox();
       	myRequestsSteps.clickOnApplyButton();
       	myRequestsSteps.assertDate(text3);
       	myRequestsSteps.clickOnShowOnlyFutureVacationsCheckBox();
       	myRequestsSteps.clickOnApplyButton();
    	
    }

}
