package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.Forgotpassworddpage;
import pages.LoginPage1;


public class e2etest 
{
	
  @Test
  
    public void  e2etest() throws InterruptedException
    {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
      driver.get("https://kite.zerodha.com");
      driver.manage().window().maximize();
      driver.getTitle();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      LoginPage1 login = new LoginPage1(driver);
      DashboardPage Dspage = new DashboardPage(driver);
      Forgotpassworddpage fpage = new Forgotpassworddpage(driver);
      login.Clicklogin("XA2436", "1123455");
     // Thread.sleep(5000);
      login.Clickpin("48585");
      // Thread.sleep(5000);
      Dspage.updatewatchlist();
      Dspage.logout();
      login.ClickForgot();
      fpage.forgotdtails();
      
  }
}
