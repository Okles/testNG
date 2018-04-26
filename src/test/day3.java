package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void webLoginCarLoan()
	{
		
		//selenium
		System.out.println("Web login car");
		
	} 
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every method in a day3 class");
	}
	
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("I will execute after every method in a day3 class");
	}
	
	@Test
	public void mobileLoginCarLoan()
	{
		
		//appium
		System.out.println("Mobile login car");
		
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("I am number one!");
	}
	
	
	
	@Test
	public void mobileSignInLoan()
	{
		
		//appium
		System.out.println("Mobile sign in");
		
	}
	
	@Test
	public void mobileSignOutLoan()
	{
		
		//appium
		System.out.println("Mobile sign out");
		
	}
	
	
	@Test
	public void APIcarLoan()
	{
		
		//REST API automation
		System.out.println("REST of things ");
		
	}
	
	
}
