package com.orange.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
		public static	Properties prop;
		public static	WebDriver dr;
		
		//public static Alert A;

	
	public TestBase()
	{
		try{
		 prop = new Properties();
		 FileInputStream ip = new FileInputStream("E:\\Raana\\practice\\src\\main\\java\\com\\orange\\qa\\config\\config.properties");
		 prop.load(ip);
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
	}
	
	
	
	 public void intialisation()
	 {
		 
		 
		 String browsername = prop.getProperty("browser");
		 if(browsername.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
				dr = new ChromeDriver(); 
				dr.manage().window().maximize();
				dr.manage().deleteAllCookies();
				dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				dr.get(prop.getProperty("url"));
				

				
		 }
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	

}
