package test;

import org.openqa.selenium.WebDriver;

import pages.Loginpage;
import utility.Utilities;

public class Tests 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver;
		Utilities u=new Utilities();
		driver=u.openBrowse();
		u.launchSite("https://www.facebook.com/");
		Thread.sleep(5000);
		Loginpage lp=new Loginpage(driver);
		lp.uidFill("9603634253");
		lp.pwdFill("Harsha@_205");
		lp.clickLogin();
		u.closeSite();
		
		
		

	}
}
