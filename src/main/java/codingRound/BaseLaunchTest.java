package codingRound;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.sun.javafx.PlatformUtil;

public class BaseLaunchTest {

	protected static String browser;
	protected static WebDriver driver;
	
	@BeforeSuite
	@Parameters({"browser"}) //suite level parameter , can  be passed through TestNG xml
	public static void initandLaunch(@Optional("chrome")String Browser) throws Exception
	{
		browser = Browser;
		launchBrowser();
	}
	
	
	 private static void setDriverPath() {
	        if (PlatformUtil.isMac()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver");
	        }
	        if (PlatformUtil.isWindows()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        }
	        if (PlatformUtil.isLinux()) {
	            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
	        }
	    }
	 
	public static void launchBrowser() throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			setDriverPath();
			driver = new ChromeDriver();
		}
		
		/*Conditions to implement for other browsers.*/
		
	}
	
	@AfterSuite
	public static void quit() throws Exception
	{
		driver.quit();
	}
}
