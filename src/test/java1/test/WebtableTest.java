package test;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Loginpage;
import page.Webtables;

public class WebtableTest extends Base_library 
{
	 Webtables op;
	 @BeforeTest
	 @Parameters("browser")
		public void launchurl(String browser) 
		{
			getlaunch(browser);
			op= new Webtables ();
		}
	 @Test(priority = 1)
	  public void clickonelement()
	  {
		  op.clickonelement();
	  }
	 @Test(priority = 2)
	 public void clickonwebtables()
	 {
		 op.clckonwebtables();
	 }
 
	 @Test(priority = 3)
	 public void webtablesdetailswithproperties() throws IOException
	 {
		 op.fillwebtablesdetail();
	 }
	 	 @Test(priority = 4)
	 public void updatedetails()
	 {
		 op.updatedetails();
	 }
}
