package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {

	WebDriver driver;

	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");

	}
	@Test(dependsOnMethods={"m1"})
	public void m3() {
		driver.findElement(By.id("email")).sendKeys("vasuki");

		driver.findElement(By.id("pass")).sendKeys("vasuki");
	}
	@Test(dependsOnMethods={"m3"})
	public void m2() {
		driver.findElement(By.id("u_0_2")).click();
	}

}
