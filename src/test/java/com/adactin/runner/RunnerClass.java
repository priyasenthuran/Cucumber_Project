package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReadManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/adactin/feature/adactin.feature", 
  glue="com/adactin/stepdefinition",monochrome = true,dryRun = false,
  plugin = {"html:Report/Cucumber.html",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class RunnerClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		//driver= BaseClass.browserChoice("chrome");
		String browser = FileReadManager.getinstance().getconfigureclass().getBrowser();
		driver = BaseClass.browserChoice(browser);
	}
	@AfterClass
	public static void teardown()
	{
		driver.close();
	}
	
}
