package com.nlsinc.java.FaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
 
 
 
 
import org.openqa.selenium.WebDriver;
 
public class FaceBookTest {
	public WebDriver driver;
	public String url;
	public FaceBookPOM page;
	public FaceBookWelComePage welcome;
	public String fname;
	public String lname;
	public String email;
	public String remail;
	public String pwd;

  @BeforeClass
  public void beforeClass() {
	  url="https://www.facebook.com";
	  fname="vengamma";
	  lname="naidu";
	  email="vengammaba@gmail.com";
	  remail="vengammaba@gmail.com";	  
	  pwd="madhu@123";
  }
  
	  @Test(priority=0)
	  public void driverInitialization() { 
		 // page=new FaceBookPOM(driver);
		  driver=GetFbPage.goToPage(url);
	  }

@Test(priority=1)
  public void RegistationsValues() throws InterruptedException{
	page=new FaceBookPOM(driver);
	  page.Fname(fname);
	  page.Lname(lname);
	  page.Email(email);
	  page.Remail(remail);
	  page.Pwd(pwd);
	  page.Month();
	  page.Day();
	  page.Year();
	  page.Radio();
	  page.Signin();
	  
	  
  }
  

  
  
  
}
