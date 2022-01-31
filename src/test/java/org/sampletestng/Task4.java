package org.sampletestng;

import org.openqa.selenium.WebElement;
import org.pomframework.BaseClass;
import org.pomframework.LoginPojoFlipkart;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task4 extends BaseClass{
	public SoftAssert s;
	@BeforeClass
	private void start() {
	chromeBrowser();
	launchUrl("https://www.flipkart.com/account/login");
	mainwindow();
	}
	@AfterClass
	private void end() {
	driver.quit();
	}
	@Test
	private void tc2() {
		LoginPojoFlipkart l = new LoginPojoFlipkart();
		s = new SoftAssert();
		WebElement username = l.getTxtUser();
		fillTextbox(username, "Username123");
		s.assertEquals(username.getAttribute("value"), "Username123");
		WebElement passsword = l.getTxtPass();
		fillTextbox(passsword, "pass123456");
		s.assertEquals(passsword.getAttribute("value"), "pass123456");
		s.assertAll();
	}
}
