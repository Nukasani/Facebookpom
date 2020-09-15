package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities 
{
	WebDriver  driver;
	
	public  WebDriver openBrowse()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return(driver);
	}
	public void launchSite(String x)
	{
		driver.get(x);
	}
	public void closeSite()
	{
		driver.close();
	}

}
