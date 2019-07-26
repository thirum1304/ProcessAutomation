package testcase;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.Xls_Reader;
import pageobject.LoginPage;
import common.BrowserOpen;

public class Login extends BrowserOpen {
	
	
	public static void home() throws IOException
	{
		prop();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String Driverlocation = properties.getProperty("Driverlocation");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Driverlocation);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		}
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//return driver;
				
	}
	
	
		
@BeforeSuite
	public static void log() throws IOException  
	{
		home();
		PageFactory.initElements(driver, LoginPage.class);
		
		LoginPage.username.sendKeys(properties.getProperty("username"));
		LoginPage.password.sendKeys(properties.getProperty("password"));
		LoginPage.captcha.toString();
		LoginPage.SignIn.click();
		
	}




@AfterSuite
public void exit()
{
//	driver.quit();
}



}
