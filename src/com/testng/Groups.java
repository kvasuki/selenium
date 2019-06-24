package com.testng;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups={"smoke test"})
	public void test1()
	{
		System.out.println("Logged successfully");
	}
	@Test(groups={"Functional test"})
	public void test2()
	{
		System.out.println("mail sent");
	}
	
	@Test(groups={"Functional test"})
	public void test3()
	{
		System.out.println("Log out");
	}
	

}
