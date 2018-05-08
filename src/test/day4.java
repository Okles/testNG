package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Test(groups= {"Smoke"})
	public void webLoginhomeLoan()
	{
		
		//selenium
		System.out.println("Web login home");
		
	}
	@Test
	public void mobileLoginhomeLoan()
	{
		
		//appium
		System.out.println("Mobile login home");
	
	}
	
	@Test
	public void loginAPIhomeLoan()
	{
		
		//REST API automation
		System.out.println("REST of things ");
		
	}
	
	
}
