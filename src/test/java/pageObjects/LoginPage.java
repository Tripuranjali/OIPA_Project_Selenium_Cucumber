package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(id="UserId")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(id="next")
	@CacheLookup
	WebElement btnsignin;
	

	
	
	
	public void setusername(String username) {
		
		txtusername.sendKeys(username);		
	}
	public void setpassword(String password) {
		
		txtpassword.sendKeys(password);		
	}
	public void clicksignin() {
		btnsignin.click();		
	}
	


}
