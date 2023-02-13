package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

   public class GroupTest 
  {

   WebDriver driver;
  @Test(priority = 1,groups = {"sanity","regression"})
  public void  launch_chrome() 
  {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://facebook.com");
    System.out.println(driver.getTitle());
  }
  @Test(priority = 2,groups = {"regression"})
  public void check_login() 
  {
  
    WebElement usElement= driver.findElement(By.xpath("//input[@id='email']"));
    WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
    WebElement LoginBTN = driver.findElement(By.xpath("//button[@name='login']"));
    usElement.sendKeys("chinfre788@gmail.com");
    Password.sendKeys("2323232ssa");
    LoginBTN.click();
  }
  @Test(priority =3,groups = {"regression"})
  public void check_Title() throws InterruptedException
  {
	  Thread.sleep(5000);
	String ExpectedTitle="Log in to Facebook"; 
	String ActualTitle  =driver.getTitle();
	Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
  @Test(priority = 4,groups = "sanity")
  public void forgottonpassword()
  {
	  WebElement forgotlink = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	  forgotlink.click();
  
  }
  @Test(priority =5,groups = {"sanity","regression"})
  public void tear_down()
  {
	 driver.close();
  }
}
  
