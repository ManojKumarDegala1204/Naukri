package Naukari.Naukariprofileupdate;

import org.testng.annotations.Test;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;

public class Resumeprofileupdate extends Baseclass {
	private Logger log;
	@Test(priority=0)
	public void Resumeheadlineupdate() {
		log=LogManager.getLogger(this.getClass().getName());
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		login l = new login();
		l.login();
		Profileupdatepage p = new Profileupdatepage(driver);
		p.Clickprofile();
		log.info("Clicked on View Profile");
		//Reporter.log("Clicked on View Profile", true);
		p.ClickResumeheadlineoption();
		log.info("Clicked on Resume headline");
	//	Reporter.log("Clicked on Resume headline", true);
		p.ClickonEditresumeheadlineicon();
		log.info("Clicked on Edit Resume headline");
		p.ClickonResumeheadlineform();
		log.info("clicked on form to edit resume headline");
	//	Reporter.log("Clicked on Edit Resume headline", true);
		p.ClickonSaveresumeheadlinebutton();
		log.info("Clicked on Save");
	//	Reporter.log("Clicked on Save", true);
		log.info("Resume headline updated successfully");
		p.Recordsuccessmsgforresumeheadline();
	//	log.info(p.Successmessageforresumeheadline.getText());
		
		
	
		
	//	Reporter.log("Resume headline updated successfully", true);
	}
	
	@Test(priority=1)
	public void updatekeyskills() {
		log=LogManager.getLogger(this.getClass().getName());
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		login l = new login();
//				l.login();
		Profileupdatepage p = new Profileupdatepage(driver);
//		
//		p.Clickprofile();
//		Reporter.log("Clicked on View Profile", true);
		p.ClickKeyskillsoption();
		log.info("Clicked on Keyskillsoption");
//		Reporter.log("Clicked on Keyskills", true);
		p.Editkeyskills();
		log.info("Clicked on Edit Keyskills");
		p.ClickonKeyskillsform();
		log.info("Clicked on form to edit keyskills");
//		Reporter.log("Clicked on Edit Keyskills", true);
		p.Savekeyskills();
		log.info("Clicked on Save Keyskills");
//		Reporter.log("Clicked on Save Keyskills", true);
		log.info("Keyskills updated successfully");
//		Reporter.log("Keyskills updated successfully", true);
		p.Recordsuccessmsgforkeyskills();
//		log.info(p.Successmessageforkeyskills.getText());
		
	}
	@Test(priority=2)
    public void UpdateITSkills() {
		log=LogManager.getLogger(this.getClass().getName());
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    	Profileupdatepage p = new Profileupdatepage(driver);
//    	p.Clickprofile();
//    	Reporter.log("Clicked on View Profile", true);
    	p.ClickonITskillsoption();
    	log.info("Clicked on IT skills");
//    	Reporter.log("Clicked on IT skills", true);
    }
	
}
