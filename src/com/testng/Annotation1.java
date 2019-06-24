package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	
	@BeforeClass
	public void a()
	{
		System.out.println("Test case 1");
	}
	
	@BeforeSuite
	public void b()
	{
		System.out.println("Test case 2");
	}
	
	@BeforeTest
	public void c()
	{
		System.out.println("Test case 3");
	}
	
	@BeforeMethod
	public void d()
	{
		System.out.println("Test case 4");
	}
	
	@AfterMethod
	public void e()
	{
		System.out.println("Test case 5");
	}
	
	@Test
	public void f()
	{
		System.out.println("Test case 6");
	}
	
	@AfterClass
	public void g()
	{
		System.out.println("Test case 7");
	}
	
	@AfterSuite
	public void h()
	{
		System.out.println("Test case 8");
	}
	
	@AfterTest
	public void i()
	{
		System.out.println("Test case 9");
	}
	
	@AfterMethod
	public void j()
	{
		System.out.println("Test case 10");
	}

}
