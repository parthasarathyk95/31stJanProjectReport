package org.pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//
	public static WebDriver driver;
//chromebrowser function
	public static void chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();	
	}
//launchurl function
	public static void launchUrl(String url) {
		driver.get(url);
	}
//mainwindow function
	public static void mainwindow() {
		driver.manage().window().maximize();
	}	
//pageTitle function	
	public static void pageTitle() {
		String titleName = driver.getTitle();
		System.out.print("titleName: ");
		System.out.println(titleName);
	}	
//pageUrl function	
	public static void pageUrl() {
		String Url = driver.getCurrentUrl();
		System.out.print("Url: ");
		System.out.println(Url);
	}
//fillTextBox function
	public static void fillTextbox(WebElement element, String value) {
		element.sendKeys(value);
	}
//fillTextBox function for dropdown select function
	public static void dropdown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
//fillTextBox function for dropdown select function
	public static void dropdownindex(WebElement element, int v) {
		Select s = new Select(element);
		s.selectByIndex(v);
	}
	//fillTextBox function for dropdown select function
	public static void dropdowntxt(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
//btnclick function
	public static void btnclick(WebElement ref) {
		ref.click();
	}
//pageRefresh function
	public static void pageRefresh() {
		driver.navigate().refresh();
	}
//time function
	public static void hold(int time) throws InterruptedException {
		Thread.sleep(time);
	}	
}
