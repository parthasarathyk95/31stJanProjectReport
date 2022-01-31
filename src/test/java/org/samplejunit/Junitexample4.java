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

public class Junitexample4 {
	public static WebDriver driver;

	@Test
	public void tc3() {
		//System.out.println("Test3");
		System.out.print("enter username , password and login: ");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("username");
		String user = txtUser.getAttribute("value");
		System.out.println(user);
		Assert.assertEquals("check username","username", user);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("password");
		Assert.assertEquals("password", txtPass.getAttribute("value"));
	}
	
	@Test
	public void tc1() {
		//System.out.println("Test1");
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Verigy url agian", url.contains("facebook"));
		System.out.print("URL NAME: ");
		System.out.println(url);
		
		String name = driver.getTitle();
		boolean res = name.startsWith("http");
		Assert.assertTrue("Title failed", res);
		System.out.print("TITLE NAME: ");
		System.out.println(name);
	}
	
	@BeforeClass
	public static void befcls() {
	//	System.out.println("start");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void aftcls() {
	//System.out.println("end");	
		driver.quit();
	}
}
