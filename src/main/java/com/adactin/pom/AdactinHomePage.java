package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public  class AdactinHomePage {
  public static WebDriver driver;
	
	@FindBy(how=How.ID ,using="username")
	private static WebElement userName;

	public static WebElement getUserName() 
	{
		return userName;
	}
	
	@FindBy(how=How.ID,using="password")
	private static WebElement passWord;

	public static WebElement getPassWord() 
	{
		return passWord;
	}
	
	
	@FindBy(how=How.LINK_TEXT, using="Forgot Password?")
	private static WebElement forGetPassword;

	public static WebElement getForGetPassword()
	{
		return forGetPassword;
	}
	
	
	@FindBy(how=How.ID,using="login")
	private static WebElement loginButton;

	public static WebElement getLoginButton()
	{
		return loginButton;
	}

	@FindBy(how=How.LINK_TEXT, using="New User Register Here")
	private static WebElement registerForm;

	public static WebElement getRegisterForm() {
		return registerForm;
	}

	public AdactinHomePage (WebDriver driver1)

	{
		this.driver =driver1;
		PageFactory.initElements(driver, this);
		
	}
}
