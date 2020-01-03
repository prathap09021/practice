package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath = "(//td[@align='right'])[2]")
	WebElement loginName;
	@FindBy(xpath = "(//td[@align='right'])[3]")
	WebElement PWD;
	@FindBy(name = "Submit")
	WebElement submit;
	@FindBy(name = "clear")
	WebElement clear;
	@FindBy(name = "txtUserName")
	WebElement loginField;
	@FindBy(name = "txtPassword")
	WebElement pwdField;
	@FindBy(xpath = "//a[text()='Change Password']")
	WebElement changePWD;
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;
	@FindBy(xpath = "//ul[@id='option-menu']/li[1]")
	WebElement Welcomenote;
	public LoginPage(){
		
		PageFactory.initElements(dr, this);
		
	}
	
	public String verifyTitle()
	{
		String title = dr.getTitle();
		
		return(title);
		
	}
	public boolean verifyUsername(){
		
		return loginName.isDisplayed();
		
	}
	public boolean verifyPWDlabel(){
		
		return PWD.isDisplayed();
		
	}
	public boolean verifySubmitLabel(){
		
		return submit.isDisplayed();
		
	}
	public boolean verifyClearLabel(){
		
		return clear.isDisplayed();
		
	}
	
	public HomePage login(String UN, String PWD)
	{
		loginField.sendKeys(UN);
		pwdField.sendKeys(PWD);
		submit.click();	
		return new HomePage();
	}
	public String  verifyHomepageTitle()
	{
		return dr.getTitle();
	}
	
	public boolean changePasword(){
		
		return changePWD.isDisplayed();
		
	}
	public boolean logoutverify(){
		
		
		return Logout.isDisplayed();
	}
	
	public String verifyyyUN(){
		
		return Welcomenote.getText();
		
		
	}
	public void logout(){
		Logout.click();	
	}
	

	
	

}
