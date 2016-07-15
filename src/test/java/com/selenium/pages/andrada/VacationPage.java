package com.selenium.pages.andrada;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
@SuppressWarnings("unused")
public class VacationPage extends PageObject {
@FindBy(css=".main-menu li:nth-child(9) span")
private WebElementFacade vacationOption;

	public void clickOnVacationOption(){
		vacationOption.click();
		waitABit(2000);
	}
	public void assertText(String textToVerify){
		WebElement elementText = getDriver().findElement(By.cssSelector("div.content-title"));
		Assert.assertTrue(elementText.getText().contains(textToVerify));
	}
	 
}
