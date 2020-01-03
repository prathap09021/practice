package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.TestBase;

public class LoginPagee extends TestBase {
	
	
 @FindBy (name = "txtUserName")
 WebElement login;
 @FindBy(name = "txtPassword")
 WebElement password;
 @FindBy(name = "Submit")
	WebElement submit;
 @FindBy(name = "clear")
	WebElement clearrrr;
 
 public LoginPagee()
 {
	 PageFactory.initElements(dr, this);
 }
 
 public boolean verifyUN()
 {
	boolean lgn =login.isDisplayed();
	return lgn;
 }
 
 public boolean verifyPWD()
 {
	boolean PWD =password.isDisplayed();
	return PWD;
 }
 
 public boolean submit()
 {
	boolean smt =submit.isDisplayed();
	return smt;
 }
 
 public boolean clear()
 {
	boolean clr =clearrrr.isDisplayed();
	return clr;
 }
 
 
 
 
	
	
}
