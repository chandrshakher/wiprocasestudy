package com.qa.page;

import org.openqa.selenium.WebDriver;

import com.qa.base.Base;
import com.qa.utilites.Reuasbility;

public class Searchflightpage extends Base{
	   Reuasbility reu=new Reuasbility(driver);

	public Searchflightpage(WebDriver driver) {
		this.driver=driver;
	}
	 public void clickonradiobutton(String str1) {
		 reu.selectRadiobutton(str1);
	 }

	
	
}
