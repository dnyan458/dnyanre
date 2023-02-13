package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{

	   WebDriver driver;
	   public DashboardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void loginpage(WebDriver driver)
	   {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
		  
		  
	   }
	   
  //object repository	   
	   
	   // By searchBox =  By.xpath("//input[contains(placeholder,'Search')]"));
	   // By MRF_NSE   =  By.xpath("//span[contains(text(),'MRF')]//following-sibling:://span[contains(text(),'NSE')]");
	   // By Add_Btn    =  By.xpath("//button[@class='button-green']");
	   // By ProfilBtn =  By.xpath("//span[contains(text(),'XA0306')]");
	   // By  Logout   =  By.xpath("//a[contains(text(),'Logout')]");
	  
	   
	   @FindBy(xpath ="//input[contains(placeholder,'Search')]")
	    WebElement searchBox;
	   @FindBy(xpath ="//span[contains(text(),'MRF')]//following-sibling:://span[contains(text(),'NSE')]")
	    WebElement MRF_NSE;
	   @FindBy(xpath ="//button[@class='button-green']")
	    WebElement Add_Btn;
	   @FindBy(xpath ="//span[contains(text(),'XA0306')]")
	    WebElement ProfilBtntn;
	   @FindBy(xpath ="//a[contains(text(),'Logout')]")
	    WebElement Logout;
	   
	   public void updatewatchlist()
	   {
		   searchBox.sendKeys("MRF");
		   Actions action =new Actions(driver);
		   action.moveToElement(MRF_NSE).build().perform();
		   action.moveToElement((WebElement) MRF_NSE).build().perform();
		   Add_Btn.click();
	   }

	   private Object xpath(String string)
	   {
		   return null;
	   }
	   public void logout()
	   {
		   ProfilBtntn.click();
		   Logout.click();
	   }
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
