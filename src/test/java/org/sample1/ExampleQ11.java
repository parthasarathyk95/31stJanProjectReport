package org.sample1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExampleQ11 extends Baseclass{
public static void main(String[] args) throws IOException {
		
		chromeBrowser();
		launchUrl("https://www.naukri.com/registration/createAccount");
		mainwindow();
		//naukri regitration login page -> fullname ->emailid -> password -> mobile no_>submit   
				WebElement txtFullname = driver.findElement(By.id("name"));
				fillTextbox(txtFullname, readExcel(0,0));
				WebElement txtemail = driver.findElement(By.id("email"));
				fillTextbox(txtemail , readExcel(0,1));
				WebElement txtpass = driver.findElement(By.id("password"));
				fillTextbox(txtpass, readExcel(0,2));
				WebElement txtmobileno = driver.findElement(By.id("mobile"));
				fillTextbox(txtmobileno , readExcel(0,3));	
				WebElement exp = driver.findElement(By.xpath("//h2[text()='I'm Experienced']"));
				btnclick(exp);
				WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
				btnclick(register);
		
}
}
