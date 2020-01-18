package com.qa.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.BaseClass.TestBase;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageTest extends TestBase{
	
	WebDriver driver;
	LoginPage login;
	HomePage homePage;
	
	@Given("^User is already on the Login Page$")
	public void user_is_already_on_the_Login_Page() throws Throwable 
	{
	 
		initialization();
	}

	@When("^the title of the login page is Allianz Login$")
	public void the_title_of_the_login_page_is_Allianz_Login() throws Throwable 
	{
		login = new LoginPage();
		String loginPageTitle = login.validateLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "Allianz Login");
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	public void user_enters_and_and_click_on_login_button(String Username, String Password) throws Throwable 
	{
		login.login(Username, Password);
	}
	
	@Then("^User is on the Home Page$")
	public void user_is_on_the_Home_Page() throws Throwable 
	{
	
		homePage = new HomePage();
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "allianz.com.au - My Portfolio"); 
	}
}
