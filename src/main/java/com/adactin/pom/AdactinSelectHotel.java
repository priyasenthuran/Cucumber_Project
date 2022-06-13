package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectHotel {

	public static WebDriver driver;

	@FindBy(id="radiobutton_0")
	private static WebElement selectHotel;
	
	@FindBy(id="continue")
	private static WebElement continueButton;
	
	@FindBy(name="cancel")
	private static WebElement cancelButton;
	

	
	public static WebElement getSelectHotel() {
		return selectHotel;
	}



	public static WebElement getCancelButton() {
		return cancelButton;
	}



	public static WebElement getContinueButton() {
		return continueButton;
	}

public AdactinSelectHotel(WebDriver driver3) {
	
	this.driver= driver3;
	PageFactory.initElements(driver3, this);
}
		
}
