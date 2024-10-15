package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Browser_windowspage;
import page.Nested_framepage;
import page.Radiobuttonpage;

public class Nested_frametest extends Base_library
{
	  Nested_framepage bs;
	  @BeforeTest
	  @Parameters("browser")
		public void launchurl(String browser) 
		{
			getlaunch(browser);
			bs= new Nested_framepage ();
		}
	   @Test(priority = 1)
	   public void clickon_alertandwindowstest()
		 {
			 bs.clickon_alertandwindows();
		 }
	   @Test(priority = 2)
	   public void clickonnestedframetest()
		 {
			 bs.clickonnestedframe();
		 }	
	   @Test(priority = 3)
	   public void clickonhereTEST () throws InterruptedException
		 {
			 bs.clickon_here();
		 }	
	
	
}
