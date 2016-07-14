package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

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
	
	@FindBy(css = "div.filter-content div[class$='aui-column-first ']  span.aui-field-content ")
	private List<WebElement> vacationTypeFilterContainerList;
	
	String filterNameCssSelector = "label";
	String filterCheckboxCssSelector = "span input[type='checkbox']";
	
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
	
	public void clickVacationTypeFilter(String filter){
		boolean filterFound = false;
		for (WebElement filterElement : vacationTypeFilterContainerList) {
		
			WebElement filterName = filterElement.findElement(By.cssSelector(filterNameCssSelector));
			if(filterName.getText().contentEquals(filter)){
				filterFound = true;
				WebElement checkbox = filterElement.findElement(By.cssSelector(filterCheckboxCssSelector));
				checkbox.click();
				break;
			}
		}
		Assert.assertTrue("The filter was not found", filterFound);
	}
	
	
	
	
}
