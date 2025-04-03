package Naukari.Naukariprofileupdate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
}
