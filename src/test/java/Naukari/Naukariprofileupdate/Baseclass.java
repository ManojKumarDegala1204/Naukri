package Naukari.Naukariprofileupdate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public static WebDriver driver;
	
	//Launch the browser with naukari website
	@BeforeClass	
	public void launchBrowser() {
		driver = new ChromeDriver();
		//System.out.println("Browser launched");
		Reporter.log("Browser launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximized", true);
		driver.get("https://www.naukri.com/");
		Reporter.log("URL opened", true);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.naukri.com/");
		
	}
	
	@AfterClass
     public void closeBrowser() {
    	 driver.close();
     }
}
