package TestNGpractice;

import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(Testlistner.class)
public class CrossBrowserTest 
{
	 public WebDriver driver;
  @Test(invocationCount = 3)
  public void login()
  {
	WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
	userid.sendKeys("chinde566@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("23545676");
	WebElement loginBTN = driver.findElement(By.xpath("//button[@name='login']"));
	loginBTN.click();
 }
  @Test
  public void checktitle()
  {
	  String  ExpectedTitle="Facebook – log in or sign Up";
	  String   Actualtitle =driver.getTitle();
	  Assert.assertEquals(Actualtitle, ExpectedTitle);
  }
  @Test
  public void teardown()
  {
	  driver.close();
  }
  

  @Parameters("browser")
  @BeforeClass
  public void  beforeClass(String browser) 
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {	  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();  
		  }
    else if(browser.equalsIgnoreCase("edge"))
  {
	 System.setProperty("webdriver.edge.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\msedgedriver.exe");
	 driver = new EdgeDriver();
  }
	  driver.get("https://www.facebook.com");
	  System.out.println("Thread id" +Thread.currentThread().getId());
  }
}
