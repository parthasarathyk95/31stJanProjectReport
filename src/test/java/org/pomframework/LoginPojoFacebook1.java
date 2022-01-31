// example:2 LoginPojoFacbook (Constructor) 
//annotation in POM(Page Object Model)
// FindBys - Multiple criteria will be given for finding single webelement -> if it is satisfying all the conditions, then only Webelement will be fetched (Acts Like AND Operator)
package org.pomframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoFacebook1 extends BaseClass{

	public LoginPojoFacebook1()// Constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBys(
			{
			@FindBy(id="email"),
			@FindBy(xpath ="//input[@name='email']")	
			})
	private WebElement txtUser;
	
	@FindBys(
			{
			@FindBy(id="pass")	,
			@FindBy(xpath="//input[@name='pass']")
			})
    private WebElement txtPass;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}
	
}
