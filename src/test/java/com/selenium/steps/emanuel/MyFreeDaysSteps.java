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
	
	@Step
	public void clickOnYear1(){
		myFreeDays.clickOnYear1();
	}
	
	@Step
	public void clickOnYear2(){
		myFreeDays.clicOnYear2();
	}
	
	@Step
	public void backButton(){
		myFreeDays.backButton();
	}
	
}
