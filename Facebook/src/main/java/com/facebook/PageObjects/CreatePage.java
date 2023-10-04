package com.facebook.PageObjects;


	import org.openqa.selenium.By;

import com.facebook.TestBase.BaseClass;

	public class CreatePage extends BaseClass{

		private String createBtnxpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
		public By createBtn=By.xpath(createBtnxpath);
	///html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a
		private String yearxpath="/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]";
		public By year=By.xpath(yearxpath);
		
		private String firstNamexpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
		public By firstName=By.xpath(firstNamexpath);
		
		private String lastNamexpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input";
		public By lastName=By.xpath(lastNamexpath);
		
		private String termsxpath="/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/p/a[1]";
		public By terms=By.xpath(termsxpath);
		
		
		

}
