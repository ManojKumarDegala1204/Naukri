package Naukari.Naukariprofileupdate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Loginpage {
	private WebDriver driver;
	private Logger log;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log=LogManager.getLogger(this.getClass().getName());
			// TODO Auto-generated constructor stub
	}
	
	//Web Elements
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement login;
	
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	public WebElement username;
	//input[@placeholder='Enter your password']
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	public WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submitbutton;
	//Actions
	public Loginpage Enterusername() {
		username.sendKeys("manojkumard271991@gmail.com");
		return this;
		
	}
	
	public Loginpage Enterpassword() {
		password.sendKeys("9700653227");
		return this;
		
	}
	
	public Loginpage Clicklogin() {
		login.click();
		return this;
		
	}
	
	public Loginpage Clicksubmit() {
		submitbutton.click();
		return this;
		
	}
	
	public Loginpage verifypageurl() {
		
		try {
			//FileReader 	reader = new FileReader("C:\\Users\\manoj\\eclipse-workspace\\Naukariprofileupdate\\src\\test\\resources\\config.properties");
			FileInputStream fis = new FileInputStream("C:\\Users\\manoj\\eclipse-workspace\\Naukariprofileupdate\\src\\test\\resources\\config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String expectedurlafterlogin = prop.getProperty("expectedurlafterlogin");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.urlToBe(expectedurlafterlogin));
			String actualurl = driver.getCurrentUrl();
			log.info("Actual URL: " + actualurl);
		//	Reporter.log("Actual URL: " + actualurl, true);
			log.info("Login successful");
		//	Reporter.log("Login successful", true);
			Assert.assertEquals(actualurl, expectedurlafterlogin);
		//	log.info(actualurl, expectedurlafterlogin);
			log.info("Expected URL: " + expectedurlafterlogin);
		//	Reporter.log("Expected URL: " + expectedurlafterlogin, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}

}

