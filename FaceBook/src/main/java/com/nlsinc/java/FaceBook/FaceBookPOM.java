package com.nlsinc.java.FaceBook;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookPOM extends GetFbPage {

	
	     WebDriver driver;
	By fname=By.id("u_0_1");
	By lname=By.id("u_0_3");
	By email=By.id("u_0_6");
	By remail=By.id("u_0_9");
	By pwd=By.id("u_0_b");
	//By month=By.id("month");
	By smonth=By.xpath("//select[@id='month']//option[@value='1']"); 
	//By day=By.id("day");
	By sday=By.xpath("//select[@id='day']//option[@value='2']");
	//By year=By.id("year");
	By syear=By.xpath("//select[@id='year']//option[@value='1990']");
	By fmale=By.id("u_0_e");
	By button=By.id("u_0_j");
By lclick=By.id("userNavigationLabel");
	By logout=By.id("u_7_1");
	
	public FaceBookPOM(WebDriver driver) {
		this.driver=driver;
	}
	public void Fname(String fn){
		driver.findElement(fname).sendKeys(fn);
		
	}
	public void Lname(String ln){
		driver.findElement(lname).sendKeys(ln);
		
	}
	public void Email(String em){
		driver.findElement(email).sendKeys(em);
		
	}
	public void Remail(String rem){
		driver.findElement(remail).sendKeys(rem);
		
	}
	public void Pwd(String pwd1){
		driver.findElement(pwd).sendKeys(pwd1);
		
	}
 
	 
	public void Month(){
		driver.findElement(smonth).click();
		
	}
	public void Day(){
		driver.findElement(sday).click();
		
	}
	public void Year(){
		driver.findElement(syear).click();
		
	}
	public void Radio(){
		driver.findElement(fmale).click();
		
	}
	public void Signin() throws InterruptedException{
		driver.findElement(button).click();
		Thread.sleep(2000);
	}
	
 /*public void LClick(){
		driver.findElement(lclick).click();
	}
	public void LogOut(){}
	{
		driver.findElement(logout).click();
	}*/
}

