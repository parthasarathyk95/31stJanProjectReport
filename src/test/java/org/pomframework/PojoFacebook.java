// example:1 PojoFacbook (Constructor) 
//annotation in POM(Page Object Model)
//with @FindBy -> To find the Webelement  only one Criteria
package org.pomframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFacebook extends BaseClass{

public PojoFacebook() // constructor
{
	PageFactory.initElements(driver, this);
}
@FindBy(id = "email")
private WebElement txtuser;
@FindBy(id = "pass")
private WebElement txtpass;

public WebElement getTxtuser() {
	return txtuser;
}
public WebElement getTxtpass() {
	return txtpass;
}

}
