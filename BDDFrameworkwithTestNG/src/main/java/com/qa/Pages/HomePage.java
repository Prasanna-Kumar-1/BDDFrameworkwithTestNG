package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LoginPage{

	@FindBy(xpath="//strong[contains(.,pktest001)]")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath = "//input[contains(@value,'Get a car quote')]")
	WebElement carQuoteBtn;
	
	@FindBy(xpath = "//input[contains(@value,'Get a home quote')]")
	WebElement homeQuoteBtn;
			
	@FindBy(xpath = "//input[contains(@value,'Get a life quote')]")
	WebElement lifeQuoteBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public CarQuotePage clickOncarQuoteBtn()
	{
		carQuoteBtn.click();
		return new CarQuotePage();
	}
	
	
	public HomeQuotePage clickOnhomeQuoteBtn()
	{
		homeQuoteBtn.click();
		return new HomeQuotePage();
	}
	
	public LifeQuotePage clickOnlifeQuoteBtn()
	{
		lifeQuoteBtn.click();
		return new LifeQuotePage();
	}
}
