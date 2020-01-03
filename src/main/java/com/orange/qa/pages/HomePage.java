package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy (xpath = "//input[@onclick='returnAdd();']")
	WebElement add;
	@FindBy (xpath = "//h2")
	WebElement PIM;
	
	
	public void HomePage()
	{
		PageFactory.initElements(dr, this);
	}
	
	
	
	public void swtch()
	{
		dr.switchTo().frame("rightMenu");
	}
	public boolean PIMverify(){
		add.click();
     return PIM.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
