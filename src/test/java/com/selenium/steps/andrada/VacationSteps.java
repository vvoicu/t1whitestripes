package com.selenium.steps.andrada;

import com.selenium.pages.andrada.VacationPage;

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
	public void vacationPageTopText(String text){
		vacationPage.assertText(text);
	}
}
