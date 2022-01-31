package org.sample1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExampleQ6 extends Baseclass{
	public static void main(String[] args) throws IOException{
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		mainwindow();
		WebElement txtUser = driver.findElement(By.id("email"));
		fillTextbox(txtUser, readExcel(0,0));
		WebElement txtPass = driver.findElement(By.id("pass"));
		fillTextbox(txtPass, readExcel(0,1));
		WebElement login = driver.findElement(By.name("login"));
		btnclick(login);
	}
}
