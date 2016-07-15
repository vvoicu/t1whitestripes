package com.selenium.pages.emanuel;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VacationTypePage extends PageObject {
	
	private String specialVacationName="Special Vacation";
	private String maternityLeaveName = "Maternity Leave";

	@FindBy(css = "div.vacationType")
	private WebElement vacationType;

	@FindBy(css = "select#_evovacation_WAR_EvoVacationportlet_specialReason")
	private WebElementFacade specialVacationList;

	@FindBy(css = "#vacationTypeContainer >div >div:nth-child(5) select")
	private WebElementFacade maternityLeaveList;

	public void clickVacationType(String vacationName, String additionalOption) {
		boolean isfoundElement = false;

		List<WebElement> optionsList = vacationType.findElements(By.cssSelector("div.vacationTypeChoice>label"));

		for (WebElement webElement : optionsList) {
			String optionName = webElement.getText();
			if (optionName.contains(vacationName)) {
				isfoundElement = true;
				webElement.click();
				break;
			}

		}
		Assert.assertTrue("The element was not found", isfoundElement);
		if (vacationName.toLowerCase().contentEquals(specialVacationName.toLowerCase())) {

			specialVacationList.click();
			clickSpecialVacation(additionalOption);
		}

		if (vacationName.toLowerCase().contentEquals(maternityLeaveName.toLowerCase())) {
			maternityLeaveList.click();
			clickMaternityLeave(additionalOption);
		}

	}

	public void clickSpecialVacation(String specialVacationName) {
		List<WebElement> vacationList = specialVacationList.findElements(By.tagName("option"));

		for (WebElement webElement : vacationList) {
			String vacationName = webElement.getText();
			if (vacationName.contains(specialVacationName)) {
				webElement.click();
			}

		}
	}

	public void clickMaternityLeave(String maternityLeaveName) {
		List<WebElement> maternityList = maternityLeaveList
				.findElements(By.cssSelector("#_evovacation_WAR_EvoVacationportlet_maternityLeave>option"));

		for (WebElement webElement : maternityList) {
			String maternityName = webElement.getText();
			if (maternityName.contains(maternityLeaveName)) {
				webElement.click();
			}

		}
	}

}
