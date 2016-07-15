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

	@FindBy(css = "input[id*='HOLIDAYCheckbox']")
	private WebElementFacade holidayCheckBox;

	@FindBy(css = "input[id*='FIFTHCheckbox']")
	private WebElementFacade oneToFiveCheckBox;

	@FindBy(css = "input[id*='PENDINGCheckbox']")
	private WebElementFacade pendingCheckBox;

	@FindBy(css = "input.aui-button-input")
	private WebElementFacade applyButton;

	@FindBy(css = "div.filter-content div[class$='aui-column-first ']  span.aui-field-content ")
	private List<WebElement> vacationTypeFilterContainerList;

	String vacationTypeFilterNameCssSelector = "label";
	String vacationTypeFilterCheckboxCssSelector = "span input[type='checkbox']";

	@FindBy(css = "div.filter-content div[class$='column-center ']  span.aui-field-content")
	private List<WebElement> vacationDaysNumberContainerList;

	String daysNumberFilterNameCssSelector = "label";
	String daysNumberFilterCheckBoxCssSelector = "span input[type='checkbox']";

	@FindBy(css = "div.filter-content div[class$='column-last']  span.aui-field-content")
	private List<WebElement> vacationStatusFilterContainerList;
	String vacationStautsNameCssSelector = "label";
	String vacationStatusCheckBoxCssSelector = "span input[type='checkbox']";

	public void clickOnMyRequests() {
		myRequests.click();
		waitABit(2000);
	}

	public void clickOnHolidayCheckBox() {
		holidayCheckBox.click();

	}

	public void clickOnOneToFiveCheckBox() {
		oneToFiveCheckBox.click();

	}

	public void clickOnPendingCheckBox() {
		pendingCheckBox.click();

	}

	public void clickOnApplyButton() {
		applyButton.click();

	}

	public void clickVacationTypeFilterList(String filter) {
		boolean filterFound = false;
		for (WebElement filterElement1 : vacationTypeFilterContainerList) {

			WebElement filterName = filterElement1.findElement(By.cssSelector(vacationTypeFilterNameCssSelector));
			if (filterName.getText().contentEquals(filter)) {
				filterFound = true;
				WebElement checkbox = filterElement1.findElement(By.cssSelector(vacationTypeFilterCheckboxCssSelector));
				checkbox.click();
				break;
			}
		}
		Assert.assertTrue("The filter was not found", filterFound);
	}

	public void clickOnVacationDaysNumberFilterList(String filter) {
		boolean filterFound = false;
		System.out.println("Size:" + vacationDaysNumberContainerList.size());
		for (WebElement filterElement2 : vacationDaysNumberContainerList) {

			WebElement filterName = filterElement2.findElement(By.cssSelector(daysNumberFilterNameCssSelector));
			if (filterName.getText().contentEquals(filter)) {
				filterFound = true;
				WebElement checkbox = filterElement2.findElement(By.cssSelector(daysNumberFilterCheckBoxCssSelector));
				checkbox.click();
				break;
			}
		}
		Assert.assertTrue("The filter was not found", filterFound);
	}

	public void clickVacationStatusFilterContainerList(String filter) {

		boolean filterFound = false;
		for (WebElement filterElement3 : vacationStatusFilterContainerList) {
			WebElement filterName = filterElement3.findElement(By.cssSelector(vacationStautsNameCssSelector));
			System.out.println("Filter name:" + filterName.getText());
			System.out.println("Expected filter: " + filter);
			if (filterName.getText().contentEquals(filter)) {
				filterFound = true;
				WebElement checkbox = filterElement3.findElement(By.cssSelector(vacationStatusCheckBoxCssSelector));
				checkbox.click();
				break;
			}
		}
		Assert.assertTrue("The filter was not found", filterFound);
	}

	public void assertText(String textToVerify) {
		WebElement elementText = getDriver().findElement(By.cssSelector("div.portlet-msg-info"));
		Assert.assertTrue(elementText.getText().contentEquals(textToVerify));
	}

	public void assertOnSelectedFilterInTableList(String elementText) {
		List<WebElement> elementsList = getDriver().findElements(By.tagName("td[class*='type'] a"));
		for (WebElement e : elementsList) {
			System.out.println("element text: " + e.getText());
			if (e.getText().contentEquals(elementText)) {
				Assert.assertTrue(e.getText().contentEquals(elementText));
				break;
			}
		}
	}

	public void clickOnNameInTableList(String name) {
		System.out.println("1");
		List<WebElement> elementsList = getDriver().findElements(By.cssSelector("td[class*='update'] a"));
		System.out.println("list length: "+elementsList.size());
		asdada: for (WebElement e : elementsList) {
			System.out.println("element text: " + e.getText());
			if (e.getText().contentEquals(name)) {
				System.out.println("if: "+e.getText());
				e.click();
				waitABit(2000);
				break asdada;
			}
		}
	}
	public void assertTextInStateVacationRequest(String assertText){
		WebElement element = getDriver().findElement(By.cssSelector("div.view-vacation > div.content-title"));
		Assert.assertTrue(element.getText().contains(assertText));
	}
	public void clickOnShowOnlyFutureVacationsCheckBox(){
		WebElement showOnlyFutureVacationsCheckBox = getDriver().findElement(By.cssSelector("input[id$='futureVacationsCheckbox']"));
		showOnlyFutureVacationsCheckBox.click();
	}
	public void assertDate(String text){
		WebElement dateElement = getDriver().findElement(By.cssSelector("td.align-left.col-1 a"));
		Assert.assertTrue(dateElement.getText().contains(text));
		
	}
}
