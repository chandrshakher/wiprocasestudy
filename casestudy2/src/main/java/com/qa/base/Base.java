package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public  FileInputStream fs;
	 public   Properties properties;
	 public static WebDriver driver;
	 public  static EventFiringWebDriver e_driver;

	public WebDriver driverLauch() {
		try {
			properties=new Properties();
		     fs=new FileInputStream("/Users/c.s.yadav/Documents/Seleniumlaeringproject/casestudy2/resource/com/qa/configuration/config.properties");
		     properties.load(fs);
		     WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		     driver.manage().window().maximize();
		     driver.manage().deleteAllCookies();
		     driver.get(properties.getProperty("url"));
		   
	}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
		return driver;
	}




	
	
}
