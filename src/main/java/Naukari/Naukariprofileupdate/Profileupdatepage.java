package Naukari.Naukariprofileupdate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	public WebElement Resumeheadline;
	
	@FindBy(xpath="//div[@class='card mt15']//div//span[@class='edit icon'][normalize-space()='editOneTheme']")
	public WebElement editresumeheadline;
	
	//@FindBy(xpath="//button[normalize-space()='Save']")
	@FindBy(xpath="//button[@class='btn-dark-ot'][normalize-space()='Save']")
	//@FindBy(xpath="//button[text()='Save']")
	public WebElement Saveresumeheadline;
	
	@FindBy(xpath="//span[@class='text'][normalize-space()='Key skills']")
	public WebElement Keyskills;
	
	@FindBy(xpath="//div[@class='widgetHead typ-16Bold']//span[@class='edit icon'][normalize-space()='editOneTheme']")
	public WebElement editkeyskills;
	
	@FindBy(xpath="//button[@id='saveKeySkills']")
	public WebElement Savekeyskills;
	
	
	

	
	//Actions
	public Profileupdatepage Clickprofile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Viewprofile));
		Viewprofile.click();
		return this;
		
	}
	
	
	public Profileupdatepage ClickResumeheadline() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Resumeheadline));
		Resumeheadline.click();
		return this;
		
	}
	
	public Profileupdatepage Editresumeheadline() {
		editresumeheadline.click();
		return this;
		
	}
	
	public Profileupdatepage Saveresumeheadline() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Saveresumeheadline));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Saveresumeheadline).click().perform();

		Saveresumeheadline.click();
		return this;
	}
	
	public Profileupdatepage ClickKeyskills() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Keyskills));
		Keyskills.click();
		return this;
		
	}
	
	public Profileupdatepage Editkeyskills() {
		editkeyskills.click();
		return this;
		
	}
	
	public Profileupdatepage Savekeyskills() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Savekeyskills));
		Savekeyskills.click();
		return this;
		
	}

}
