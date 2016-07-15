package com.tests.andrada;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.MyRequestsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class FilterAndTableTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public MyRequestsSteps myRequestsSteps;
  
   
    
    String textToAssert = "No vacations were found.";
    String text2 = "Holyday";
    String name = "Andrada Maniac";
    String assertVacation = "Vacation Request";
@Test
public void filterAndTableTest(){
	myRequestsSteps.clickOnHolidayCheckBox();
	myRequestsSteps.clickOnOneToFiveCheckBox();
	myRequestsSteps.clickOnPendingCheckBox();
	myRequestsSteps.clickOnApplyButton();
   	myRequestsSteps.assertOnSelectedFilterInTableList(text2);
   	myRequestsSteps.clickOnNameInTableList(name);
   	myRequestsSteps.assertTextInStateVacationRequest(assertVacation);
   	
}

}
