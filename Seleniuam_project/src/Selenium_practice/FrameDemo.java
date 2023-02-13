package Selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo 
{

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/frames");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    String MainWindow = driver.getWindowHandle();
    driver.switchTo().frame("frame1");
    WebElement frElement =driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println(frElement.getText());
    driver.switchTo().parentFrame();
    driver.switchTo().window(MainWindow);
    driver.switchTo().frame("frame2");
    WebElement frElement1 =driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println(frElement1.getText());

    
	}

}
;
