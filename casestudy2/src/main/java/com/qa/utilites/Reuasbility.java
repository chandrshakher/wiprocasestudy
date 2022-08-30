package com.qa.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.base.Base;

public class Reuasbility  extends Base{
	
	public Reuasbility(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectRadiobutton(String str) {
	WebElement magazinesRadioBtn = driver.findElement(By.xpath(str));
// Check if radio button is selected by default
if (magazinesRadioBtn.isSelected()) {
        // Print message to console
	System.out.println("Magazines radio button is selected by default");
} else {
	// Click the radio button
	magazinesRadioBtn.click();
}
		
		
	}

}
