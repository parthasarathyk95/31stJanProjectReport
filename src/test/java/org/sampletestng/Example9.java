//Example9 ->Using Dataprovider with object[][] to pass bulk of data 
package org.sampletestng;

import org.openqa.selenium.WebElement;
import org.pomframework.BaseClass;
import org.pomframework.LoginPojoFacebook1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example9 extends BaseClass {
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
	
	@Test(dataProvider="SampleData")
	private void tc2(String user, String pass) {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		
		WebElement username = l.getTxtUser();
		fillTextbox(username, user);
		System.out.println(user);
		WebElement password = l.getTxtPass();
		fillTextbox(password, pass);
		System.out.println(pass);
		driver.navigate().refresh();
	}
	
	@DataProvider(name="SampleData")
	private Object[][] data() {
		return new Object[][] {
			{"Selenium","selenium"},
			{"Hadoop","hadoop"},
			{"Java","java"},
			{"Greenstech","greenstech"}
		};
	}
}
