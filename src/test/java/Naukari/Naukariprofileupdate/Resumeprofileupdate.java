package Naukari.Naukariprofileupdate;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import java.time.Duration;

public class Resumeprofileupdate extends Baseclass {
	//update the resume headline
	@Test(priority=2)
	public void updateresumeprofile() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		login l = new login();
				l.login();
		Profileupdatepage p = new Profileupdatepage(driver);
		p.Clickprofile().ClickResumeheadline().Editresumeheadline().Saveresumeheadline();
		Reporter.log("Resume headline updated successfully", true);
	}

}
