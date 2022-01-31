//example2 ->red bus app
package org.samplejunit;

import java.util.Set;

//import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 {
	
	public static WebDriver driver;
	
	@Test
	public void tc1() throws InterruptedException {
		System.out.println("Click signin and enter the email and password and verify whether the input data is correct or not by using junit framework");
		System.out.println("Click signin");
		
		WebElement sigin_in_icon_down = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		sigin_in_icon_down.click();
		//Thread.sleep(5000);
		WebElement sigin_in_link = driver.findElement(By.xpath("//li[@id='signInLink']"));
		sigin_in_link.click();
		Thread.sleep(5000);
		
		WebElement frame = driver.findElement(By.id("gsi_661891_417064"));
		driver.switchTo().frame(frame);
		//Thread.sleep(5000);
		WebElement sigin_in_google = driver.findElement(By.xpath("(//div[@id='container'])[1]"));
		sigin_in_google.click();
		//Thread.sleep(5000);
		String parId = driver.getWindowHandle();
		System.out.println(parId);
		Set<String> allWindId = driver.getWindowHandles();
		System.out.println(allWindId);
		for (String eachWindId : allWindId) {
			if (!parId.equals(eachWindId)) {
				driver.switchTo().window(eachWindId);
				
			}
		}
		//iframe page switch to frame
		
		
//		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
//		int a = frame.size();
//		System.out.println(a);
//		
//		WebElement frames = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
//		driver.switchTo().frame(frames);
//		
//		
//		WebElement sigin_in_google = driver.findElement(By.xpath("(//span[text()='Sign in with Google'])[2]"));
//		sigin_in_google.click();
//		//Thread.sleep(5000);
		
//		System.out.print("enter emailid : ");
//		
//		WebElement txtUser = driver.findElement(By.xpath("//input[@type='email']"));
//		txtUser.sendKeys("registeredemailid");
//		String user = txtUser.getAttribute("value");
//		System.out.println(user);
//		Assert.assertEquals("check username","registeredemailid", user);
//		
//		System.out.println("Emailid_Next_button");
//		
//		WebElement Next_button = driver.findElement(By.xpath("//span[text()='Next']"));
//		Next_button.click();
//		
//		System.out.print("enter password : ");
//		
//		WebElement txtPass = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		txtPass.sendKeys("password1234");
//		String pass = txtPass.getAttribute("value");
//		System.out.println(pass);
//		Assert.assertEquals("password1234", txtPass.getAttribute("value"));
//
//		System.out.println("Password_Next button");
//		
//		WebElement Next_button1 = driver.findElement(By.xpath("//span[text()='Next']"));
//		Next_button1.click();
	}
	@BeforeClass
	public static void befcls() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	}
	@AfterClass
	public static void aftcls() {	
		//driver.quit();
	}
}
