package com.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyRequestsPage extends PageObject {
	@FindBy(css = "li.active-menu a")
	private WebElementFacade myRequests;

	@FindBy (css="input[id*='HOLIDAYCheckbox']")
private WebElementFacade holidayCheckBox;
	
	@FindBy(css = "input[id*='FIFTHCheckbox']")
	private WebElementFacade oneToFiveCheckBox;
	
	@FindBy(css = "input[id*='PENDINGCheckbox']")
	private WebElementFacade pendingCheckBox;
	
	@FindBy(css = "input.aui-button-input")
	private WebElementFacade applyButton;
	
	public void clickOnMyRequests() {
		myRequests.click();
		waitABit(2000);
	}
	public void clickOnHolidayCheckBox(){
		holidayCheckBox.click();
		
	}
	public void clickOnOneToFiveCheckBox(){
		oneToFiveCheckBox.click();
		
	}
	public void clickOnPendingCheckBox(){
		pendingCheckBox.click();
		
	}
	public void clickOnApplyButton(){
		applyButton.click();
		
	}
	
	
}
