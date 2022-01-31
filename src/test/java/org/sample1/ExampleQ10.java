package org.sample1;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ExampleQ10 extends Baseclass{
	public static void main(String[] args) throws IOException {
		
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
		
		// Drop down function
		//drop down and select the option using drop down method
		// Location
		WebElement location_dropdown = driver.findElement(By.xpath("//select[@id='location']"));
		dropdown(location_dropdown, readExcel(1,1));
		// Hotels
		WebElement hotels_dropdown = driver.findElement(By.xpath("//select[@id='hotels']"));
		dropdown(hotels_dropdown, readExcel(2,1));
		// Room_type
		WebElement roomtype_dropdown = driver.findElement(By.xpath("//select[@id='room_type']")); //     
		dropdown(roomtype_dropdown, readExcel(3,1));
		// NoOfRoom
		WebElement NoOfRoom_dropdown = driver.findElement(By.xpath("//select[@id='room_nos']")); //     
		dropdownindex(NoOfRoom_dropdown, 1);	
		// Adult_per_Room
		WebElement adultroom_dropdown = driver.findElement(By.xpath("//select[@id='adult_room']"));
		dropdownindex(adultroom_dropdown, 1);
		// Child_per_Room
		WebElement childroom_dropdown = driver.findElement(By.xpath("//select[@id='child_room']"));
		dropdownindex(childroom_dropdown, 0);
		// submit
		WebElement login1 = driver.findElement(By.id("Submit"));
		btnclick(login1);
		
		
		// select hotel 
		WebElement radiobutton= driver.findElement(By.id("radiobutton_0"));
		btnclick(radiobutton);	
		WebElement continue_button = driver.findElement(By.id("continue"));
		btnclick(continue_button);
		
		
		// book a Hotel
		// firstname
		WebElement firstname = driver.findElement(By.id("first_name"));
		fillTextbox(firstname, readExcel(7,1));
		// lastname
		WebElement lastname = driver.findElement(By.id("last_name"));
		fillTextbox(lastname, readExcel(8,1));
		// billingaddress
		WebElement  billingaddress = driver.findElement(By.id("address"));
		fillTextbox( billingaddress, readExcel(9,1));
		// CreditCardNo
		WebElement CreditCardNo = driver.findElement(By.id("cc_num"));
		fillTextbox(CreditCardNo, readExcel(10,1));	
		// CreditCardType
		WebElement CreditCardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		dropdownindex(CreditCardType, 3);	
		// CreditexpMnth
		WebElement CreditexpMnth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		dropdownindex(CreditexpMnth, 1);		
		// CreditexpYear
		WebElement CreditexpYear= driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		dropdownindex(CreditexpYear, 12);	
		// CVVNumber
		WebElement CVVNumber= driver.findElement(By.id("cc_cvv"));
		fillTextbox(CVVNumber, readExcel(14,1));
		// BookNow
		WebElement BookNow= driver.findElement(By.id("book_now"));
		btnclick(BookNow);
		
		
		//booking confirmation page-> Update the orderNo generated after hotel booking in excel sheet using DataDriven.
		
//		List<WebElement> alltables = driver.findElements(By.tagName("table"));
//		int a = alltables.size();
//		System.out.println("table size: ");
//		System.out.println(a);
		
//		WebElement table = driver.findElement(By.xpath("//table[@c/lass='login']"));
//		List<WebElement> alldatas = table.findElements(By.tagName("td"));
//		WebElement data = alldatas.get(3);
//		System.out.println(data.getText());
		WebElement table = driver.findElement(By.xpath("//input[@id='order_no']"));
		//String text = table.getAttribute("value");
		String text = table.getText();
		System.out.println(text);
		}
	
}
