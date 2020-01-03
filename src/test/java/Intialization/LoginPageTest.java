package Intialization;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orange.base.TestBase;
import com.orange.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
LoginPage verifyLoginpage;

	
	public LoginPageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		intialisation();
		verifyLoginpage = new LoginPage();
	}
	@Test(priority=1)
	public void verifyTitleTest(){
		String title =verifyLoginpage.verifyTitle();
		Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");	
	}
	@Test(priority=2)
	public void verifyUserNameLabelTest(){
		boolean unalabel =verifyLoginpage.verifyUsername();
		Assert.assertTrue(unalabel);	
	}
	@Test(priority=3)
	public void pwdLabelTest(){
	boolean pwd=verifyLoginpage.verifyPWDlabel();
	Assert.assertTrue(pwd);
		
	}
	@Test(priority=4)
	public void submitLabelTest(){
		
		boolean submitLabel = verifyLoginpage.verifySubmitLabel();
		Assert.assertTrue(submitLabel);
		
	}
	@Test(priority=5)
	public void verifyclearTest(){
		
		boolean clearTest =verifyLoginpage.verifyClearLabel();
		Assert.assertTrue(clearTest);
	}
	@Test(priority=6)
	public void login(){
		
		verifyLoginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority=7)
	public void verifyHomepageTitle(){
		String homePageTitle =verifyLoginpage.verifyHomepageTitle();
		Assert.assertEquals(homePageTitle, "OrangeHRM");
		
	}
	@Test(priority=8)
	public void verifyUNTest(){
		String verifyUn =verifyLoginpage.verifyyyUN();
		Assert.assertEquals(verifyUn, "Welcome "+prop.getProperty("userid"));
		
	}
	@Test(priority=9)
	public void Logout(){
		
		verifyLoginpage.logout();
		
	}
	@Test(priority=10)
	public void LogoutTitleTest(){
		String title =verifyLoginpage.verifyTitle();
		Assert.assertEquals(title, "OrangeHRM");	
	}
	
	
	@AfterTest
	public void tear(){
		
		dr.quit();
	}
	
	

	
	
	

}
