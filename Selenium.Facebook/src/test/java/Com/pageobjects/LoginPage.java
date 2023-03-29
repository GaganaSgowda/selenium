package Com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver Idriver;
	 public LoginPage (WebDriver rdriver){
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="email")
	WebElement txtemail;
	 
	@FindBy(id="pass")
	WebElement txtpassword;
	
	@FindBy(name="login")
	WebElement txtclick;
	
	public void setemail( String email) {
		txtemail.sendKeys(email);
	}
  public void setpassword(String password) {
	  txtpassword.sendKeys(password);
  }
  public void click() {
	  txtclick.click();
  }
}
