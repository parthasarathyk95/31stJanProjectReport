
package org.sample1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExampleQ5 extends Baseclass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	chromeBrowser();
	launchUrl("http://adactinhotelapp.com/");
	mainwindow();
	// 
	//login page -> username -> password -> submit   
	WebElement txtUsername = driver.findElement(By.id("username"));
	fillTextbox(txtUsername, readExcel(0,0));
	WebElement txtPassword = driver.findElement(By.id("password"));
	fillTextbox(txtPassword, readExcel(0,1));
	WebElement login = driver.findElement(By.id("login"));
	btnclick(login);
	
	}
}
