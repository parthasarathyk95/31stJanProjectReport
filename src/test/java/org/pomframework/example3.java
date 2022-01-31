package org.pomframework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class example3 extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	chromeBrowser();
	launchUrl("http://www.greenstechnologys.com/");
	mainwindow();
	
	// javascriptEExecutor (Interface) for Scrolldown and ScrollUp
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//note:1
	//In home page scrolldown print the last line "greens technology overall reviews"and again scrollup and print the first line "NO 1 software training institute....".
	// Scroll down the page to review end for 5 second
	WebElement scrolldownreview = driver.findElement(By.xpath("//a[text()=' Privacy Policy']"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrolldownreview);
	Thread.sleep(5000);
	
	// Scroll up the page to review end for 5 second
	WebElement scrollupreview = driver.findElement(By.xpath("//h1[text()='No 1 Software Training Institutes in Chennai with Placements']"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrollupreview);
	Thread.sleep(5000);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//note:2
	//Click certificaion and then click selenium course content.In that page print the paragraph below testimonial and print title selenium.
	
	//Click certificaion
	WebElement certificate = driver.findElement(By.xpath("//a[text()='Certifications']"));
	btnclick(certificate);
	
	//click selenium course content
	WebElement scrolldownselenium = driver.findElement(By.xpath("(//h1[text()='SELENIUM'])[1]"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrolldownselenium);
	Thread.sleep(5000);
	
	WebElement coursecontent = driver.findElement(By.xpath("(//a[text()='Course Content'])[29]"));
	btnclick(coursecontent);
	
	//In that page print the paragraph below testimonial
	WebElement scrolldowntestimonial = driver.findElement(By.xpath("(//img[@title='Selenium Training in Chennai'])[12]"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrolldowntestimonial);
	Thread.sleep(5000);

	//print title selenium
	WebElement seleniumtext = driver.findElement(By.xpath("(//p[contains(text(),'SELENIUM')])[2]"));
	String txt = seleniumtext.getText();
	System.out.print("print title selenium: ");
	System.out.println(txt);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//note:3
	//Click course(mouse Over Action) and then click java training(mouse over action) and then click core java training.
    //scroll down and print the line "Java training Reviews from Anitha"

	//Click course(mouse Over Action)
	WebElement scrollupcourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrollupcourse);
	Thread.sleep(5000);
	//Click course(mouse Over Action)
	Actions a = new Actions(driver);
	WebElement s = driver.findElement(By.xpath("//a[text()='COURSES']"));
	a.moveToElement(s).perform();
	Thread.sleep(5000);
	WebElement d = driver.findElement(By.xpath("//a[contains(text(),'Java Training ')]")); //    //a[text()='Java Training']
	a.moveToElement(d).perform();
	Thread.sleep(5000);
	WebElement j = driver.findElement(By.xpath("//a[text()='Core Java Training']"));
	//a.dragAndDrop(d, j).perform();
	btnclick(j);
	
	//scroll down and print the line "Java training Reviews from Anitha"
	WebElement scrolldownline = driver.findElement(By.xpath("//h2[text()='Java training Reviews from Anitha']"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrolldownline);
	Thread.sleep(5000);
	//print title line
	WebElement linetext = driver.findElement(By.xpath("//h2[contains(text(),'Java training Reviews from Anitha')]"));
	String txt1 = linetext.getText();
	System.out.print("print the line Java training Reviews from Anitha:");
	System.out.println(txt1);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//note:4
	//Click career and scrolldown till the end and print the email displayed at last.
	//scrollup to career and Click career
	WebElement scrollupcareer = driver.findElement(By.xpath("//a[text()='CAREERS']"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrollupcareer);
	Thread.sleep(5000);	
	btnclick(scrollupcareer);
	//scrolldown till the end and print the email displayed at last
	WebElement scrolldownemail = driver.findElement(By.xpath("(//a[text()='contact@greenstechnologys.com'])[1]"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrolldownemail);
	Thread.sleep(5000);	
	//print the email displayed at last.
	WebElement emailprint = driver.findElement(By.xpath("(//a[contains(text(),'contact@greenstechnologys.com')])[1]"));
	String txt2 = emailprint.getText();
	System.out.print("print the email displayed at last:" );
	System.out.println(txt2);		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//note:5
	//Click testimonial and print the mobile number displayed in address and scrolldown and print the last line"Thank you very much for your help and further help needed. and my special thanks to Mr. Sandeep"
	
	// print the mobile number displayed in address
	WebElement mobilenumberprint = driver.findElement(By.xpath("(//a[@title='+91-8939915577'])[6]"));
	String txt3 = mobilenumberprint.getText();
	System.out.print("print the mobile number displayed in address: " );
	System.out.println(txt3);
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//note:6
	//Click Contact Us and print the line "Our Main Branches In Chennai" and scrolldown and then print "Copyright Š 2018 Greens Technology. All rights reserved."
	//scrollup to career and Click career
	WebElement scrollupContactus = driver.findElement(By.xpath("(//a[@title='Contact Us'])[1]"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrollupContactus);
	Thread.sleep(5000);	
	btnclick(scrollupContactus);
	Thread.sleep(5000);	
	//print the line "Our Main Branches In Chennai"
	//WebElement printbranches = driver.findElement(By.xpath("//h3[contains(text(),'Our Main Branches In Chennai ')]"));
	WebElement printbranches = driver.findElement(By.xpath("//h3[@class='title divider-3']"));
	String txt4 = printbranches.getText();
	System.out.print("print the line Our Main Branches In Chennai:" );
	System.out.println(txt4);
	
	//Windows handling ->once click a contactus icon reach to a newtab to access it by windows handling method 
	String parId = driver.getWindowHandle();
	System.out.println(parId);
	
	Set<String> allWindId = driver.getWindowHandles();
	System.out.println(allWindId);
	
	for (String eacWindId : allWindId) {
		if(!parId.equals(eacWindId)) {
			driver.switchTo().window(eacWindId);
		}
	}
	
	// scrolldown and then print "Copyright Š 2018 Greens Technology. All rights reserved
	WebElement scrolldownend = driver.findElement(By.xpath("//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrolldownend);
	Thread.sleep(5000);	
	// print
	WebElement printend = driver.findElement(By.xpath("//p[contains(text(),'Copyright © 2018 Greens Technology. All rights reserved.')]"));
	String txt5 = printend.getText();
	System.out.print("print Copyright Š 2018 Greens Technology. All rights reserved:" );
	System.out.println(txt5);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
}
