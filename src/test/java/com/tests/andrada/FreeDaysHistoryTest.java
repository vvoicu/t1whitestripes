package com.tests.andrada;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.andrada.FreeDaysHistorySteps;
import com.selenium.steps.andrada.VacationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class FreeDaysHistoryTest extends BaseTest{

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps logInSteps;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public FreeDaysHistorySteps freeDaysHistorySteps;

//	String url = "http://172.22.4.88:9090/login";
//	String userName = "andrada.maniac";
//	String passWord = "test1";
	String pageTitle = "Filter requests";
	String filterName = "Anniversary";

	@Test
	public void freeDaysHistory() {
		logInSteps.openEvoPortalPage(url);
		logInSteps.enterUserName(userName);
		logInSteps.enterPassword(passWord);
		logInSteps.clickOnSingInButton();
		vacationSteps.clickOnVacationOption();
		vacationSteps.vacationPageTopText(pageTitle);
		freeDaysHistorySteps.clickOnFreeVacationHistory();
		freeDaysHistorySteps.clickOnFreeDaysHistoryTypeFilter(filterName);
	}
}