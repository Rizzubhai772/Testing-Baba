package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Frame_page;
import page.Model_dialogPage;
import page.Nested_framepage;

public class Modeldialog_test extends Base_library
{
	   Model_dialogPage bs;
	   @BeforeTest
	   @Parameters("browser")
		public void launchurl(String browser) 
		{
			getlaunch(browser);
			bs= new Model_dialogPage();
		}
	   @Test(priority = 1)
	   public void clickon_alertandwindowstest()
		 {
			 bs.clickon_alertandwindows();
		 }
	
	   @Test(priority = 2)
	   public void clickon_smallmodel()
		 {
			 bs.clickonsmallmodel();
		 }
	   @Test(priority = 3)
	   public void clickon_largemodel()
		 {
			 bs.clickonlargemodel();
		 }
	
	
	
}
