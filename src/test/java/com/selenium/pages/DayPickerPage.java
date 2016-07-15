package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DayPickerPage extends PageObject {
	
	
	@FindBy(css = "img[alt='EvoPortal']")
	private WebElementFacade userAvatar;

	
	@FindBy(css = "div[id=dockbar] ul li.user-avatar")
	private WebElementFacade signOut;
	
	@FindBy(css = ".aui-column-content .carousel-slider:nth-child(1) ul li:nth-child(2) a")
	private WebElementFacade newVacationRequestAccess;
	
	@FindBy(css = "form > span:first-of-type  button")
	private WebElementFacade startDateButon;
	
	@FindBy(css = "form > span:last-of-type  button")
	private WebElementFacade endDateButon;
	
	@FindBy(css = ".Zebra_DatePicker[style*='display: block'] .dp_caption")
	private WebElementFacade monthToYeartable;
	
	@FindBy(css=".Zebra_DatePicker[style*='display: block'] .dp_daypicker tbody")
	public WebElement dayPickerContainer;
	
	@FindBy(css=".Zebra_DatePicker[style*='display: block'] .dp_monthpicker tbody")
	public WebElement monthPickerContainer;
	
	@FindBy(css=".Zebra_DatePicker[style*='display: block'] .dp_yearpicker tbody")
	public WebElement yearPickerContainer;
	
	@FindBy(css=".aui-button-holder span:first-child span input")
	public WebElement saveButton;
	
	public void clickOnNewVacationRequest(){
		newVacationRequestAccess.click();
	}
	
	public void hoverUserAvatar(){
		waitABit(3000);
		Actions actions = new Actions(getDriver());
		WebElement hoverElement = getDriver().findElement(By.cssSelector("div[id=dockbar] ul li.user-avatar"));
		actions.moveToElement(hoverElement).build().perform();
		waitABit(3000);
	}
	
	public void logoutDirect(){
		getDriver().get("/c/portal/logout");
	}
	
	public void saveVacationRequest(){
		saveButton.click();
	}
	
	public void clickOnStartDayButton(){
		startDateButon.click();
	}
	
	public void clickOnEndDayButton(){
		endDateButon.click();
	}
	
	public void clickOnMonthYearOption(){
		monthToYeartable.click();
	}

	public void selectDate(String selectStartDay){
		List<WebElement> dayList = dayPickerContainer.findElements(By.cssSelector(".Zebra_DatePicker[style*='display: block'] .dp_daypicker tbody td:not(.dp_not_in_month):not(.dp_weekend_disabled):not(.dp_disabled)"));
		for(WebElement list:dayList){
			if(list.getText().contentEquals(selectStartDay)){
				list.click();
			}
		}
	}
	
	public void selectMonth(String selectStartMonth){
		List<WebElement> monthList = monthPickerContainer.findElements(By.cssSelector(".Zebra_DatePicker[style*='display: block'] .dp_monthpicker tbody td:not(.dp_disabled)"));
		for(WebElement list:monthList){
			if(list.getText().contentEquals(selectStartMonth)){
				list.click();
				break;
			}
		}
	}
	
	public void selectYear(String selectStartYear){
		List<WebElement> yearList = yearPickerContainer.findElements(By.cssSelector(".Zebra_DatePicker[style*='display: block'] .dp_yearpicker tbody td:not(.dp_disabled)"));
		for(WebElement list:yearList){
			if(list.getText().contentEquals(selectStartYear)){
				list.click();
			}
		}
	}
	

}
