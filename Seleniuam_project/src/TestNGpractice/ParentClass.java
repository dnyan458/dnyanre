package TestNGpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParentClass
{
	WebDriver driver;
	  @Test
	  public void loaunchbrowser() 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://facebook.com");
		    System.out.println(driver.getTitle());
	  }
}
