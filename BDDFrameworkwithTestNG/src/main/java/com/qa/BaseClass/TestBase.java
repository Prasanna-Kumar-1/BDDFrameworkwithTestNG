package com.qa.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.qa.Utilities.TestUtility;
import com.qa.Utilities.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties property;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    
    public TestBase()
    {
    	property = new Properties();
    	try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Yash\\eclipse-workspaceNEW\\BDDFrameworkwithTestNG\\src\\main\\java\\com\\qa\\Configuration\\Configuration.properties");
			property.load(ip);
		    } catch (FileNotFoundException e) 
    	    {
			  e.printStackTrace();
		    } catch (IOException e) 
    	    {
			e.printStackTrace();
		    }
    }	
    
    public static void initialization()
    {
    	String browserName = property.getProperty("Browser");
    	
    	if(browserName.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
    	
		e_driver = new EventFiringWebDriver(driver);
		//Now create object of EventListerHandler to register it with EventFiringWebDriver.
		eventListener = new WebEventListener();
		
		e_driver.register((WebDriverEventListener) eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtility.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtility.Implicit_Wait, TimeUnit.SECONDS);
		
		driver.get(property.getProperty("Url"));
    	
    }
}
