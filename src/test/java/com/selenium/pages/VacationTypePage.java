package com.selenium.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

public class VacationTypePage extends PageObject {

	@FindBy(css = "div.vacationType")
	private WebElement vacationType;
	
	String nameCssSelector = "label";
	String radioCssSelector = "div input[type='radio']";

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade selectVacWithoutPay;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade selectSickLeave;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CS")
	private WebElementFacade selectSpecialVacation;

	@FindBy(css = "select#_evovacation_WAR_EvoVacationportlet_specialReason")
	private WebElementFacade specialVacationList;

	@FindBy(css = "#vacationTypeContainer > div > div:nth-child(4) select")
	private WebElementFacade selectVacationTypeContainer;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_ML")
	private WebElementFacade selectMaternityLeave;

	@FindBy(css = "#vacationTypeContainer >div >div:nth-child(5) select")
	private WebElementFacade maternityLeaveList;

	@FindBy(css = "#vacationTypeContainer >div >div:nth-child(5) select option:first-child")
	private WebElementFacade selectPrenatal;

	@FindBy(css = "#vacationTypeContainer >div >div:nth-child(5) select option:nth-child(2)")
	private WebElementFacade selectConcediuIngrijireCopii;

	public void selectVacWithoutPay() {
		selectVacWithoutPay.click();
	}

	public void selectSickLeave() {
		selectSickLeave.click();
	}

	public void selectSpecialVacation() {
		selectSpecialVacation.click();
	}

	public void clickMenu() {
		specialVacationList.click();
	}

	public void selectVacationType(String type) {
		element(selectVacationTypeContainer).selectByVisibleText(type);
	}

	public void selectMaternityLeave() {
		selectMaternityLeave.click();
	}

	public void clickMenuList() {
		maternityLeaveList.click();
	}

	public void selectPrenatal() {
		selectPrenatal.click();
	}

	public void selectConcediuIngrijire() {
		selectConcediuIngrijireCopii.click();
	}

	public void clickSpecialVacation() {
		selectSpecialVacation.click();
	}

	private String specialVacationName = "Special Vacation";
	private String maternityLeaveName = "Maternity Leave";

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

		 if(vacationName.toLowerCase().contentEquals(maternityLeaveName.toLowerCase()))
		 {
		 maternityLeaveList.click();
		 clickMaternityLeave(additionalOption);
		 }
	}

	public void clickSpecialVacation(String specialVacationName){
		List<WebElement> vacationList=specialVacationList.findElements(By.tagName("option"));
			//	cssSelector("#_evovacation_WAR_EvoVacationportlet_specialReason>option"));
	
		for (WebElement webElement : vacationList) {
			String vacationName = webElement.getText();
			if(vacationName.contains(specialVacationName)){
				webElement.click();
			}
			
		}
	}
	
	public void clickMaternityLeave(String maternityLeaveName){
		List<WebElement> maternityList = maternityLeaveList.findElements(By.cssSelector("#_evovacation_WAR_EvoVacationportlet_maternityLeave>option"));
		
		for (WebElement webElement : maternityList) {
			String maternityName = webElement.getText();
			if(maternityName.contains(maternityLeaveName)){
				webElement.click();
			}
			
			
		}
	}
}
