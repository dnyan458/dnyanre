package Selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Action_class_HandleDropdown 
{

	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.get("https:demoqa.com/select-menu");
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.in/");
        WebElement voice =driver.findElement(By.xpath("//div[@class='XDyW0e']"));
        voice.click();
	  /*  driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
       WebElement SelectOption = driver.findElement(By.xpath("//div[text()='Select Option']"));
       SelectOption.click();
       WebElement opt1 = driver.findElement(By.xpath("//*[text()='Group 1, option 1']"));
       opt1.click();
       WebElement oldselectmenu = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
       Select oldselectmenu1 = new Select(oldselectmenu);
       //oldselectmenu1.selectByIndex(3);
      // oldselectmenu1.selectByVisibleText("Voilet");
       //oldselectmenu1.selectByValue("3");
       //driver.findElement(By.cssSelector("select#oldSelcetMenu>option:nth-of-type(10)")).click();*/
       
	}

}
