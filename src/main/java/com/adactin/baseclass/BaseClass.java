package com.adactin.baseclass;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//From Webdrive class	
	public static WebDriver driver;


	public static WebDriver browserChoice(String browser) {
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		else  
		{
			System.out.println("Sorry Please do the respective interation with driver");
		}
		return driver;
	}

	// To get the URL
	public static String urlLoad (String url)
	{
		driver.get(url);
		return url;
	}
// to sendvalue
	
	public static void inputvalue(WebElement element, String text) 
		{
			element.sendKeys(text);
		}
//click
	
	public static void click(WebElement element) 
	{
            element.click();
	}
	//To get Current URL
	public static String currentUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	// To Get Current TiTle
	public static String titleOfPage()
	{
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		return pageTitle;
	}

	//To get WindowHandle
	public static String windowHandling()
	{
		String windowHandling = driver.getTitle();
		System.out.println(windowHandling);
		return windowHandling;
	}
	//To Close
	public static void close()
	{
		driver.close();
	}

	//To Quit
	public static void quit()
	{
		driver.quit();
	}


	//LOCATORS
	//Find By Using id

	public static  WebElement toFindElementIdText(String id , String value)
	{
		WebElement toFindElement = driver.findElement(By.id(id));
		toFindElement.sendKeys(value);
		return toFindElement;
	}
	public static  WebElement toFindElement(String id )
	{
		WebElement toFindElement = driver.findElement(By.id(id));
		return toFindElement;
	}
	//Find WebElement Using Name

	public static  WebElement toFindElementNameTexT(String name , String value)
	{
		WebElement toFindElement = driver.findElement(By.name(name));
		toFindElement.sendKeys(value);
		return toFindElement;
	}
	public static  void toFindElementName(String id)
	{
		WebElement toFindElement = driver.findElement(By.name(id));
		toFindElement.click();

	}
	//Xpath
	public static WebElement xpath(String path)
	{
		WebElement toFindElement =driver.findElement(By.xpath(path));
		return toFindElement;
	}
	//By Using Class Name
	public static WebElement className (String path)
	{
		WebElement toFindElement =driver.findElement(By.className(path));
		return toFindElement;

	}
	// By using linkedText
	public static WebElement linkText (String path)
	{
		WebElement toFindElement =driver.findElement(By.linkText(path));
		return toFindElement;

	}
	//By Using tagName
	public static WebElement  tagName (String path)
	{
		WebElement toFindElement =driver.findElement(By.tagName(path));
		return toFindElement;

	}
	public static List findById(String path)
	{
		List <WebElement> toFindElements =driver.findElements(By.id(path));
		return toFindElements;
	}
	public static List findByNamed(String path)
	{
		List <WebElement> toFindElements =driver.findElements(By.name(path));
		return toFindElements;
	}
	public static List xpathFindElements(String path)
	{
		List <WebElement> toFindElements =driver.findElements(By.xpath(path));
		return toFindElements;
	}


	//Alert
	public static void alertFunction( String value)
	{	
		Alert alertFunction = driver.switchTo().alert();

		if (value.equalsIgnoreCase("Ok"))
		{
			alertFunction.accept();
		}
		else
		{
			alertFunction.dismiss();
		}

	}
	public static void alertFunctionWithText( String path,String value,String text)
	{	
		Alert alertFunction = driver.switchTo().alert();
		WebElement alertValue = driver.findElement(By.xpath(path));
		alertValue.sendKeys(text);
		if (value.equalsIgnoreCase("Ok"))
		{
			alertFunction.accept();
		}
		else
		{
			alertFunction.dismiss();
		}

	}


	public static void screenshot(String filename)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\screenshot\\"+filename+".png");
		try
		{
			FileHandler.copy(scr, target);
		}
		catch(Exception e)	
		{
			e.printStackTrace();
		}
	}
	public static void mouseOver(String path)
	{
		Actions act = new Actions(driver);
		WebElement itemSelected = driver.findElement(By.xpath(path));
		act.moveToElement(itemSelected).perform();
	}

	public static void frames(int index)
	{
		driver.switchTo().frame(index);
	}
	public static void backTo()
	{
		driver.switchTo().parentFrame();
	}

	public static void dropDownByIndex(WebElement element, int index)
	{
		Select byIndex = new Select(element);
		
		byIndex.selectByIndex(index);
		
	}

	public static void dropDownByValue(WebElement element, String value )
	{
		Select byValue = new Select(element);
		
		byValue.selectByValue(value);
		
	}
	public static void dropDownByVisibleText(WebElement element, String value )
	{
		Select byVText = new Select(element);
		
		byVText.selectByVisibleText(value);
		
	}






}












