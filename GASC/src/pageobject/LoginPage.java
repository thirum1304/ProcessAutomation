package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public static WebElement username;
	
	public static WebElement password;
	
	//@FindBy(xpath="/html/body/div/div[2]/form/div[4]/input")
	public static WebElement captcha;
	
	@FindBy(xpath="/html/body/div/div[2]/form/div[5]/div[1]/button")
	public static WebElement SignIn;

}
