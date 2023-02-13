package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Braowser_parameterDemos 
{
  @Test
  @Parameters({"username","password"})
  public void Loadinzerodha(String user, String pass) 
  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://kite.zerodha.com");
	driver.findElement(By.id("userid")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
  }
}
