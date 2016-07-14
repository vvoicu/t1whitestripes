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
    String filter = "Holiday";
    String daysNumber = "1 - 5";
    String vacationStatus = "Pending";
    String textToAssert = "No vacations were found.";
    String text2 = "Holyday";
    String name = "Andrada Maniac";
    String assertVacation = "\"State\" Vacation Request";
    
    
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
//    	myRequestsSteps.clickOnOneToFiveCheckBox();
//    	myRequestsSteps.clickOnPendingCheckBox();
//    	myRequestsSteps.clickOnApplyButton();
//    	myRequestsSteps.clickOnHolidayCheckBox();
//    	myRequestsSteps.clickOnOneToFiveCheckBox();
//    	myRequestsSteps.clickOnPendingCheckBox();
//    	myRequestsSteps.clickOnApplyButton();
//    	myRequestsSteps.clickVacationTypeFilter(filter);
//    	myRequestsSteps.clickOnVacationDaysNumberFilter(daysNumber);
//    	myRequestsSteps.clickVacationStatusFilterContainerList(vacationStatus);
//    	myRequestsSteps.clickOnApplyButton();
//    	myRequestsSteps.assertText(textToAssert);
//    	myRequestsSteps.clickOnHolidayCheckBox();
//    	myRequestsSteps.clickOnOneToFiveCheckBox();
//    	myRequestsSteps.clickOnPendingCheckBox();
    	myRequestsSteps.clickOnApplyButton();
       	myRequestsSteps.assertOnSelectedFilterInTableList(text2);
       	myRequestsSteps.clickOnNameInTableList(name);
//       	myRequestsSteps.clickOnMyRequests();
//       	myRequestsSteps.clickOnShowOnlyFutureVacationsCheckBox();
//       	myRequestsSteps.clickOnApplyButton();
//       	myRequestsSteps.clickOnShowOnlyFutureVacationsCheckBox();
//       	myRequestsSteps.clickOnApplyButton();
//       	
       	
//    	myRequestsSteps.assertVacationRequestText(assertVacation);
    	
    }

}
