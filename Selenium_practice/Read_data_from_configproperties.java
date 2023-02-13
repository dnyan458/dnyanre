package Selenium_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_data_from_configproperties 
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream Filesrc = new FileInputStream("C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\config.Properties");
		Properties prop = new Properties();
		prop.load(Filesrc);
		System.setProperty(prop.getProperty("key"),prop.getProperty("driverpath"));
	    WebDriver  driver = new ChromeDriver();
	    driver.get(prop.getProperty("url"));
	    WebElement Userid = driver.findElement(By.id("userid"));
	    Userid.sendKeys(prop.getProperty("username"));
     // how to capture screenshot
	    
     // call take a screenshot interface
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    
	  //call screenshot method for capture a screenshot
	    
	    File Filesrc1 = ts.getScreenshotAs(OutputType.FILE);
	    
     // for a moving that screenshot for  diffrent location use fileutils class copy file method
	    
	    FileUtils.copyFile(Filesrc1, new File("C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Screenshot\\Zerodha.jpeg"));
	    
	    FileUtils.copyFile(Filesrc1, new File("C:\\Users\\Ash\\eclipse-workspace\\Seleniumpro\\Screenshot\\"+timestamp()+".jpeg")); 

	}	
		public static 	String timestamp() 
		{
		
			return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		
		
		
		
		
	}

}
