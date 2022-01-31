package org.pomframework;

import org.openqa.selenium.WebElement;

public class example5 extends BaseClass {
public static void main(String[] args) {
	chromeBrowser();
	launchUrl("http://www.adactin.com/HotelApp/");
	mainwindow();
	// POJO class
	PojoHotel h = new PojoHotel();
	 
	//login page -> username -> password -> submit
	WebElement user = h.getTxtUser();
	fillTextbox(user, "karthips95");
	
	WebElement pass = h.getTxtPass();
	fillTextbox(pass, "ps260497");
	
	WebElement login = h.getTxtLogin();
	btnclick(login);
	
	// Drop down function
	//drop down and select the option using drop down method
	//Location->Hotels->Room_type->NoOfRoom->Adult_per_Room->Child_per_Room->Submit
	
	WebElement location = h.getTxtLocation();
	dropdown(location, "Sydney");
	
	WebElement hotels = h.getTxtHotels();
	dropdown(hotels, "Hotel Sunshine");
	
	WebElement roomtype = h.getTxtRoomtype();
	dropdown(roomtype, "Standard");
	
	WebElement noofroom = h.getTxtNoofrooms();
	dropdownindex(noofroom, 2);
	
	WebElement adultperroon = h.getTxtAdultroom();
	dropdownindex(adultperroon, 2);
	
	WebElement chilperroom = h.getTxtChildroom();
	dropdownindex(chilperroom, 2);
	
	WebElement submit = h.getTxtSubmit();
	btnclick(submit);
	
	// select hotel 
	
	WebElement radiobutton = h.getTxtRadiobutton();
	btnclick(radiobutton);;
	
	WebElement continuebutton = h.getTxtContinuebutton();
	btnclick(continuebutton);
	
	// book a Hotel
	// firstname->lastname->billingaddress->CreditCardNo->CreditCardType->CreditexpMnth->CreditexpYear->CVVNumber->BookNow
	
	WebElement firstname = h.getTxtFirstname();
	fillTextbox(firstname, "Karthick");
	
	WebElement lastname = h.getTxtLastname();
	fillTextbox(lastname, "Subburaj");
	
	WebElement billingaddress = h.getTxtBillingaddress();
	fillTextbox(billingaddress, "No.123 Street name,landmark,place,pincode-123456.");
	
	WebElement creditcardno = h.getTxtCreditCardNo();
	fillTextbox(creditcardno, "1234 5678 9101 1123");
	
	WebElement creditcardtype = h.getTxtCreditCardType();
	dropdownindex(creditcardtype, 3);
	
	WebElement creditexpmnth = h.getTxtCreditexpMnth();
	dropdownindex(creditexpmnth, 1);
	
	WebElement creditexpyear = h.getTxtCreditexpYear();
	dropdowntxt(creditexpyear, "2022");
	
	WebElement cvvnumber = h.getTxtCVVNumber();
	fillTextbox(cvvnumber, "1234");
	
	WebElement Booknow = h.getTxtBookNow();
	btnclick(Booknow);
	
}
}
