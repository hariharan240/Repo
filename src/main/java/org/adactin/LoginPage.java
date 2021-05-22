package org.adactin;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
	public LoginPage() {
PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id="username")
	private WebElement u;
	
	@FindBy(id="password")
	private WebElement p;
	
	@FindBy(id="login")
	private WebElement c;

	public WebElement getU() {
		return u;
	}

	public WebElement getP() {
		return p;
	}

	public WebElement getC() {
		return c;
	}
	
}
