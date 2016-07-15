package com.selenium.steps.andrada;

import com.selenium.pages.andrada.FreeDaysHistoryPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class FreeDaysHistorySteps extends ScenarioSteps {
	FreeDaysHistoryPage freeDaysHistoryPage;

	@Step
	public void clickOnFreeVacationHistory() {
		freeDaysHistoryPage.clickOnFreeVacationHistory();
	}

	@Step
	public void clickOnFreeDaysHistoryTypeFilter(String filter) {
		freeDaysHistoryPage.clickOnFreeDaysHistoryTypeFilter(filter);
	}

}
