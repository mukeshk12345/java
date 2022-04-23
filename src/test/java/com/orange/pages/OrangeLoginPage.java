package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.utils.BaseClass;

public class OrangeLoginPage extends BaseClass {
	
	public OrangeLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername")
	private WebElement user;
	
	
	public WebElement getUser() {
		return user;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin() {
		return login;
	}

	@FindBy(id = "txtPassword")
	private WebElement pass;
	
	
	@FindBy(id = "btnLogin")
	private WebElement login;
}
