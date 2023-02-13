package Selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Argument;

public class JavaScriptExecuter 
{

	public static void main(String[] args) throws InterruptedException 
	{
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Binary\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://demo.guru99.com/V4/index.php");
	      // driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	            /*using when come exception by ravi sir mehtod 
	        *  //Thread.sleep(1000);*/
	       
	       
	       WebElement UserID = driver.findElement(By.xpath("//input[@name='uid']"));
	       WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	       WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
	    // submit.click();
	    // WebElement Reset = driver.findElement(By.xpath("//input[@name='btnReset']"));
	    // Reset.click();
	    
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
	    
	    // passing the costom alert text java script executer
	       jse.executeScript("alert('Welcome to guru99 home page');");
        // Thread.sleep(5000);
           driver.switchTo().alert().accept();
        
	    // passing the value in the text box using java script value method
	       jse.executeScript("arguments[0].value='mngr427933';", UserID);
	       jse.executeScript("arguments[0].value='UdebAja';", password);
	    
	    // UserID.sendKeys( "mngr427933");
	    // password.sendKeys("UdebAja");
	    
	    //2]Click on submit  button or login  or reset using java scriptExecuter method
	       //jse.executeScript("arguments[0].click();",submit);
	       //jse.executeScript("window.scrollBy(0,600);");
	       //WebElement Logut = driver.findElement(By.xpath("//a[text()='Log out']"));
	       //jse.executeScript("arguments[0].scrollIntoView(true);",Logut);
	        Thread.sleep(5000);
	        //driver.get("https://amazon.in/");
	        jse.executeScript("window.location='https://amazon.in';");
	      // WebElement Fundtrasfer = driver.findElement(By.xpath("//a[text()='Withdrawal']"));
	      // jse.executeScript("arguments[0].scrollIntoView(true);",Fundtrasfer);
	       WebElement Help = driver.findElement(By.xpath("//a[text()='Help']"));
	       jse.executeScript("arguments[0].scrollIntoView(true);",Help);
	       jse.executeScript("location.reload();");
 
	       
	     //jse.executeScript("alert('Welcome to guru99 home page');");

	      /*using when come exception by ravi sir mehtod 
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(submit));  */
	    
	    // jse.executeScript("arguments[0].click();",Reset);
	      

	    
	    
	    
	    
	    
	    
 	}
	
}
