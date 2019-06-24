package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaions {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		

	}
	
	@Test
	public void verifyPageTitle()
	{
	  
		String title= driver.getTitle();
		System.out.println("The title is:" +title);
		
		if(title.equals(driver.getTitle()))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
	}
	
	@AfterTest
	public void terminateBrowser()
	{
		driver.close();
	}
	

}
