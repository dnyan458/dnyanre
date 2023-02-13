package Selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Keyboard 
{

	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
	   // driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		act.sendKeys(FullName, "Chinde Dnyaneshwer Mahadev").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Chind4557@gmail.com");
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("panchavti nagar latur ring road latur").perform();
		
		// select the adress
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		//copy the adress
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		//paste the address in  the permanant address text box
		act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		// enter the submit text button
		act.keyDown(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		

		

	}

}
