package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("Chrome browser to be launched")
	public void chrome_browser_to_be_launched() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		lp = new LoginPage(driver);	   
	    
	}
	

	@When("IE UAT URL to be opened {string}")
	public void ie_UAT_URL_to_be_opened(String url) throws InterruptedException {
		driver.get(url);	    
		Thread.sleep(5000);
	}
	

	@When("Enter Username as {string}")
	public void enter_Username_as(String Username) throws InterruptedException {
		lp.setusername(Username);		
		Thread.sleep(5000);
	    
	}
	
	@When("Enter Password as {string}")
	public void enter_Password_as(String Password) throws InterruptedException {
		lp.setpassword(Password);		
		Thread.sleep(5000);
	    
	}

	@When("Click on Sign in")
	public void click_on_Sign_in() throws InterruptedException {
	    lp.clicksignin();
	    Thread.sleep(10000);
	    
	}

	@Then("Home Page Title to be verified")
	public void page_Title_should_be() {
	   if (driver.getTitle().equals("InsuranceElements")) {
		   Assert.assertTrue(true);
	   }
	   else {
		   Assert.assertTrue(false);
	   }
	   
	}

	@And("Minimize the browser")
	public void minimize_the_browser() {
	    driver.manage().window().maximize();
	    
	}

}
