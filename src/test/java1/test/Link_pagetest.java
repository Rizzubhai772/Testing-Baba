package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Alerts_page;
import page.Link_page;

public class Link_pagetest extends Base_library
{   
	Link_page lp;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) 
	{
		getlaunch(browser);
		lp= new  Link_page();
	}

 @Test(priority = 1)
 public void clickonelement()
 {
	 lp.clickonelements();
 }
	
 @Test(priority = 2) 
 public void clickonlink()
 {
	 lp.clickonlink();
 }
 @Test(priority = 3)
 public void clickondemo() throws InterruptedException
 {
	 lp.clickondemopage();
 }
	
	 
}
