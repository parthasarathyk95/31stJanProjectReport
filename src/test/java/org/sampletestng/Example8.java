// example 7 @Parameter(parametername) with @optional("name") annotatios in class with testngexample7.xml 
//inside parameter value initialize is not same in the .xml <parameter>  and runAs-> Testng Suite
package org.sampletestng;

import org.openqa.selenium.WebElement;
import org.pomframework.BaseClass;
import org.pomframework.LoginPojoFacebook1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example8 extends BaseClass{
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
	@Parameters({"User","Pass"})
	
	@Test
	private void tc2(@Optional("Selenium")String user, @Optional("123456")String pass) {
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
