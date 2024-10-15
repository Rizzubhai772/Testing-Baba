package test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.Base_library;
import page.Alerts_page;
import page.Browser_windowspage;

public class Alerst_test extends Base_library
{ 
	Alerts_page ap;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) 
	{
		getlaunch(browser);
		ap= new Alerts_page();
	}
	
	@Test(priority = 1)
	
	 public void clickon_alertandwindowstest()
	 {
		ap.clickon_alertandwindows(); 
	 }
	@Test(priority = 2)
	 public void clickonAlertstest()
	 {
		 ap.clickonAlerts();
	 }
	@Test(priority = 3)
	 public void clickonSeealerttest()
	 {
		ap.clickonSeealert(); 
		 
	 }
	@Test(priority = 4)
	 public void Clickafter5sectest() 
	 {
		 ap.Clickafter5sec();
	 }
	@Test(priority = 5)
	 public void confirm_boxtest()
	 {
		  ap.confirm_box();
	 }
	@Test(priority = 6)
	 public void clickon_promptboxtest6()
	 {
		 ap.clickon_promptbox();
	 }
	
	 
}
