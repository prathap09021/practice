package Intialization;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orange.base.TestBase;
import com.orange.qa.pages.HomePage;
import com.orange.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	HomePage hm;
	LoginPage lg;
	
	public  HomePageTest()
	{
		super();
	}
	
	
	
	@BeforeTest
	public void Setup()
	{
	
	intialisation();
	}
	@Test(priority = 1)
	public void login()
	{
	LoginPage lg = new LoginPage();
		lg.login(prop.getProperty("userid"), prop.getProperty("password"));
		/*hm = new HomePage();
		
		hm.swtch();
		Boolean bm =hm.PIMverify();
		Assert.assertTrue(bm);*/
	
	}
	
	@Test(priority = 2)
	public void clickAdd()
	{
    
		
		hm.swtch();
		Boolean bm =hm.PIMverify();
		Assert.assertTrue(bm);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
