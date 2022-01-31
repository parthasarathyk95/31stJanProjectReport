//example4:
//creating a excel filename.extension in excel filename folder by user manually in excel foldername  
//by datadriven method the data in excel sheet is get through string by baseclass method  through extends
package org.sample1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sampleday4 extends Baseclass{
	public static void main(String[] args) throws IOException{
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		mainwindow();
		WebElement txtUser = driver.findElement(By.id("email"));
		fillTextbox(txtUser, readExcel(0,0));
		//Thread.sleep(10);
		WebElement txtPass = driver.findElement(By.id("pass"));
		fillTextbox(txtPass, readExcel(0,1));
		WebElement login = driver.findElement(By.name("login"));
		btnclick(login);
	}

	
}
