package Naukari.Naukariprofileupdate;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profileupdatepage {
	public WebDriver driver;
	public Profileupdatepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	//Web Elements
	
	@FindBy(xpath="//a[normalize-space()='View profile']")
	public WebElement Viewprofile;
	
	@FindBy(xpath="//span[@class='text'][normalize-space()='Resume headline']")
	
	public WebElement Resumeheadlineoption;
	
	
	@FindBy(xpath="//div[@class='card mt15']//div//span[@class='edit icon'][normalize-space()='editOneTheme']")
	
	public WebElement Editresumeheadlineicon;
	
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Saveresumeheadlineoption;
	
	@FindBy(xpath="//span[@class='text'][normalize-space()='Key skills']")
	public WebElement Keyskills;
	
	@FindBy(xpath="//div[@class='widgetHead typ-16Bold']//span[@class='edit icon'][normalize-space()='editOneTheme']")
	public WebElement Editkeyskills;
	
	@FindBy(xpath="//button[@id='saveKeySkills']")
	public WebElement Savekeyskills;
	
	@FindBy(xpath="//span[@class='text'][normalize-space()='IT skills']")
	public WebElement ITskillsoption;
	
	

	
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
	
	public Profileupdatepage ClickonSaveresumeheadlinebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Saveresumeheadlineoption));
		Saveresumeheadlineoption.click();
		return this;
	}
	
	public Profileupdatepage ClickKeyskills() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(Keyskills));
		Keyskills.click();
		return this;
		
	}
	
	public Profileupdatepage Editkeyskills() {
		Editkeyskills.click();
		return this;
		
	}
	
	public Profileupdatepage Savekeyskills() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
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

}
