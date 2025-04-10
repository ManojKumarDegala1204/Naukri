package Naukari.Naukariprofileupdate;

import org.testng.annotations.Test;

import java.time.Duration;

import org.testng.Reporter;

public class Resumeprofileupdate extends Baseclass {
	
	@Test(priority=0)
	public void Resumeheadlineupdate() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		login l = new login();
		l.login();
		Profileupdatepage p = new Profileupdatepage(driver);
		p.Clickprofile();
		Reporter.log("Clicked on View Profile", true);
		p.ClickResumeheadlineoption();
		Reporter.log("Clicked on Resume headline", true);
		p.ClickonEditresumeheadlineicon();
		Reporter.log("Clicked on Edit Resume headline", true);
		p.ClickonSaveresumeheadlinebutton();
		Reporter.log("Clicked on Save", true);
	
		Reporter.log("Resume headline updated successfully", true);
	}
	
	@Test(priority=1)
	public void updatekeyskills() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		login l = new login();
//				l.login();
		Profileupdatepage p = new Profileupdatepage(driver);
//		
//		p.Clickprofile();
//		Reporter.log("Clicked on View Profile", true);
		p.ClickKeyskills();
		Reporter.log("Clicked on Keyskills", true);
		p.Editkeyskills();
		Reporter.log("Clicked on Edit Keyskills", true);
		p.Savekeyskills();
		Reporter.log("Clicked on Save Keyskills", true);
		Reporter.log("Keyskills updated successfully", true);
		
	}
	@Test(priority=2)
    public void UpdateITSkills() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    	Profileupdatepage p = new Profileupdatepage(driver);
//    	p.Clickprofile();
//    	Reporter.log("Clicked on View Profile", true);
    	p.ClickonITskillsoption();
    	Reporter.log("Clicked on IT skills", true);
    }
	
}
