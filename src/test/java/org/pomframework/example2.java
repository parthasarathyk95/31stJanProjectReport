package org.pomframework;

import org.openqa.selenium.WebElement;

public class example2 extends BaseClass{
public static void main(String[] args) {
	chromeBrowser();
	launchUrl("https://www.facebook.com/");
	mainwindow();
	LoginPojoFacebook1 l = new LoginPojoFacebook1();
	
	WebElement user = l.getTxtUser();
	fillTextbox(user, "Green@123");
	WebElement pass = l.getTxtPass();
	fillTextbox(pass, "123456");
}
}
