package com.selenium.steps.emanuel;

import com.selenium.pages.emanuel.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class NewVacationRequestSteps extends ScenarioSteps{
	NewVacationRequestPage newVacationRequestPage;
	
	@Step
	public void clickOnNewVacationRequestPage()
	{
		newVacationRequestPage.clickNewRequestPage();
	}

	@Step
	public void clickStartDate(){
		newVacationRequestPage.clickStartDate();
	}
	
	@Step
	public void selectDate(){
		newVacationRequestPage.selectDate();
	}
	
	@Step
	public void clickEndDate(){
		newVacationRequestPage.clickEndDate();
	}
	
	@Step
	public void selectEndDate(){
		newVacationRequestPage.selectEndDate();
	}
	
	@Step
	public void clickCommentArea(){
		newVacationRequestPage.clickCommentArea();
	}
	
	@Step
	public void addComment(String comment){
		newVacationRequestPage.addComment(comment);
	}
	
	
	@Step
	public void selectSave(){
		newVacationRequestPage.selectSave();
	}

	
}
