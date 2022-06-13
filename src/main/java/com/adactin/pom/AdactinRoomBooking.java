package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinRoomBooking {
	public static WebDriver driver;
	
	@FindBy(name="first_name")
	private static WebElement firstName;
	
	@FindBy(name="last_name")
	private static WebElement lastName;

	@FindBy(id="address")
	private static WebElement address;

	@FindBy(id="cc_num")
	private static WebElement cardNumber;

	@FindBy(id="cc_type")
	private static WebElement cardType;

	@FindBy(id="cc_exp_month")
	private static WebElement cardMonExpiry;

	@FindBy(name="cc_exp_year")
	private static WebElement cardYeaExpiry;

	@FindBy(name="cc_cvv")
	private static WebElement secretCode;
	
	
	@FindBy(id="book_now")
	private static WebElement bookNow;
	
	@FindBy(name="cancel")
	private static WebElement cancelBooking;
	
	

	public static WebElement getLastName() {
		return lastName;
	}



	public static WebElement getAddress() {
		return address;
	}



	public static WebElement getCardNumber() {
		return cardNumber;
	}



	public static WebElement getCardType() {
		return cardType;
	}



	public static WebElement getCardMonExpiry() {
		return cardMonExpiry;
	}



	public static WebElement getCardYeaExpiry() {
		return cardYeaExpiry;
	}



	public static WebElement getSecretCode() {
		return secretCode;
	}



	public static WebElement getBookNow() {
		return bookNow;
	}



	public static WebElement getCancelBooking() {
		return cancelBooking;
	}



	public static WebElement getFirstName() {
		return firstName;
	}
	
	public AdactinRoomBooking(WebDriver driver4) {
		
		this.driver= driver4;
		PageFactory.initElements(driver,this);
	}

}
