// example 7 @Parameter(parametername) in class with testngexample7.xml inside parameter value initialize and runAs-> Testng Suite
package org.sampletestng;

import org.openqa.selenium.WebElement;
import org.pomframework.BaseClass;
import org.pomframework.LoginPojoFacebook1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Example7 extends BaseClass{
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
	@Parameters({"Username","Password"})
	
	@Test
	private void tc2(String user, String pass) {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		
		WebElement username = l.getTxtUser();
		fillTextbox(username, user);
		System.out.println(user);
		WebElement password = l.getTxtPass();
		fillTextbox(password, pass);
		System.out.println(pass);

	}
	@Test
	private void tc1() {

		String name = driver.getTitle();
		System.out.println(name);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
	}
}
