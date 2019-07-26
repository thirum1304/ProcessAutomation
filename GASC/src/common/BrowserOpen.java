package common;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;


public class BrowserOpen{
	public static WebDriver driver;
	public static Properties properties;
	
	public static Properties prop() throws IOException
	{
	FileInputStream FileInputStream = new FileInputStream("gasc.properties");
	//BufferedReader BufferedReader = new BufferedReader(FileReader);
	properties= new Properties();
	properties.load(FileInputStream);
	return properties;
			}
	
	
	
	
	
}
