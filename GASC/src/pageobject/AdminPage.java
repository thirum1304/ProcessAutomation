package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage{
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[3]/a/span")
	public static WebElement Settings;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[4]/a/span")
	public static WebElement Banner;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[5]/a/span")
	public static WebElement Cms;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[6]/a/span")
	public static WebElement Announcement;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[7]/a/span")
	public static WebElement Principal;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[8]/a/span")
	public static WebElement Faculty;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[9]/a/span")
	public static WebElement Department;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[10]/a/span")
	public static WebElement Courses;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[11]/a/span")
	public static WebElement Events;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[12]/a/span")
	public static WebElement Gallery;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[13]/a/span")
	public static WebElement Testimonials;
	
}
