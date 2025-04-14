package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

		
		public WebDriver driver;
		
		//@SuppressWarnings("deprecation")
		public WebDriver initializeDriver() throws IOException
		{
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\sanga\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		 String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome"))
			{
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanga\\eclipse-workspace\\E2EProject\\chromedriver.exe" );
				driver = new ChromeDriver();
			}
			
			else if(browserName.equals("firefox"))
			{
				//code
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			return driver;
		}
		
		public String getScreenShotPath(String testcasename, WebDriver driver) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
			FileUtils.copyFile(source, new File(destination));
			return destination;
			}

		}
		


