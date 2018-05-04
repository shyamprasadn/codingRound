package codingRound;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class DriverAction extends BaseLaunchTest {

	 public static boolean isElementPresent(By by) {
	        try {
	            driver.findElement(by);
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }
	 
	 public static void swithToFrame(String name)
	 {
		 driver.switchTo().frame(name);
	 }
	 /*
	  	we can load the locators from properties file or from enum class or Excel for these wrappers created.
	  	for Example as below.
	  */
	 
	/* public static WebElement getElement( String or Object paramter that is being loaded from enum or properties fiel)
	 {
		return driver.findElement( getlocatortype method that returns what By locator we can use and locator value );
		 
	 }*/
}
