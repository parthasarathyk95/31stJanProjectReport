//example 6->Using Assert class in testng framework
package org.sampletestng;

import org.openqa.selenium.WebElement;
import org.pomframework.BaseClass;
import org.pomframework.LoginPojoFacebook1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example6 extends BaseClass{
	public SoftAssert s;
	@BeforeClass
	private void start() {
	chromeBrowser();
	launchUrl("https://www.facebook.com/");
	mainwindow();
	}
	@AfterClass
	private void end() {
	driver.quit();
	}
	@Test
	private void tc2() {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		s = new SoftAssert();
		WebElement username = l.getTxtUser();
		fillTextbox(username, "Green@123");
		s.assertEquals(username.getAttribute("value"), "Green@123");
		WebElement passsword = l.getTxtPass();
		fillTextbox(passsword, "123456");
		s.assertEquals(passsword.getAttribute("value"), "123456");
		s.assertAll();
	}
	@Test
	private void tc1() {
		s = new SoftAssert();
		String name = driver.getTitle();
		s.assertTrue(name.contains("facebook"), "verify the title again");
		System.out.print("Title name: ");		
		System.out.println(name);
		String url = driver.getCurrentUrl();
		System.out.print("Url name: ");
		s.assertTrue(url.contains("book"));
		System.out.println(url);
		s.assertAll();
	}
}
