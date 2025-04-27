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
	
		p.ClickResumeheadlineoption();
		log.info("Clicked on Resume headline");
	
		p.ClickonEditresumeheadlineicon();
		log.info("Clicked on Edit Resume headline");
		p.ClickonResumeheadlineform();
		log.info("clicked on form to edit resume headline");

		p.ClickonSaveresumeheadlinebutton();
		log.info("Clicked on Save");

		log.info("Resume headline updated successfully");
		p.Recordsuccessmsgforresumeheadline();
	
		
		
	
		
	
	}
	
	@Test(priority=1)
	public void updatekeyskills() {
		log=LogManager.getLogger(this.getClass().getName());

		Profileupdatepage p = new Profileupdatepage(driver);

		p.ClickKeyskillsoption();
		log.info("Clicked on Keyskillsoption");

		p.Editkeyskills();
		log.info("Clicked on Edit Keyskills");
		p.ClickonKeyskillsform();
		log.info("Clicked on form to edit keyskills");

		p.Savekeyskills();
		log.info("Clicked on Save Keyskills");

		log.info("Keyskills updated successfully");

		p.Recordsuccessmsgforkeyskills();

		
	}
	@Test(priority=2)
    public void UpdateITSkills() {
		log=LogManager.getLogger(this.getClass().getName());


    	Profileupdatepage p = new Profileupdatepage(driver);

    	p.ClickonITskillsoption();
    	log.info("Clicked on IT skills");

    }
	
}
