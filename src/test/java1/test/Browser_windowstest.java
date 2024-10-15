package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Browser_windowspage;

public class Browser_windowstest  extends Base_library
{
	Browser_windowspage bs;
	@BeforeTest
	@Parameters("browser")
	public void launchurl( String browser) 
	{
		getlaunch(browser);
		bs= new Browser_windowspage();
	}
   
   @Test(priority = 1)
   public void clickon_alertandwindowstest()
	 {
		 bs.clickon_alertandwindows();
	 }
   @Test(priority = 2)
	 public void clickonBrowserwindowstest()
	 {
		 bs.clickonBrowserwindows();
	 }
     @Test(priority = 3)
	 public void clickon_newtabtest()
	 {
		  bs.clickon_newtab();
	 }
     @Test(priority = 4)
	 public void clickonNEWwindowstest()
	 {
		  bs.clickonNEWwindows();
	 }
     @Test(priority = 5)
	 public void clickonNEWwindowstabtest()
	 {
		 bs.clickonNEWwindowstab();
	 }
	 
	  
	
	 
	

}
