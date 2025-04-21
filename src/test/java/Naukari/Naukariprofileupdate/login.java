package Naukari.Naukariprofileupdate;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class login extends Baseclass {
	
	private Logger log;
	//Login to naukari website
	@Test	
	public void login() {
		log=LogManager.getLogger(this.getClass().getName());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));             // wait the driver for 5 seconds 
		Loginpage p = new Loginpage(driver);
		log.info("Login to naukari website");
		p.Clicklogin().Enterusername().Enterpassword().Clicksubmit();
		log.info("verify url");
		p.verifypageurl();
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));       // wait the driver for the url to load
//		
//		String expectedurl = "https://www.naukri.com/mnjuser/homepage";
//		try {
//			wait.until(ExpectedConditions.urlToBe(expectedurl));
//			String actualurl = driver.getCurrentUrl();
//			Reporter.log("Actual URL: " + actualurl, true);
//			Reporter.log("Login successful", true);
//			Assert.assertEquals(actualurl, expectedurl);
//			Reporter.log("Expected URL: " + expectedurl, true);
//		}
//
//		
//		catch (Exception e) {
//		
//			Reporter.log("Login failed", true);
//		}
		
	}

	
}
