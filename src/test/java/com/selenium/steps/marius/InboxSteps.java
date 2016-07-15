package com.selenium.steps.marius;

import com.selenium.pages.marius.InboxPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class InboxSteps extends ScenarioSteps {
	InboxPage inboxPage;
	
	@Step
	public void clickOnVacation(){
		inboxPage.clickOnVacation();
	}
	
	public void clickOnInbox(){
		inboxPage.clickOnInbox();
	}
	
	public void clickOnCheckBox(){
		inboxPage.clickOnCheckBox();
	}
	
	public void clickOnCheckBoxMultiple(){
		inboxPage.clickOnCheckBoxMultiple();
	}
	
	public void clickOnApproveButton(){
		inboxPage.clickOnApproveButton();
	}
	
	public void clickOnRejectButton(){
		inboxPage.clickOnRejectButton();
	}
	
	public void clickOnLineRequest(){
		inboxPage.clickOnLineRequest();
	}
	
	public void clickOnApproveButtonInsideRequest(){
		inboxPage.clickOnApproveButtonInsideRequest();
	}
	
	public void clickOnRejectButtonInsideRequest(){
		inboxPage.clickOnRejectButtonInsideRequest();
	}
}
