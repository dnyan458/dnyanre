package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import kite.Login_kite_page;
import pages.DashboardPage;
import pages.LoginPage1;

public class LoginLogout 
{
	
@Test

	public void logout()
	{
     
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
    driver.get("https://kite.zerodha.com");
    driver.manage().window().fullscreen();
    driver.getTitle();
   
    LoginPage1 login = new LoginPage1(driver);
	DashboardPage dspage= new DashboardPage(driver);
	
	login.Clicklogin("XA3445", "121344");
	login.Clickpin("1313424");
	dspage.logout();
	 
	}

}
