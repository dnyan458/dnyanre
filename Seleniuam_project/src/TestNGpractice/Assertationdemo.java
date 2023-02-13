package TestNGpractice;

import static org.testng.Assert.assertEquals;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assertationdemo 
{
	WebDriver driver;
	@Test
	@Parameters({"lounch"})
	public void selectb(String lounch) 
	{ 
	  if(lounch.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	   driver =new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  String Expectedtitle = "Kite - Zerodha's fast and elegant flagship trading ptform";
	  String  ActalTitle= driver.getTitle();
	  Assert.assertEquals(ActalTitle, Expectedtitle);
	  WebElement logokite = driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
	  Assert.assertTrue(logokite.isDisplayed());
	  }
	  else if(lounch.equalsIgnoreCase("edge"))
	  {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\msedgedriver.exe");
        driver =new EdgeDriver();
	  driver.get("https://facebook.com");
	  String Expectedtitle = "log in or sign up";
	  String  ActalTitle= driver.getTitle();
	  Assert.assertEquals(ActalTitle, Expectedtitle);

}
}

}
