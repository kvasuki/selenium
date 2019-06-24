package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizattion {

	
	@Parameters({"browser"})
	@Test
	public void p(String a)
	{
		if(a.equals("firefox"))
		{
			System.out.println("open firefox browser");
		}
		else
		{
			System.out.println("open chrome browser");
		}
	}
	

}
