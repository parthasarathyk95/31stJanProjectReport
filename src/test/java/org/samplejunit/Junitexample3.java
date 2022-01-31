package org.samplejunit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junitexample3 {
	public static WebDriver driver;
	@Test
	public void tc2() {
		//System.out.println("Test2");
	String name = driver.getTitle();
	System.out.print("TITLE NAME: ");
	System.out.println(name);
	}
	@Test
	public void tc3() {
		//System.out.println("Test3");
		System.out.print("enter username , password and login: ");
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void tc1() {
		//System.out.println("Test1");
		String url = driver.getCurrentUrl();
		System.out.print("URL NAME: ");
		System.out.println(url);
	}
	@Before
	public void before() {
		//System.out.println("TC Started");
	Date d = new Date();
	System.out.println(d);
	}
	@After
	public void after() {
	 //System.out.println("TC ended");
		Date d = new Date();
		System.out.println(d);
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
