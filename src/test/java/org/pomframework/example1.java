package org.pomframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class example1 extends BaseClass{
	public static void main(String[] args) {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		mainwindow();
		
		PojoFacebook l1 = new PojoFacebook();
		
		WebElement user = l1.getTxtuser();
		fillTextbox(user, "Username");
		WebElement pass =  l1.getTxtpass();
		fillTextbox(pass, "password");
		
		driver.navigate().refresh();
		fillTextbox(user, "Greens");
		
		}
}
