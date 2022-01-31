package org.pomframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoHotel extends BaseClass{
	public PojoHotel() {
		PageFactory.initElements(driver, this);
	}
	////login page -> username -> password -> submit
	@FindBy(id = "username")
	private WebElement txtUser;
	@FindBy(id = "password")
	private WebElement txtPass;
	@FindBy(id = "login")
	private WebElement txtLogin;
	
	// Drop down function
	// drop down and select the option using drop down method
	//Location->Hotels->Room_type->NoOfRoom->Adult_per_Room->Child_per_Room->Submit
	@FindBy(xpath = "//select[@id='location']")
	private WebElement txtLocation;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement txtHotels;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement txtRoomtype;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement txtNoofrooms;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement txtAdultroom;
	@FindBy(xpath = " //select[@id='child_room']")
	private WebElement txtChildroom;
	@FindBy(id = "Submit")
	private WebElement txtSubmit;
	
	// select hotel 
	@FindBy(id="radiobutton_0")
	private WebElement txtRadiobutton;
	@FindBy(id="continue")
	private WebElement txtContinuebutton;
	
	// book a Hotel
	// firstname->lastname->billingaddress->CreditCardNo->CreditCardType->CreditexpMnth->CreditexpYear->CVVNumber->BookNow
	@FindBy(id = "first_name")
	private WebElement txtFirstname;
	@FindBy(id = "last_name")
	private WebElement txtLastname;
	@FindBy(id = "address")
	private WebElement txtBillingaddress;	
	@FindBy(id = "cc_num")
	private WebElement txtCreditCardNo;	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement txtCreditCardType;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement txtCreditexpMnth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement txtCreditexpYear;	
	@FindBy(id = "cc_cvv")
	private WebElement txtCVVNumber;
	@FindBy(id = "book_now")
	private WebElement txtBookNow;	
	
	
	// Getters functions
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getTxtLogin() {
		return txtLogin;
	}
	public WebElement getTxtLocation() {
		return txtLocation;
	}
	public WebElement getTxtHotels() {
		return txtHotels;
	}
	public WebElement getTxtRoomtype() {
		return txtRoomtype;
	}
	public WebElement getTxtNoofrooms() {
		return txtNoofrooms;
	}
	public WebElement getTxtAdultroom() {
		return txtAdultroom;
	}
	public WebElement getTxtChildroom() {
		return txtChildroom;
	}
	public WebElement getTxtSubmit() {
		return txtSubmit;
	}
	public WebElement getTxtRadiobutton() {
		return txtRadiobutton;
	}
	public WebElement getTxtContinuebutton() {
		return txtContinuebutton;
	}
	public WebElement getTxtFirstname() {
		return txtFirstname;
	}
	public WebElement getTxtLastname() {
		return txtLastname;
	}
	public WebElement getTxtBillingaddress() {
		return txtBillingaddress;
	}
	public WebElement getTxtCreditCardNo() {
		return txtCreditCardNo;
	}
	public WebElement getTxtCreditCardType() {
		return txtCreditCardType;
	}
	public WebElement getTxtCreditexpMnth() {
		return txtCreditexpMnth;
	}
	public WebElement getTxtCreditexpYear() {
		return txtCreditexpYear;
	}
	public WebElement getTxtCVVNumber() {
		return txtCVVNumber;
	}
	public WebElement getTxtBookNow() {
		return txtBookNow;
	}
	
}
