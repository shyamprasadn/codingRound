import com.sun.javafx.PlatformUtil;

import codingRound.BaseLaunchTest;
import codingRound.HotelBookingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBookingTest extends BaseLaunchTest{

	HotelBookingPage HBP;
    
    @Test
    public void shouldBeAbleToSearchForHotels() {
       
    	HBP = new HotelBookingPage(driver);
    	HBP.openUrlandClickHotel();
    	HBP.setPlaceandSelectRooms();
    	
        //driver.quit();  this is already covered under afterSuite in BaseLaunch
    }

    
    //setDriverPath is already coverd in base launch Test
    
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
    }
*/
}
