package TestNGpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserLaunch 
{
	public WebDriver driver;
  @Test
  @Parameters({"browser"})
  public void select(String browser)
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	   driver =new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\msedgedriver.exe");
          driver =new EdgeDriver();
	  driver.get("https://facebook.com");
  }
	  
	  }  
  }


