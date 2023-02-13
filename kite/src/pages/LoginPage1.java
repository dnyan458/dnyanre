package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
   WebDriver driver;
 
public LoginPage1(WebDriver driver) {
	// TODO Auto-generated constructor stub
}
public void loginpage(WebDriver driver)
   {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
   }
    //object repository
 
  // By userName =By.xpath("//input[@id='userid']")).sendKeys("XA3844");
  // By password =By.xpath("//input[@id='password']")).sendKeys("1234567");
  // By LoginBtn =By.xpath("//button[@class='button-orange wide']")).click();
//   By ForgotPasswordLink = By.xpath("//a[contains(text(),'Forgot')]");
//   By  LoginPin    =       By.xpath("//input[@id='pin']");
 //  By ContinuePin  =       By.xpath("//button[contains(text(),'Continue')]");
     
   @FindBy(xpath ="//input[@id='userid']")
    WebElement userName;
   @FindBy(xpath ="//input[@id='password']")
    WebElement password;
   @FindBy(xpath ="//button[@class='button-orange wide']")
    WebElement LogonBtn;
   @FindBy(xpath ="//a[contains(text(),'Forgot')]")
    WebElement ForgotPasswordLink;
   @FindBy(xpath ="//input[@id='pin']")
    WebElement LoginPin;
   @FindBy(xpath ="//button[contains(text(),'Continue')]")
   WebElement ContinueBtn;

   public void Clicklogin(String uname ,String pword)
   {
	   userName.sendKeys(uname);
	   password.sendKeys(pword);
	   LogonBtn.click();
   }
   public void ClickForgot()
   {
	   ForgotPasswordLink.click();
   }
   public void  Clickpin(String pin)
   {
	   LoginPin.sendKeys(pin);
	   ContinueBtn.click();
   }
   
  
}