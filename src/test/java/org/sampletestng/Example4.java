////example 4 -> using testng initialize and check the annotations like @BeforeMethod,@BeforeClass,@AfterClass,@AfterMethosd,@Test 
//using LoginFacebook(pom),BaseClass(extends) to run facebook page 
package org.sampletestng;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.pomframework.BaseClass;
import org.pomframework.LoginPojoFacebook1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example4 extends BaseClass{
@BeforeMethod
private void startTime() {
	Date d = new Date();
	System.out.println(d);
}

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

@BeforeMethod
private void endTime() {
	Date d = new Date();
	System.out.println(d);
}

@Test
private void tc2() {
	LoginPojoFacebook1 l = new LoginPojoFacebook1();
	WebElement username = l.getTxtUser();
	fillTextbox(username, "Greens@123");
	WebElement password = l.getTxtPass();
	fillTextbox(password, "12345678");	
}

@Test
private void tc1() {
	pageTitle();
	pageUrl();
}
}
