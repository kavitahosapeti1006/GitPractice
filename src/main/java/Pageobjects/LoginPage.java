package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement submit;
	
	public WebElement Username()
	{
		//System.out.println(username);
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}

	public WebElement SubmitButton()
	{
		return submit;
	}
	

}
