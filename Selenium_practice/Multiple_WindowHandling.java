package Selenium_practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_WindowHandling 
{

	public static void main(String[] args) 
	{
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	    String MainWindow = driver.getWindowHandle();
	    WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
	    WebElement Companies = driver.findElement(By.xpath("//div[text()='Companies']"));
	    jobs.click();
	    Companies.click();
	    Set<String> ChildWindows = driver.getWindowHandles(); 
	    Iterator<String> itr = ChildWindows.iterator();
	    while(itr.hasNext())
	    {
	    String ChildWindow = itr.next();
	    if(!MainWindow.equalsIgnoreCase(ChildWindow)) 
	    {  
	    driver.switchTo().window(ChildWindow);
	    System.out.println(driver.getTitle());

	    WebElement Skills = driver.findElement(By.xpath("//input[@name='qp'and @placeholder='Skills, Designations, Companies']"));
	    Skills.sendKeys("selenium Webdriver");
	    WebElement Locality =driver.findElement(By.xpath("//input[@name='ql'and @placeholder='Location/Locality']"));
	    Locality.sendKeys("Pune");
	    WebElement SerachBtn = driver.findElement(By.xpath("//button[@class='qsbSrch blueBtn'and@type='submit']"));
	    SerachBtn.click();
	         }
	    }
	    //WebElement AdvanceSearch =driver.findElement(By.xpath("//a[text()='Advanced Search']"));
	    //AdvanceSearch.click();
	driver.switchTo().window(MainWindow);
	driver.close();
	//driver.quit();
	    
	    
	}

}
