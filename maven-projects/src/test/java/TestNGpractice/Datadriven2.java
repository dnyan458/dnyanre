package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datadriven2 
{
	@Test(dataProvider = "dp")
	  public void  kitelogin(String username, String password) 
	  {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://kite.zerodha.com");
	 WebElement useer =driver.findElement(By.xpath("//input[@id='userid']"));
	 WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
	 WebElement LogBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	 
	 useer.sendKeys(username);
	 pass.sendKeys(password);
	 LogBtn.click();
}

}
