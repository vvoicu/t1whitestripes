package com.selenium.pages.emanuel;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewVacationRequestPage extends PageObject {
	@FindBy(css = "div > div:nth-child(1) > ul > li:nth-child(2) > a")
	private WebElementFacade newrequestPage;
	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade startDate;
	@FindBy(css = ":nth-child(11) > table.dp_daypicker > tbody > tr:nth-child(5) > td:nth-child(6)")
	private WebElementFacade selectDate;
	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_endDate")
	private WebElementFacade endDate;
	@FindBy(css = ":nth-child(12) > table.dp_daypicker > tbody > tr:nth-child(5) > td:nth-child(6)")
	private WebElementFacade selectEndDate;
	@FindBy(css = "span.aui-button-content input[class='aui-button-input aui-button-input-submit']")
	private WebElementFacade clickSave;
	@FindBy(css = ".optionalComment")
	private WebElement clickCommentArea;
	@FindBy(css="textarea#_evovacation_WAR_EvoVacationportlet_commentContent")
	private WebElement addComment;
	

	public void clickNewRequestPage() {
		newrequestPage.click();
	}

	public void clickStartDate() {
		startDate.click();
	}

	public void selectDate() {
		selectDate.click();
	}

	public void clickEndDate() {
		endDate.click();
	}

	public void selectEndDate() {
		selectEndDate.click();

	}

	public void clickCommentArea() {
		clickCommentArea.click();
	}

	public void addComment(String comment){
		addComment.sendKeys(comment);
	}
	

	public void selectSave() {
		element(clickSave).waitUntilVisible();
		clickSave.sendKeys("");
		clickSave.click();

		waitABit(2000);
	}

}
