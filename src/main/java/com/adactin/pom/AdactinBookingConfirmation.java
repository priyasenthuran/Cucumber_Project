package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookingConfirmation {
	  public static WebDriver driver;

	@FindBy(name="search_hotel")
	private static WebElement searchHotel;
	
	@FindBy(name="my_itinerary")
	private static WebElement myItinerary;
	
	@FindBy(id="logout")
	private static WebElement logOut;

	public static WebElement getSearchHotel() {
		return searchHotel;
	}

	public static WebElement getMyItinerary() {
		return myItinerary;
	}

	public static WebElement getLogOut() {
		return logOut;
	}
	
public AdactinBookingConfirmation(WebDriver driver5)
{
	this.driver =driver5;
	PageFactory.initElements(driver, this);
	
}
}
