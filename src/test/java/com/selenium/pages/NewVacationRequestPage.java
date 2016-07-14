package com.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewVacationRequestPage extends PageObject{
	@FindBy(css="div > div:nth-child(1) > ul > li:nth-child(2) > a")
	private WebElementFacade newrequestPage;
	
	@FindBy(css="input#_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade startDate;
	
	@FindBy(css="div:nth-child(11) > table.dp_daypicker > tbody > tr:nth-child(4) > td.dp_selected.dp_current")
	private WebElementFacade selectDate;
	
	@FindBy(css="input#_evovacation_WAR_EvoVacationportlet_endDate")
	private WebElementFacade endDate;
	
	@FindBy(css="div:nth-child(12) > table.dp_daypicker > tbody > tr:nth-child(4) > td:nth-child(6)")
	private WebElementFacade selectEndDate;
	
	@FindBy(css="input[class='aui-button-input aui-button-input-submit']")
	private WebElementFacade clickSave;
	
	
	

	public void clickNewRequestPage()
	{
		newrequestPage.click();
	}
	
	public void clickStartDate()
	{
		startDate.click();
	}
	
	public void selectDate()
	{
		selectDate.click();
	}

	public void clickEndDate(){
		endDate.click();
	}
	
	public void selectEndDate(){
		selectEndDate.click();
		
	}
	
	public void selectSave(){
		clickSave.click();
	}

	
}
