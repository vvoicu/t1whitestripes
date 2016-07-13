package com.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogInPage extends PageObject {

@FindBy(css="input[id*='login']")
private WebElementFacade userName;
@FindBy (css="input[id*='password']")
WebElementFacade password;
@FindBy (css=".aui-button-input.aui-button-input-submit")
WebElementFacade singIn;

	
public void enterUserName(String text){
	userName.type(text);
}
public void enterPassword(String text){
	password.type(text);
}
public void clickOnSingInButton(){
	singIn.click();
}
}

