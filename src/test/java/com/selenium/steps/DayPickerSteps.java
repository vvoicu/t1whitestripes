package com.selenium.steps;

import com.selenium.pages.DayPickerPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DayPickerSteps extends ScenarioSteps{
	DayPickerPage dayPickerPage;
	
	
	@Step
	public void clickOnNewVacationRequest(){
		dayPickerPage.clickOnNewVacationRequest();
	}
	
	@Step
	public void clickOnStartDayButton(){
		dayPickerPage.clickOnStartDayButton();
	}
	
	@Step
	public void clickOnEndDayButton(){
		dayPickerPage.clickOnEndDayButton();
	}
	
	@Step
	public void clickOnMonthYearOption(){
		dayPickerPage.clickOnMonthYearOption();
	}
	
	
	@Step
	public void selectDay(String text){
		dayPickerPage.selectDate(text);
	}
	
	@Step	
	public void selectMonth(String text){
		dayPickerPage.selectMonth(text);
	}
	
	@Step
	public void selectYear(String text){
		dayPickerPage.selectYear(text);
	}
	
	@Step
	public void saveVacationRequest(){
		dayPickerPage.saveVacationRequest();
	}
	
	@Step
	public void hoverUserAvatar(){
		dayPickerPage.hoverUserAvatar();
	}
	
	@Step
	public void logoutDirect(){
		dayPickerPage.logoutDirect();
	}
	
	
}
