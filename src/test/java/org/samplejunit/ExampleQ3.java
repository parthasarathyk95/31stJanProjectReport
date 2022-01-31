package org.samplejunit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleQ3 {
	public static WebDriver driver;
	
	@Test
	public void tc_junit() {
		//Enter the email and password and verify whether the input data is correct or not by using junit framework & POM framework.
		System.out.print("Enter the email and password and verify whether the input data is correct or not by using junit framework");
		System.out.print("enter username : ");
		
		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
		txtUser.sendKeys("username");
		String user = txtUser.getAttribute("value");
		System.out.println(user);
		Assert.assertEquals("check username","username", user);
		
		System.out.print("enter password : ");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		//WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("password");
		String pass = txtPass.getAttribute("value");
		System.out.println(pass);
		Assert.assertEquals("password", txtPass.getAttribute("value"));
	}

	@BeforeClass
	public static void befcls() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	//driver.get("https://www.facebook.com");
	driver.get("https://www.flipkart.com/account/login");
    driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void aftcls() {	
		driver.quit();
		System.out.println("Done Junit");
	}
}
