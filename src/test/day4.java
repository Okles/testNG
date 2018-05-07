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
	@Parameters({"URL"}) //it will apply to a below SINGLE test only
	@Test
	public void mobileLoginhomeLoan(String urlName)
	{
		
		//appium
		System.out.println("Mobile login home");
		System.out.println(urlName);
	}
	
	@Test
	public void loginAPIhomeLoan()
	{
		
		//REST API automation
		System.out.println("REST of things ");
		
	}
	
	
}
