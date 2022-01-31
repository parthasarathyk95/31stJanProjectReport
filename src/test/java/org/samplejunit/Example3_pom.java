package org.samplejunit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example3_pom extends BaseClass{

	public Example3_pom() // constructor
	{
		PageFactory.initElements(driver, this);
	}
	//@FindBy(id = "email")
	@FindBy(xpath="//input[@type='text'])[2]")
	private WebElement txtuser;
	//@FindBy(id = "pass")
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpass;

	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	@Test
	public void pomtc() {
		System.out.println("Enter the email and password and verify whether the input data is correct or not by using POM framework ");
		
		Example3_pom l1 = new Example3_pom();
		
		System.out.print("enter username : ");
		
		WebElement user = l1.getTxtuser();
		fillTextbox(user, "Username");
		String User = user.getAttribute("value");
		System.out.println(User);
		Assert.assertEquals("check username","Username", User);
		
		System.out.print("enter username : ");
		
		WebElement pass =  l1.getTxtpass();
		fillTextbox(pass, "password");
		String Pass = pass.getAttribute("value");
		System.out.println(Pass);
		Assert.assertEquals("password", pass.getAttribute("value"));
	}
	@BeforeClass
	public static void befcls() {	
		chromeBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		//launchUrl("https://www.facebook.com/");
		mainwindow();
	}
	@AfterClass
	public static void aftcls() {	
		System.out.println("Done Pom");
		driver.quit();
	}
}
