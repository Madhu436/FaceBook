package com.nlsinc.java.FaceBook;

import org.openqa.selenium.WebDriver;

public class FaceBookWelComePage extends GetFbPage {

	public static WebDriver driver;
	
	public String getTitle(){
		return driver.getTitle();
		
	}
   public String getURl(){
	return driver.getCurrentUrl();
	}
	
}
