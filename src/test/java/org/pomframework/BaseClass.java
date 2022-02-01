package org.pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
// 
	public static WebDriver driver;
//chromebrowser method
	public static void chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();	
	}
//launchurl method
	public static void launchUrl(String url) {
		driver.get(url);
	}
//mainwindow method
	public static void mainwindow() {
		driver.manage().window().maximize();
	}	
//pageTitle method	
	public static void pageTitle() {
		String titleName = driver.getTitle();
		System.out.print("titleName: ");
		System.out.println(titleName);
	}	
//pageUrl method	
	public static void pageUrl() {
		String Url = driver.getCurrentUrl();
		System.out.print("Url: ");
		System.out.println(Url);
	}
//fillTextBox method with parameter Webelement and String 
	public static void fillTextbox(WebElement element, String value) {
		element.sendKeys(value);
	}
//dropdown method with parameter Webelement and String 
	public static void dropdown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
//dropdown method with parameter Webelement and integer 
	public static void dropdownindex(WebElement element, int v) {
		Select s = new Select(element);
		s.selectByIndex(v);
	}
//dropdowntxt method with parameter Webelement and String 
	public static void dropdowntxt(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
//btnclick method
	public static void btnclick(WebElement ref) {
		ref.click();
	}
//pageRefresh method
	public static void pageRefresh() {
		driver.navigate().refresh();
	}
//time method
	public static void hold(int time) throws InterruptedException {
		Thread.sleep(time);
	}
// newly added method
	private void new_function() {
		System.out.println("new_function");
	}
// another method	
	private void another_method() {
		System.out.println("another_method");
	}
// today method
	private void today_method() {
		System.out.println("today_method");
	}
}
