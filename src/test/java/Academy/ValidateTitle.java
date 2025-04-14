package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.LoginPage;
import Pageobjects.Logout;
import resources.Base;

public class ValidateTitle extends Base {

	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		  driver =initializeDriver();
		  driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	@Test
	public void validatesubtitile() throws IOException
	{


	  LoginPage lp = new LoginPage(driver);
	  lp.Username().sendKeys("student");
	  lp.Password().sendKeys("Password123");
	  lp.SubmitButton().click();
	  
	   Logout lo= new Logout(driver);
	 String subtitle = lo.getTitle().getText();
	 Assert.assertEquals(subtitle, "Logged In Successfully");
	  
	//  lo.logoutButton().click();
	  

	}
	
	@AfterTest
	public void teardown()
	{
		  driver.close();
	}
	
	
}
