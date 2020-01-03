package Intialization;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orange.base.TestBase;
import com.orange.qa.pages.LoginPagee;

public class LoginnPageTest extends TestBase{
	LoginPagee lgnpge;
	TestBase tb;
	
	@BeforeTest
	public void setup()
	{
		tb = new TestBase();
		tb.intialisation();
	}
	@Test(priority = 1)
	public void loginVerifyUN()
	{
		lgnpge = new LoginPagee();
		lgnpge.verifyUN();
		
	}
	@Test(priority = 2)
	public void loginverifyPWD()
	{
		lgnpge.verifyPWD();
	}
	@Test(priority = 3)
	public void loginSubmit()
	{
		lgnpge.submit();
	}
	@Test(priority = 4)
	public void verifyClear()
	{
		lgnpge.clear();
	}
	@AfterTest
	public void quit()
	{
		dr.quit();
	}
	
	
	
}
