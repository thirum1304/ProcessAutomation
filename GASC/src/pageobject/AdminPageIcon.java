package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPageIcon {
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[2]/div/div/span")
	public static WebElement CMS;
	
	@FindBy(xpath="//*[@id='form1']/div/div[1]/a/input")
	public static WebElement add;
	
	//Add Form page
	
	@FindBy(xpath="//*[@class='form-horizontal']/div/div/div/input")
	public static WebElement inputEmail3;
	
	@FindBy(xpath="/html/body/p") //insert iframe
	public static WebElement content;
	
	@FindBy(xpath="/html/body/p") //*[@id="inputEmail3"]
	public static WebElement order;
	
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/div/textarea")
	public static WebElement sitetitle;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/div/textarea")
	public static WebElement MetaDescription;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/div/textarea")
	public static WebElement MetaKeyword;
	
	
	
	
	
	
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/button")
	public static WebElement button;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/a/button")
	public static WebElement list;
	
	
	@FindBy(xpath="//*[@id='inputEmail3']") //come outiframe
	public static WebElement number;
	
	
	@FindBy(xpath="//*[@id='form1']/div/div[1]/a/input[1]")
	public static WebElement Activate;
	
	@FindBy(xpath="//*[@id='form1']/div/div[1]/a/input[2]")
	public static WebElement Suspend;
	
	@FindBy(xpath="//*[@id='form1']/div/div[1]/a/input[3]")
	public static WebElement Delete;
	
	
	@FindBy(xpath="//*[@id='form1']/div/table/tbody/tr[1]/td[4]/a[1]/span")
	public static WebElement pencil;
	
	@FindBy(xpath="//*[@id='form1']/div/table/tbody/tr[1]/td[4]/a[2]/span")
	public static WebElement eye;
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[3]/div/div/span")
	public static WebElement Announcement;

	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[4]/div/div/span")
	public static WebElement Principal;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[5]/div/div/span")
	public static WebElement Faculty;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[6]/div/div/span")
	public static WebElement Department;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[7]/div/div/span")
	public static WebElement Courses;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[8]/div/div/span")
	public static WebElement Events;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[9]/div/div/span")
	public static WebElement Gallery;
	
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/a[10]/div/div/span")
	public static WebElement Testimonials;
	
	
}
