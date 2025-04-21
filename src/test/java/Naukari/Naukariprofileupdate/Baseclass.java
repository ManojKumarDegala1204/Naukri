package Naukari.Naukariprofileupdate;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public static WebDriver driver;
	private Logger log;
	//Launch the browser with naukari website
	@BeforeClass	
	public void launchBrowser()  {
		
		//load properties file
		try {
		//	log=LogManager.getLogger(this.getClass().getName());
			log=LogManager.getLogger(Baseclass.class);
		FileInputStream fis = new FileInputStream("C:\\Users\\manoj\\eclipse-workspace\\Naukariprofileupdate\\src\\test\\resources\\config.properties");
	//	FileReader reader = new FileReader("C:\\Users\\manoj\\eclipse-workspace\\Naukariprofileupdate\\src\\test\\resources\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		//get browser and url from properties file
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		log.info("Browser name is: " + browser);
		
		if(browser.equals(browser)) {
			driver = new ChromeDriver();
			log.info("Chrome Browser launched");
		//	Reporter.log("Chrome Browser launched", true);
		}
		else
		{
		//	Reporter.log("Browser not found", true);
			log.info("Browser not found");
		}
		//driver = new ChromeDriver();
		//System.out.println("Browser launched");
		//Reporter.log("Browser launched", true);
		driver.manage().window().maximize();
	//	Reporter.log("Browser maximized", true);
		log.info("Browser maximized");
		driver.get(url);
	//	driver.get("https://www.naukri.com/");
	//	Reporter.log("URL opened", true);
		log.info("URL opened");
		Assert.assertEquals(driver.getCurrentUrl(), url);
	//	Reporter.log("URL verified", true);
		log.info("URL verified");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

		
	
	
	@AfterClass
     public void closeBrowser() {
    	 driver.close();
    	 log.info("Browser closed");
     }
}
