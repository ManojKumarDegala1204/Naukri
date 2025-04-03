package Naukari.Naukariprofileupdate;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class login extends Baseclass {
	
	//Login to naukari website
	@Test(priority=1)	
	public void login() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));             // wait the driver for 5 seconds 
		Loginpage p = new Loginpage(driver);
		p.Clicklogin().Enterusername().Enterpassword().Clicksubmit();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));       // wait the driver for the url to load
		
		String expectedurl = "https://www.naukri.com/mnjuser/homepage";
		try {
			wait.until(ExpectedConditions.urlToBe(expectedurl));
			String actualurl = driver.getCurrentUrl();
			Reporter.log("Actual URL: " + actualurl, true);
			Reporter.log("Login successful", true);
			Assert.assertEquals(actualurl, expectedurl);
		}

		
		catch (Exception e) {
		
			Reporter.log("Login failed", true);
		}
		
	}

	
}
