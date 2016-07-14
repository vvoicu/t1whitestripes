package com.selenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VacationTypePage extends PageObject{
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade selectVacWithoutPay;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade selectSickLeave;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_type_CS")
	private WebElementFacade selectSpecialVacation;
	
	@FindBy(css=".vacationTypeChoice:nth-child(4) select")
	private WebElementFacade clickMenu;

	@FindBy(css="#vacationTypeContainer > div > div:nth-child(4) select")
	private WebElementFacade selectVacationTypeContainer;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_type_ML")
	private WebElementFacade selectMaternityLeave;
	
	@FindBy(css="#vacationTypeContainer >div >div:nth-child(5) select")
	private WebElementFacade clickMenuList;
	
	@FindBy(css="#vacationTypeContainer >div >div:nth-child(5) select option:first-child")
	private WebElementFacade selectPrenatal;
	
	@FindBy(css="#vacationTypeContainer >div >div:nth-child(5) select option:nth-child(2)")
	private WebElementFacade selectConcediuIngrijireCopii;
	
	
	public void selectVacWithoutPay(){
		selectVacWithoutPay.click();
	}
	
	public void selectSickLeave(){
		selectSickLeave.click();
	}
	
	public void selectSpecialVacation()
	{
		selectSpecialVacation.click();
	}
	
	public void clickMenu(){
		clickMenu.click();
	}
	
	public void selectVacationType(String type){
		element(selectVacationTypeContainer).selectByVisibleText(type);
	}
	
	
	public void selectMaternityLeave(){
		selectMaternityLeave.click();
	}
	
	public void clickMenuList(){
		clickMenuList.click();
	}
	
	public void selectPrenatal(){
		selectPrenatal.click();
	}
	
	public void selectConcediuIngrijire(){
		selectConcediuIngrijireCopii.click();
	}

	public void clickSpecialVacation() {
		selectSpecialVacation.click();		
	}

}
