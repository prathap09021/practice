package com.orange.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orange.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy (xpath = "//input[@onclick='returnAdd();']")
	WebElement add;
	@FindBy (xpath = "//h2")
	WebElement PIM;
	@FindBy (xpath = "(//input[@type='button'])[2]")
	WebElement addbutton;
	
	
	
	Alert A;
	public void clickOnAdd()
	{
		
		addbutton.click();	
		
	}
	
	/*public void alert()
	{
		WebDriverWait wait=new WebDriverWait(dr, 60); 
		
		wait.until(ExpectedConditions.alertIsPresent());
		dr.switchTo().alert();
		A.accept();
	}*/
	
	
	
	public  HomePage()
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
