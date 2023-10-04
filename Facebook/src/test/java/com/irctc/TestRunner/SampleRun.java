package com.irctc.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.PageActions.CreatePageActions;
import com.facebook.TestBase.BaseClass;
public class SampleRun extends BaseClass{
	
	CreatePageActions createPageActions;
	
	@BeforeTest
	public void setUp()
	{
		browserSetup("chrome");
		createPageActions=new CreatePageActions();
	}
	

	@Test(priority = 1)
	public void validateDropDown()
	{
		createPageActions.verifyDropDown();
	}
	
	@Test(priority = 2)
	public void validateWindows()
	{
		createPageActions.verifyWindows();
	}
	
	@Test(priority = 0)
	public void validateAccount()
	{
		createPageActions.verifyAccount("admin", "tester");
	}
}
