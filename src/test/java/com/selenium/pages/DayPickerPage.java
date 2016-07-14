package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DayPickerPage extends PageObject {
	
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
