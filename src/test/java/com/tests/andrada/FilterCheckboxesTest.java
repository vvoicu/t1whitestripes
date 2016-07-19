package com.tests.andrada;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.junit.After;
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
public class FilterCheckboxesTest extends BaseTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public MyRequestsSteps myRequestsSteps;
	
	

	String pageTitle = "Filter requests";
	String noticeMessage = "No vacations were found.";

	@Test
	public void myRequestsCheckBoxes() {
		logInSteps.openEvoPortalPage(url);
		logInSteps.enterUserName(userName);
		logInSteps.enterPassword(passWord);
		logInSteps.clickOnSingInButton();
		vacationSteps.clickOnVacationOption();
		vacationSteps.vacationPageTopText(pageTitle);
		myRequestsSteps.clickOnMyRequests();
		myRequestsSteps.clickOnHolidayCheckBox();
		myRequestsSteps.clickOnOneToFiveCheckBox();
		myRequestsSteps.clickOnPendingCheckBox();
		myRequestsSteps.clickOnApplyButton();
//		myRequestsSteps.assertText(noticeMessage);
		myRequestsSteps.clickOnHolidayCheckBox();
		myRequestsSteps.clickOnOneToFiveCheckBox();
		myRequestsSteps.clickOnPendingCheckBox();
		myRequestsSteps.clickOnApplyButton();
	}
	@After
	public void dataWrite() throws IOException {

		Properties prop = new Properties();
		OutputStream output = null;
		output = new FileOutputStream(getClass().getSimpleName() + ".properties");
		prop.setProperty("lalala", "nonoo");
		prop.setProperty("user", "andrada");
		prop.store(output, "Write something");

	}
}

