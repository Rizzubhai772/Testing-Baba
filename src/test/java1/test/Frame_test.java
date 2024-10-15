package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.Base_library;
import page.Alerts_page;
import page.Frame_page;
import page.Nested_framepage;

public class Frame_test extends Base_library
{ 
      	Frame_page bs;
      	@BeforeTest
      	@Parameters("browser")
    	public void launchurl(String browser) 
    	{
    		getlaunch(browser);
    		bs= new Frame_page();
    	}
	   @Test(priority = 1)
	   public void clickon_alertandwindowstest()
		 {
			 bs.clickon_alertandwindows();
		 }
	   @Test(priority = 2)
	   public void clickonframe()
		 {
			  bs.clickonframe();
		 }
	   @Test(priority = 3)
		  public void clickframe1()
		  {
			  bs.clickframe1();
		  }
	   @Test(priority = 4)
		  public void clickframe2()
		  {
			  bs.clickframe2();
		  }
 
	   }
