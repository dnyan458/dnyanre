package Selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class htmlunitdriver 
{

	public static void main(String[] args) 
	{
            HtmlUnitDriver driver = new Htmlunitdriver();
          // open demoqa site page  
            driver.get("https://demoqa.com");
        //print title of the page    
            System.out.println("Title of the page is :"+driver.getTitle());
            driver.get("https://demoqa.com/frames");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            String MainWindow = driver.getWindowHandle();
            JavascriptExecutor jse = (JavascriptExecutor)driver;

            int i=Integer.parseInt(jse.executeScript("return window.length;").toString());
            System.out.println("Frames by count is   :"+i);
            List<WebElement> framesnos = driver.findElements(By.tagName("iframe"));
            System.out.println(framesnos.size());
            
            Actions act =new Actions(driver);
            act.sendKeys(Keys.F5).perform();
            //driver.navigate().refresh();
         // jse.executeScript("history.go(0);");
            
           /* driver.switchTo().frame("frame1");
            WebElement frElement =driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
            System.out.println(frElement.getText());
            driver.switchTo().parentFrame();
            driver.switchTo().window(MainWindow);
            driver.switchTo().frame("frame2");
            WebElement frElement1 =driver.findElement(By.xpath("//h1[@id='sampleHeading']"));*/
         // System.out.println(frElement1.getText());
        	String srt =jse.executeScript("return document.documentElement.innerText;").toString();
        	System.out.println(srt);
        	String title =jse.executeScript("return document.title;").toString();
        	System.out.println(title);
            int height=Integer.parseInt(jse.executeScript("return window.innerHeight;").toString());
            System.out.println("Frames height   :"+height);
            int width=Integer.parseInt(jse.executeScript("return window.innerWidth;").toString());
            System.out.println("Frames height   :"+width);
            jse.executeScript("window.resizeTo(2,8);");
         // Dimension size = new Dimension(375, 566);   // driver.manage().window().setSize(size);
        	
        	
        	
        	
          }
        }



