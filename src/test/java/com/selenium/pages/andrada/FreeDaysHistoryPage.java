package com.selenium.pages.andrada;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FreeDaysHistoryPage extends PageObject {
	
	@FindBy(css = "div > div:nth-child(1) > ul > li:nth-child(5) > a")
	private WebElementFacade freeVacationHistory;
	
	@FindBy(css = "div.filter-content-history div[class$='aui-column-first '] span.aui-field-content")
	private List<WebElement> freeDaysHistoryTypeFilter;
	String freeDaysHistoryTypeFilterName = "label";
	String freeDaysHistoryTypeFilterCheckBox = "span input[type='checkbox']";
	
	@FindBy(css = "span.result-column-name a")
	private List<WebElement> tableCategoryNames;
	
	
	
	public void clickOnFreeVacationHistory(){
		freeVacationHistory.click();
		
	}
	public void clickOnFreeDaysHistoryTypeFilter(String filter) {
		boolean filterFound = false;
		for (WebElement e : freeDaysHistoryTypeFilter) {
			WebElement filterName = e.findElement(By.cssSelector(freeDaysHistoryTypeFilterName));
			if (filterName.getText().contentEquals(filter)) {
				filterFound = true;
				WebElement checkbox = e.findElement(By.cssSelector(freeDaysHistoryTypeFilterCheckBox));
				checkbox.click();
				break;
			}
		}
		Assert.assertTrue("The filter was not found", filterFound);
	}
	
}