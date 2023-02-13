package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChildClass extends ParentClass
{
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
}
