package Naukari.Naukariprofileupdate;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Profileupdatepage {
	public WebDriver driver;
	private Logger log;
	
	public Profileupdatepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log=LogManager.getLogger(this.getClass().getName());
		// TODO Auto-generated constructor stub
	}
	
	//Web Elements
	
	@FindBy(xpath="//a[normalize-space()='View profile']")
	public WebElement Viewprofile;
	
	@FindBy(xpath="//span[@class='text'][normalize-space()='Resume headline']")
	public WebElement Resumeheadlineoption;
	
	
	@FindBy(xpath="//div[@class='card mt15']//div//span[@class='edit icon'][normalize-space()='editOneTheme']")
	public WebElement Editresumeheadlineicon;
	
	@FindBy(xpath="//form[@name='resumeHeadlineForm']")
	public WebElement Resumeheadlineform;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Saveresumeheadlineoption;
	
	@FindBy(xpath="//span[@class='text'][normalize-space()='Key skills']")
	
	//@FindBy(xpath="//span[text()='Key skills']")
	public WebElement Keyskills;
	
	@FindBy(xpath="//div[@class='widgetHead typ-16Bold']//span[@class='edit icon'][normalize-space()='editOneTheme']")
	public WebElement Editkeyskills;
	
	@FindBy(xpath="//form[@name='keySkillsForm']")
	public WebElement Keyskillsform;
	
	@FindBy(xpath="//button[@id='saveKeySkills']")
	public WebElement Savekeyskills;
	
	//@FindBy(xpath="//span[@class='text'][normalize-space()='IT skills']")
	
	@FindBy(xpath="//span[text()='IT skills']")
	public WebElement ITskillsoption;
	
	
	@FindBy(xpath="//div[contains(@class, 'success')]//p[contains(text(), 'Key Skills')]")
	public WebElement Successmessageforkeyskills;
	
	@FindBy(xpath="//div[contains(@class, 'success')]//p[contains(text(), 'Resume Headline')]")
	public WebElement Successmessageforresumeheadline;
	
	
	
	//Actions
	public Profileupdatepage Clickprofile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Viewprofile));
		Viewprofile.click();
		return this;
		
	}
	
	
	public Profileupdatepage ClickResumeheadlineoption() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Resumeheadlineoption));
		Resumeheadlineoption.click();
		return this;
		
	}
	
	public Profileupdatepage ClickonEditresumeheadlineicon() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Editresumeheadlineicon));
		Editresumeheadlineicon.click();
		return this;
		
	}
	public Profileupdatepage ClickonResumeheadlineform() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Resumeheadlineform));
		Resumeheadlineform.click();
		return this;
		
	}
	public Profileupdatepage ClickonSaveresumeheadlinebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Saveresumeheadlineoption));
		
		Saveresumeheadlineoption.click();
		return this;
	}
	
//	public Profileupdatepage ClickKeyskillsoption() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.elementToBeClickable(Keyskills));
//		Keyskills.click();
//		return this;
//		
//	}
	
	public Profileupdatepage ClickKeyskillsoption() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Keyskills));
	    
	    // Scroll to element
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	    
	    try { Thread.sleep(500); } catch (InterruptedException e) { /* Handle exception */ }
	    // JavaScript click as fallback
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	    
	    return this;
	}
	
	
//	public Profileupdatepage Editkeyskills() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.elementToBeClickable(Editkeyskills));
//		Editkeyskills.click();
//		return this;
//		
//	}
	
	public Profileupdatepage Editkeyskills() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.elementToBeClickable(Editkeyskills));
	    
	    // Scroll the element into view
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Editkeyskills);
	    
	    // Optional: Wait briefly to allow scroll animation to finish
	    try { Thread.sleep(500); } catch (InterruptedException e) { /* Handle exception */ }
	    
	    Editkeyskills.click();
	    return this;
	}
	
	public Profileupdatepage ClickonKeyskillsform() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Keyskillsform));
		Keyskillsform.click();
		return this;
		
	}
	
	public Profileupdatepage Savekeyskills() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Savekeyskills));
		Savekeyskills.click();
		
		return this;
		
	}
	
	public Profileupdatepage ClickonITskillsoption() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(ITskillsoption));
		ITskillsoption.click();
		return this;
	}
	
	public Profileupdatepage Recordsuccessmsgforkeyskills() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.textToBePresentInElement(Successmessageforkeyskills, "Key Skills have been successfully saved."));
		String Expectedmsg = "Key Skills have been successfully saved.";
		String Actualmsg = Successmessageforkeyskills.getText();
		
		log.info("Success message: " + Actualmsg);
		if (Actualmsg.equals(Expectedmsg)) {
			log.info("Success message is displayed");
		} else {
			log.info("Success message is not displayed");
		}
		return this;	
	}
	
	public Profileupdatepage Recordsuccessmsgforresumeheadline() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.textToBePresentInElement(Successmessageforresumeheadline, "Resume Headline has been successfully saved."));
		String Expectedmsg = "Resume Headline has been successfully saved.";
		String Actualmsg = Successmessageforresumeheadline.getText();
		
		log.info("Success message: " + Actualmsg);
		if (Actualmsg.equals(Expectedmsg)) {
			log.info("Success message is displayed");
		} else {
			log.info("Success message is not displayed");
		}
		return this;
	}
	
}
