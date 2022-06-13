package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookedItinerary {
	public static WebDriver driver;
	
	@FindBy(id="check_all")
	private static WebElement selectAll;
	
	@FindBy(name="search_hotel")
	private static WebElement searchHotel;
	
	@FindBy(name="cancelall")
	private static WebElement cancelAll;
	
	public static WebElement getSelectAll() {
		return selectAll;
	}

	public static WebElement getSearchHotel() {
		return searchHotel;
	}

	public static WebElement getCancelAll() {
		return cancelAll;
	}

	public static WebElement getLogOut() {
		return logOut;
	}

	@FindBy(id="logout")
	private static WebElement logOut;

	public AdactinBookedItinerary(WebDriver driver6)
	{
		this.driver = driver6;
		PageFactory.initElements(driver, this);
		
	}
	
}
