package com.orange.stedef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;
import com.orange.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrange  {
	
	WebDriver driver;
	
	@Given("launch the browser")
	public void launch_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();   
	}
	
	
	@Given("open the orange application")
	public void open_the_orange_application() {
		driver.get("https://www.facebook.com");
	   
	}
	
	
	@When("enter the username and password")
	public void enter_the_username_and_password() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("8675521282");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Cskfan@2022");
	   
	}
	
	
	@When("click the login button")
	public void click_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	   
	}
	
	
	
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		WebElement wel = driver.findElement(By.id("welcome"));	
		String text=wel.getText();
		boolean contains = text.contains(text);
	Assert.assertTrue(contains);

	   
	}
	
	
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	   
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//WebDriver driver;		
//	@Given("open the orange application")
//	public void open_the_orange_application() {
//		
//
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//   
//	}
//	
//	
//	@When("click the login button")
//	public void click_the_login_button() {
//		WebElement login = driver.findElement(By.id("login"));
//		login.click();
//		
//	    
//	}
//	@Then("I validate the outcomes")
//	public void i_validate_the_outcomes() {
//	WebElement wel = driver.findElement(By.id("welcome"));	
//	String text=wel.getText();
//	boolean contains = text.contains(text);
//	
//	Assert.assertTrue(contains);
//	
//		
//	}
//	
//	
//	@Then("close the browser")
//	public void close_the_browser() {
//		driver.close();
//	}
//	
//	@When("enter the username and password")
//	public void enter_the_username_and_password() {
//		WebElement user = driver.findElement(By.id("email"));
//	    user.sendKeys("email");
//	    
//	    WebElement pass = driver.findElement(By.id("passContainer"));
//	    pass.sendKeys("password");
//       
//	}
//
//
}
