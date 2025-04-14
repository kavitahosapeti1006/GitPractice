package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;
	public Logout(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logout;
	@FindBy(xpath="//h1[@class='post-title']")
	WebElement title;
	
	public WebElement logoutButton()
	{
		return logout;
	}
	
	public WebElement getTitle()
	{
		return title;
	}
	

	
	
}


