package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo 
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
	  @Test(dependsOnMethods = "loaunchbrowser")
	  public void login() 
	  {
	  
	    WebElement usElement= driver.findElement(By.xpath("//input[@id='email']"));
	    WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	    WebElement LoginBTN = driver.findElement(By.xpath("//button[@name='login']"));
	    usElement.sendKeys("chinfre788@gmail.com");
	    Password.sendKeys("2323232ssa");
	    LoginBTN.click();
	  }
	  @Test(dependsOnMethods = "login")
	  public void title() throws InterruptedException
	  {
		  Thread.sleep(2000);
		String ExpectedTitle="Log in to Facebook"; 
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	  }
	  @Test(priority = 1,dependsOnMethods = "login")
	  public void forgot()
	  {
		  WebElement forgotlink = driver.findElement(By.xpath("//div[@id='login_link']//div//a"));
		  forgotlink.click();
	  
	  }
	  @Test(dependsOnMethods = { "forgot","title"})
	  public void teardown()
	  {
		 driver.close();
  }
}
