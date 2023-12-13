package com.app.TestNG.Extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass  {

	public static WebDriver driver;

	public static void  OpenBrowser(String browser)
	{
		if(browser == "Chrome")
		{
			driver = new ChromeDriver();
		}
		
		if(browser == "FireFox")
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.openmrs.org/openmrs/login.htm"); 
		
	}
	public void closeBrowser() {
		driver.close();
	}

}




