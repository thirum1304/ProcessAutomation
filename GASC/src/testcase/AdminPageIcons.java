package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Xls_Reader;
import common.BrowserOpen;
import pageobject.AdminPageIcon;

public class AdminPageIcons extends BrowserOpen{
	@Test
	public static void Adminpageicons()
	{
		PageFactory.initElements(driver, AdminPageIcon.class);
		AdminPageIcon.CMS.click();
		
		AdminPageIcon.add.click();
		
		
		
		Xls_Reader data = new Xls_Reader("C:\\Users\\GatedONTech\\git\\thiru\\GASC\\src\\Worksheet.xls");
		
		String name = data.getCellData("Sheet1", "Name", 1);
		System.out.println(name);
		String data1 = data.getCellData("Sheet1", 1, 1);
		System.out.println(data1);
		
		AdminPageIcon.inputEmail3.sendKeys(name);
		
		AdminPageIcon.content.sendKeys(data.getCellData("Sheet1", "Content", 2));
		AdminPageIcon.order.sendKeys(data.getCellData("Sheet1", "Order", 3));
		AdminPageIcon.sitetitle.sendKeys(data.getCellData("Sheet1", "Site Title", 4));
		AdminPageIcon.MetaDescription.sendKeys(data.getCellData("Sheet1", "Meta Description", 5));
		AdminPageIcon.MetaKeyword.sendKeys(data.getCellData("Sheet1", "Meta Keyword", 6));
		
		AdminPageIcon.button.click();
		
		
		AdminPageIcon.Announcement.click();
		AdminPageIcon.Principal.click();
		AdminPageIcon.Faculty.click();
		AdminPageIcon.Department.click();
		AdminPageIcon.Courses.click();
		AdminPageIcon.Events.click();
		AdminPageIcon.Gallery.click();
		AdminPageIcon.Testimonials.click();
	}
	public static void excelpoi()
	{
		
		
		
		
	}


}
