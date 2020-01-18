package com.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="loginUsername")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath = "//input[contains(@value,'Login')]")
	WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginButton);
				
		return new HomePage();
	}
	
}
