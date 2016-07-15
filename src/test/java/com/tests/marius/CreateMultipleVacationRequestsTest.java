package com.tests.marius;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.marius.DayPickerSteps;
import com.selenium.steps.marius.InboxSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/mariusTest.csv", separator= ',' )
public class CreateMultipleVacationRequestsTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LogInSteps logInSteps;
    String url = "http://172.22.4.88:9090/login";
    String userName2;
    String passWord2;
    String startYear;
    String startMonth;
    String startDay;
    String endYear;
    String endMonth;
    String endDay;
        
    @Steps
    public InboxSteps inboxSteps;
    
    @Steps
    public DayPickerSteps dayPickerSteps;
    
    @Test
    public void evoPortalVacation(){
    	logInSteps.openEvoPortalPage(url);
    	logInSteps.enterUserName(userName2);
    	logInSteps.enterPassword(passWord2);   	
    	logInSteps.clickOnSingInButton();
    	inboxSteps.clickOnVacation();    
    	dayPickerSteps.clickOnNewVacationRequest();
    	dayPickerSteps.clickOnStartDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(startYear);
    	dayPickerSteps.selectMonth(startMonth);
    	dayPickerSteps.selectDay(startDay);
    	dayPickerSteps.clickOnEndDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(endYear);
    	dayPickerSteps.selectMonth(endMonth);
    	dayPickerSteps.selectDay(endDay);
    	dayPickerSteps.saveVacationRequest();
		dayPickerSteps.hoverUserAvatar(); 
//		todo(nu merge)
    	dayPickerSteps.logoutDirect();
    }
  }