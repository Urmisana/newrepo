package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends LibGlobal {
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtemail;
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
	private WebElement btnlogin;
	
	
	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	
	
}
