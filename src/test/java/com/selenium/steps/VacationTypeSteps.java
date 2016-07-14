package com.selenium.steps;

import com.selenium.pages.VacationTypePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class VacationTypeSteps extends ScenarioSteps {

	VacationTypePage vacationTypePage;
	
	@Step
	public void clickVacationType(String filter, String fil) {
		vacationTypePage.clickVacationType(filter,fil);
	}

}
