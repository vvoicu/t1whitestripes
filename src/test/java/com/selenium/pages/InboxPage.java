package com.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InboxPage extends PageObject{
	
	@FindBy(css = ".main-menu li:nth-child(9) a")
	private WebElementFacade vacationLi;
	
	@FindBy(css = ".aui-column-content .carousel-slider:nth-child(3) ul li:nth-child(3) a")
	private WebElementFacade inboxAccess;
		
	@FindBy(css = "tbody tr:nth-child(3) td:first-child input") 
	private WebElementFacade checkUncheckBox;
	
	
	
	@FindBy(css = "input[name='endDate']") 
	private WebElementFacade endDate;
	
}
