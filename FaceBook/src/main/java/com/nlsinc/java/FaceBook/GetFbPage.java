package com.nlsinc.java.FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetFbPage {


	static WebDriver driver;


	
	public static WebDriver goToPage(String url){
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();	
		return driver;
		
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public String getURL(){
		return driver.getCurrentUrl();
	}
	}
