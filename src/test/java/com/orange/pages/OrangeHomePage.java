package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.utils.BaseClass;

public class OrangeHomePage extends BaseClass {
	
	public OrangeHomePage(){
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id ="welcome")
    private WebElement wel;

	public WebElement getWel() {
		return wel;
	}
}
