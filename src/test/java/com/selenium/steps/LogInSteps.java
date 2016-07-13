package com.selenium.steps;

import com.selenium.pages.LogInPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class LogInSteps extends ScenarioSteps {
	LogInPage logInPage;
	@Step
	public void openEvoPortalPage(String url) {
		logInPage.getDriver().manage().window().maximize();
		logInPage.getDriver().get(url);

	}
	@Step
	public void enterUserName(String text){
		logInPage.enterUserName(text);
	}
	@Step
	public void enterPassword(String text){
		logInPage.enterPassword(text);
	}
	@Step
	public void clickOnSingInButton(){
		logInPage.clickOnSingInButton();
	}
}
