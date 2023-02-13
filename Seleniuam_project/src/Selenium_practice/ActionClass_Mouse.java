package Selenium_practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Mouse 
{

	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		WebElement DragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement DroopHere =driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
	    WebElement Intractions = driver.findElement(By.xpath("//div[text()='Interactions']"));
	    act.moveToElement(Intractions);
		act.dragAndDrop(DragMe, DroopHere).perform();
		//act.dragAndDrop(DragMe, DroopHere).build().perform();
		Thread.sleep(5000);
		driver.get("https://demoqa.com/buttons");
		WebElement DoubleclikBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightclickBtn  =driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement Dynamicclickbtn =driver.findElement(By.xpath("//button[text()='Click Me']"));
	    WebElement icon  = driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		act.doubleClick(DoubleclikBtn).perform();
		act.contextClick(RightclickBtn).perform();
		act.click(Dynamicclickbtn).perform();
		act.moveToElement(icon).perform();
		WebElement Bookstore = driver.findElement(By.xpath("//div[text()='Book Store Application']"));
		act.moveToElement(Bookstore).perform();
		driver.get("https://naukri.com/");
		WebElement Foremployee = driver.findElement(By.xpath("//div[text()='For employers']"));
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		act.moveToElement(Foremployee).perform();
		act.moveToElement(jobs).perform();
		WebElement Remotjobs = driver.findElement(By.xpath("//a[text()='Remote jobs']"));
		act.moveToElement(Remotjobs).click().perform();
	}		
}