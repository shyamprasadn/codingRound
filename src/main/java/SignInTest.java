import com.sun.javafx.PlatformUtil;

import codingRound.BaseLaunchTest;
import codingRound.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseLaunchTest{

    //WebDriver driver = new ChromeDriver();

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

        //setDriverPath();

        driver.get("https://www.cleartrip.com/");  // URL can be passed as a parameter to test
        waitFor(2000);

        // we can use wrappers created and reusable methods can be maintained by using Page Objecte model.
        
        driver.findElement(By.linkText("Your trips")).click();  
        driver.findElement(By.id("SignIn")).click();
        waitFor(2000);
        DriverAction.swithToFrame("modal_window"); 
        DriverAction.isElementPresent(By.id("signInButton")); 
        // Or we can use WebDriverWait class to wait until this element is visible.
        WebDriverWait wbw = new WebDriverWait(driver,10);
        wbw.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signInButton"))));
        driver.findElement(By.id("signInButton")).click();

        String errors1 = driver.findElement(By.id("errors1")).getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
        driver.quit();
    }
    
    // This method can be moved to commonUtil class where we can maintain utility methods to use across the scripts.

    private void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

  /*  private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }*/


}
