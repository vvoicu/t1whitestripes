package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.DayPickerSteps;
import com.selenium.steps.InboxSteps;
import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.VacationSteps;

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
    String startYear = "2016";
    String startMonth = "Aug";
    String startDay = "16";
    String endYear = "2016";
    String endMonth = "Aug";
    String endDay = "17";
    
    String startYear1 = "2016";
    String startMonth1 = "Aug";
    String startDay1 = "18";
    String endYear1 = "2016";
    String endMonth1 = "Aug";
    String endDay1 = "19";
    
    String startYear2 = "2016";
    String startMonth2 = "Aug";
    String startDay2 = "22";
    String endYear2 = "2016";
    String endMonth2 = "Aug";
    String endDay2 = "23";
    
    String startYear3 = "2016";
    String startMonth3 = "Aug";
    String startDay3 = "24";
    String endYear3 = "2016";
    String endMonth3 = "Aug";
    String endDay3 = "25";
    
    String startYear4 = "2016";
    String startMonth4 = "Aug";
    String startDay4 = "26";
    String endYear4 = "2016";
    String endMonth4 = "Aug";
    String endDay4 = "30";
    
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
    	dayPickerSteps.clickOnNewVacationRequest();
    	dayPickerSteps.clickOnStartDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(startYear1);
    	dayPickerSteps.selectMonth(startMonth1);
    	dayPickerSteps.selectDay(startDay1);
    	dayPickerSteps.clickOnEndDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(endYear1);
    	dayPickerSteps.selectMonth(endMonth1);
    	dayPickerSteps.selectDay(endDay1);
    	dayPickerSteps.saveVacationRequest();
    	dayPickerSteps.clickOnNewVacationRequest();
    	dayPickerSteps.clickOnStartDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(startYear2);
    	dayPickerSteps.selectMonth(startMonth2);
    	dayPickerSteps.selectDay(startDay2);
    	dayPickerSteps.clickOnEndDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(endYear2);
    	dayPickerSteps.selectMonth(endMonth2);
    	dayPickerSteps.selectDay(endDay2);
    	dayPickerSteps.saveVacationRequest();
    	dayPickerSteps.clickOnNewVacationRequest();
    	dayPickerSteps.clickOnStartDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(startYear3);
    	dayPickerSteps.selectMonth(startMonth3);
    	dayPickerSteps.selectDay(startDay3);
    	dayPickerSteps.clickOnEndDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(endYear3);
    	dayPickerSteps.selectMonth(endMonth3);
    	dayPickerSteps.selectDay(endDay3);
    	dayPickerSteps.saveVacationRequest();
    	dayPickerSteps.clickOnNewVacationRequest();
    	dayPickerSteps.clickOnStartDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(startYear4);
    	dayPickerSteps.selectMonth(startMonth4);
    	dayPickerSteps.selectDay(startDay4);
    	dayPickerSteps.clickOnEndDayButton();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.clickOnMonthYearOption();
    	dayPickerSteps.selectYear(endYear4);
    	dayPickerSteps.selectMonth(endMonth4);
    	dayPickerSteps.selectDay(endDay4);
    	dayPickerSteps.saveVacationRequest();
    	
//		dayPickerSteps.hoverUserAvatar(); todo(nu merge)
		
    	dayPickerSteps.logoutDirect();
		
//		ramane userul logat si nu poate continua testul
    	
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
    	inboxSteps.clickOnLineRequest();
    }

}
