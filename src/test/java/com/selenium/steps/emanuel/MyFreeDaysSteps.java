package com.selenium.steps.emanuel;

import com.selenium.pages.emanuel.MyFreeDaysPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class MyFreeDaysSteps extends ScenarioSteps{
	MyFreeDaysPage myFreeDays;
	
	
	@Step
	public void clickOnMyFreeDays(){
		myFreeDays.clickMyFreeDays();
	}
}
