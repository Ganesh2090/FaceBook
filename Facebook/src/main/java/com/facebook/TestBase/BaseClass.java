package com.facebook.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.TestUtility.Constants;
import com.facebook.TestUtility.WebDriverUtility;

public class BaseClass
{
public static WebDriver driver;
	
	public void browserSetup(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new IllegalArgumentException("Please Check the Browser Configuration");
		}
		
		WebDriverUtility.maximize();
		WebDriverUtility.implictWait();
		WebDriverUtility.get(Constants.pageURL);
	}
	
}
