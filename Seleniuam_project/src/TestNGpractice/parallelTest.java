package TestNGpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import io.netty.handler.timeout.TimeoutException;

public class parallelTest 
{
	public WebDriver driver;
  @Test(invocationCount = 3, threadPoolSize = 3,  timeOut=5000, description = "this is the chrome browser test ")
  public void chrometest() 
  {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    driver.get("https://facebook.com");
    String  ExpectedTitle="Facebook – log in or sign up";
    String   Actualtitle =driver.getTitle();
    Assert.assertEquals(Actualtitle, ExpectedTitle);
	WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
	userid.sendKeys("chinde566@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("23545676");
	WebElement loginBTN = driver.findElement(By.xpath("//button[@name='login']"));
	loginBTN.click();
	  System.out.println("Thread id" +Thread.currentThread().getId());


//driver.close();
		//driver.quit();

  }
  @Test(timeOut=5000, expectedExceptions = ThreadTimeoutException.class)
  public void edgetest() 
  {
	    System.setProperty("webdriver.edge.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.get("https://facebook.com");
	    String  ExpectedTitle="Facebook – log in or sign up";
	    String   Actualtitle =driver.getTitle();
	    Assert.assertEquals(Actualtitle, ExpectedTitle);
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		userid.sendKeys("chinde566@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("23545676");
		WebElement loginBTN = driver.findElement(By.xpath("//button[@name='login']"));
		loginBTN.click();
     // driver.close();
		//driver.quit();

	  System.out.println("Thread id" +Thread.currentThread().getId());
 
  }
//@AfterClass
//public void afterclass()
//{
	//driver.quit();
	}
//}
