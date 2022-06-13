package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSearchHotel {
public static WebDriver driver;
	
	@FindBy(id="location")
	private static WebElement location;
	
	
	@FindBy(id="hotels")
	private static WebElement hotels;
	
	@FindBy(id="room_type")
	private static WebElement roomType;
	
	@FindBy(id="room_nos")
	private static WebElement roomNos;
	
	@FindBy(id="datepick_in")
	private static WebElement fromDate;

	@FindBy(id="datepick_out")
	private static WebElement toDate;

	@FindBy(name="adult_room")
	
	private static WebElement adultRoom;
	
	@FindBy(name="child_room")
	private static WebElement childRoom;

	@FindBy(name="Submit")
	private static WebElement search;

	@FindBy(name="Reset")
	private static WebElement reset;

	
	public static WebDriver getDriver() {
		return driver;
	}


	public static WebElement getSearch() {
		return search;
	}


	public static WebElement getToDate() {
		return toDate;
	}


	public static WebElement getAdultRoom() {
		return adultRoom;
	}


	public static WebElement getChildRoom() {
		return childRoom;
	}


	public static WebElement getFromDate() {
		return fromDate;
	}


	public static WebElement getRoomNos() {
		return roomNos;
	}


	public static WebElement getRoomType() {
		return roomType;
	}


	public static WebElement getHotels() {
		return hotels;
	}


	public static WebElement getLocation() {
		return location;
	}
	public AdactinSearchHotel(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
}
