package org.pomframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoFlipkart extends BaseClass{
	public LoginPojoFlipkart()// non-parametrized Constructor 
	{
		PageFactory.initElements(driver, this);
	}	
	@FindBys(
			{
			@FindBy(xpath ="(//input[@type='text'])[2]")	
			})
	private WebElement txtUser;
	
	@FindBys(
			{
			@FindBy(xpath="//input[@type='password']")
			})
    private WebElement txtPass;
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}
}
