package com.test.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginTest {

	WebDriver driver;
	@Given("^Open Firefox and start application$")
	public void Open_Firefox_and_start_application() throws Throwable {
	     
		driver= new FirefoxDriver();
	     
	     driver.get("http://www.facebook.com");
	}

	@When("^Valid username and passsword are entered$")
	public void Valid_username_and_passsword_are_entered() throws Throwable {
	    
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("dahfaja");
	}

	@Then("^User should login succesfully$")
	public void User_should_login_succesfully() throws Throwable {
	    
		driver.findElement(By.id("loginbutton")).click();
	}
}
