package com.facebook.TestUtility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.facebook.TestBase.BaseClass;

public class WebDriverUtility extends BaseClass {

	static Select select;
	
	static WebElement element;
	
	static Set<String> windows;
	
	static ArrayList<String> list;
	
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void minimize() {
		driver.manage().window().minimize();
	}

	public static void implictWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.longWait));
	}

	public static void implictWait(int wait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static void get(String url)
	{
		driver.get(url);
	}
	
	public static String getText(By locator)
	{
		return driver.findElement(locator).getText();
	}
	
	public static void sendKeys(By locator,String value)
	{
		driver.findElement(locator).sendKeys(value);
	}
	
	public static void clickElement(By locator) {
		element=driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	
	public static void dropDownByIndex(By locator,int index)
	{
		element=driver.findElement(locator);
		select=new Select(element);
		select.selectByIndex(index);
	}
	public static void dropDownByValue(By locator,String value)
	{
		element=driver.findElement(locator);
		select=new Select(element);
		select.selectByValue(value);
	}
	
	public static void dropDownByVisibleText(By locator,String text)
	{
		element=driver.findElement(locator);
		select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static List<WebElement> dropdownGetOptions(By locator) {
		element = driver.findElement(locator);
		select = new Select(element);
		return select.getOptions();
	}
	
	public static boolean isDisplayed(By locator) {
		element = driver.findElement(locator);
		return element.isDisplayed();
	}

	public static boolean isEnabled(By locator) {
		element = driver.findElement(locator);
		return element.isEnabled();
	}

	public static boolean isSelected(By locator) {
		element = driver.findElement(locator);
		return element.isSelected();
	}
	
	public static void AlertOkButton() {
		driver.switchTo().alert().accept();
	}

	public static void AlertCancelButton() {
		driver.switchTo().alert().dismiss();
	}

	public static String AlertGetText() {
		return driver.switchTo().alert().getText();
	}

	public static void AlertSendKeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public static void scrollingdown(int xaxis, int yaxis) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}

	public static void scrollingup(int xaxis, int yaxis) {
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy("+xaxis+",-"+yaxis+")");
	}

	public static void scrollingToElement(By locator) {
		element=driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchToFrame(String iDorName) {
		driver.switchTo().frame(iDorName);
	}

	public static void switchToFrame(By locator) {
		element=driver.findElement(locator);
		driver.switchTo().frame(element);
	}

	public static void leaveFrameorAlert() {
		driver.switchTo().defaultContent();
	}
	
	public static void screenShot() {
		File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotTo = new File(Constants.screenshotpath+"\\fail" + System.currentTimeMillis() + ".png");
		try {
			FileHandler.copy(screenshotAs, screenshotTo);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void windowHandling(int index) {
		windows = driver.getWindowHandles();
		list = new ArrayList<String>(windows);
		driver.switchTo().window(list.get(index));
	}
}
