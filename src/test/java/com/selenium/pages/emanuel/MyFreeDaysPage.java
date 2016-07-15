package com.selenium.pages.emanuel;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MyFreeDaysPage extends PageObject {
	
	@FindBy(css="div:nth-child(1) > ul > li:nth-child(4) > a")
	private WebElement myFreeDays;
	
	@FindBy(css=".year-navigation > ul > li:nth-child(1) > a")
	private WebElement clickOnYear1;
	
	@FindBy(css=".year-navigation > ul > li:nth-child(2) > a  ")
	private WebElement clickOnYear2;

	@FindBy(css="span.header-back-to a")
	private WebElement backButton;
	
	public void clickMyFreeDays(){
		myFreeDays.click();
		waitABit(2000);
	}
	
	public void clickOnYear1(){
		clickOnYear1.click();
	}
	
	public void clicOnYear2(){
		clickOnYear2.click();
	}
	
	public void backButton(){
		backButton.click();
		waitABit(2000);
	}
	
	
}
