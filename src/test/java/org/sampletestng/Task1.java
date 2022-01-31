package org.sampletestng;

import org.openqa.selenium.WebElement;
import org.pomframework.BaseClass;
import org.pomframework.LoginPojoFacebook1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task1 extends BaseClass{
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
		fillTextbox(username, "Username123");
		s.assertEquals(username.getAttribute("value"), "Username123");
		WebElement passsword = l.getTxtPass();
		fillTextbox(passsword, "pass123456");
		s.assertEquals(passsword.getAttribute("value"), "pass123456");
		s.assertAll();
	}
}
