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
	
	@FindBy(css = "input[id*='ApproveButton']") 
	private WebElementFacade approveBtn;
	
	@FindBy(css = "input[id*='RejectButton']") 
	private WebElementFacade rejectBtn;

	@FindBy(css = "tbody tr:first-child th:first-child input") 
	private WebElementFacade checkUncheckBoxes;
	
	@FindBy(css = "tbody tr:last-child td:last-child a") 
	private WebElementFacade lineRequest;
		
	public void clickOnVacation(){
		vacationLi.click();
	}
	
	public void clickOnInbox(){
		inboxAccess.click();
	}
	
	public void clickOnCheckBox(){
		checkUncheckBox.click();
	}
	
	public void clickOnCheckBoxMultiple(){
		checkUncheckBoxes.click();
	}
	
	public void clickOnApproveButton(){
		approveBtn.click();
	}
	
	public void clickOnRejectButton(){
		rejectBtn.click();
	}
	
	public void clickOnLineRequest(){
		lineRequest.click();
	}
}



//public void enterUserName(String text){
//	userName.type(text);
//}
//public void enterPassword(String text){
//	password.type(text);
//}
//public void clickOnSingInButton(){
//	singIn.click();
//}
//}

