package com.selenium.steps;

import com.selenium.pages.VacationTypePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationTypeSteps extends ScenarioSteps{
	
	VacationTypePage vacationTypePage;
	
	@Step
	public void selectVacationType(String type){
		vacationTypePage.selectVacationType(type);
	}

	@Step
	public void clickSpecialVacation() {
		vacationTypePage.clickSpecialVacation();
		
	}
	

}
