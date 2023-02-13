package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassworddpage
{
	WebDriver driver;
	   public Forgotpassworddpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void loginpage(WebDriver driver)
	   {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	   } 
		  
		@FindBy(xpath ="//label[text()='User ID']//following-sibling::input")
		  WebElement userID;
		@FindBy(xpath ="//label[text()='PAN']//following-sibling::input")
          WebElement pan;
	   
        public void forgotdtails()
        {
        
        userID.sendKeys("235455");
        pan.sendKeys("airpan2r");
}
  
    
}
