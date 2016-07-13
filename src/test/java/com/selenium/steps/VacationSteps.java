package com.selenium.steps;

import com.selenium.pages.VacationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class VacationSteps extends ScenarioSteps {
	VacationPage vacationPage;
	
	
	@Step
	public void clickOnVacationOption(){
		vacationPage.clickOnVacationOption();	
		}
	@Step
	public void assertText(String text){
		vacationPage.assertText(text);
	}
}
