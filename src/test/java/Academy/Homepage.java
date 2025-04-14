package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pageobjects.LoginPage;
import Pageobjects.Logout;
import resources.Base;

public class Homepage extends Base {
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		  driver =initializeDriver();
		  driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) throws IOException
	{
	
	
	

	  LoginPage lp = new LoginPage(driver);
	  lp.Username().sendKeys(username);
	  lp.Password().sendKeys(password);
	  lp.SubmitButton().click();
	  
	  Logout lo= new Logout(driver);
	  
	  lo.logoutButton().click();
	  
	

	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "student";
		data[0][1] = "Password123";
		data[1][0] = "student";
		data[1][1] = "Password123";
		
		return data;
		
	}
	
	@AfterTest
	public void teardown()
	{
		  driver.close();
	}
}
