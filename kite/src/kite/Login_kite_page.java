package kite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Login_kite_page 
{
public static void main(String[] args) throws InterruptedException
{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
	   
	 
	   
      driver.get("https://kite.zerodha.com");
      driver.manage().window().fullscreen();
      driver.getTitle();
      
      driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA3844");
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567");
      driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("678865");
      driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

      driver.findElement(By.xpath("//button[contains(text(),placeholder,'Search')]")).sendKeys("mrf");
      
      WebElement MRF_NSE =driver.findElement(By.xpath("//span[contains(text(),'MRF')]//following-sibling::span[contains(text(),'NSE')]"));
      Actions action = new Actions(driver);
      action.moveToElement(MRF_NSE).build().perform();
      driver.findElement(By.xpath("//button[@class='button-green']")).click();
}
}

