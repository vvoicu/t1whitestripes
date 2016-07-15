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
   
    String typeFilter = "Holiday";
    String daysNumberFilter = "1 - 5";
    String vacationStatusFilter = "Pending";
    String textToAssert = "No vacations were found.";
    String text2 = "Holyday";
    String name = "Andrada Maniac";
    String assertVacation = "Vacation Request";
    String text3 = "2016";
    
    
    @Test
    public void evoPortalVacation(){
    	
    	
    	myRequestsSteps.clickOnMyRequests();
    	myRequestsSteps.clickOnHolidayCheckBox();
    	myRequestsSteps.clickOnOneToFiveCheckBox();
    	myRequestsSteps.clickOnPendingCheckBox();
    	myRequestsSteps.clickOnApplyButton();
    	myRequestsSteps.clickOnHolidayCheckBox();
    	myRequestsSteps.clickOnOneToFiveCheckBox();
    	myRequestsSteps.clickOnPendingCheckBox();
    	myRequestsSteps.clickOnApplyButton();
    	
    	myRequestsSteps.clickOnMyRequests();
    	myRequestsSteps.clickVacationTypeFilterList(typeFilter);
    	myRequestsSteps.clickOnVacationDaysNumberFilterList(daysNumberFilter);
    	myRequestsSteps.clickVacationStatusFilterContainerList(vacationStatusFilter);
    	myRequestsSteps.clickOnApplyButton();
    	myRequestsSteps.assertText(textToAssert);
    	
    	myRequestsSteps.clickOnHolidayCheckBox();
    	myRequestsSteps.clickOnOneToFiveCheckBox();
    	myRequestsSteps.clickOnPendingCheckBox();
    	myRequestsSteps.clickOnApplyButton();
       	myRequestsSteps.assertOnSelectedFilterInTableList(text2);
       	myRequestsSteps.clickOnNameInTableList(name);
       	myRequestsSteps.assertTextInStateVacationRequest(assertVacation);
       	
       	myRequestsSteps.clickOnMyRequests();
       	myRequestsSteps.clickOnShowOnlyFutureVacationsCheckBox();
       	myRequestsSteps.clickOnApplyButton();
       	myRequestsSteps.assertDate(text3);
       	myRequestsSteps.clickOnShowOnlyFutureVacationsCheckBox();
       	myRequestsSteps.clickOnApplyButton();
    	
    }

}
