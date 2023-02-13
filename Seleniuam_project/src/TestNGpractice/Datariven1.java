package TestNGpractice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Datariven1 
{
  @Test(dataProvider = "dp",  dataProviderClass = Datap.class)
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

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "XA5671", "affgfghf" },
      new Object[] { "AS5458", "hjkhkjkjk" },
      new Object[] { "AS5457", "hjkhkjkjr" },
      new Object[] { "AS5468", "hjkhkjkjb" },
      new Object[] { "AS5458", "hjkhkjkjs" },
      new Object[] { "AS5497", "hjkhkjkjy" },

    };
  }
}
