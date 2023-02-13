package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserttest 
{  WebDriver driver;
	@Test
     public void chromeTest() 
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	   driver =new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  String Expectedtitle = "Kite - Zerodha's fast and elegant flagship trading Platform";
	  String  ActalTitle= driver.getTitle();
	  SoftAssert sassrt =new SoftAssert();
	  sassrt.assertEquals(ActalTitle, Expectedtitle);
	 
	 // Assert.assertEquals(ActalTitle, Expectedtitle);
	  WebElement logokite = driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
	  sassrt.assertTrue(logokite.isDisplayed());
	  System.out.println(logokite.isDisplayed());
	  //sassrt.assertAll();
	  }
	  @Test
	  public void edgeTest()
	  {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\msedgedriver.exe");
      driver =new EdgeDriver();
	  driver.get("https://facebook.com");
	  String Expectedtitle = "Facebook – log in or sign up";
	  String  ActalTitle= driver.getTitle();
	  Assert.assertEquals(ActalTitle, Expectedtitle);
     }


}
