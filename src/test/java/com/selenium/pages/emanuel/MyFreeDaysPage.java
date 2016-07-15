package com.selenium.pages.emanuel;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MyFreeDaysPage extends PageObject {
	
	@FindBy(css="#p_p_id_evovacation_WAR_EvoVacationportlet_ > div > div > div > div > div > div.aui-column.aui-w25.aui-column-first > div > div:nth-child(1) > ul > li:nth-child(4) > a")
	private WebElement myFreeDays;
	
	public void clickMyFreeDays(){
		myFreeDays.click();
		waitABit(2000);
	}
	
}
