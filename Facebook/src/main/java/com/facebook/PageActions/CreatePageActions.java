package com.facebook.PageActions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.facebook.PageObjects.CreatePage;
import com.facebook.TestUtility.WebDriverUtility;

public class CreatePageActions extends CreatePage
{

	
	public void verifyAccount(String fname,String lname)
	{
		WebDriverUtility.sendKeys(firstName, fname);
		WebDriverUtility.sendKeys(lastName, lname);
	}
	
	public void verifyDropDown()
	{
		WebDriverUtility.clickElement(createBtn);
		List<WebElement> allyear=WebDriverUtility.dropdownGetOptions(year);
		System.out.println(allyear.size());
		for (WebElement aa : allyear) {
			System.out.println(aa.getText());
		}
	}
	
	public void verifyWindows()
	{
		WebDriverUtility.clickElement(terms);
		WebDriverUtility.windowHandling(1);
		System.out.println(WebDriverUtility.getTitle());
		System.out.println(WebDriverUtility.getCurrentUrl());
		WebDriverUtility.screenShot();
	}
}

