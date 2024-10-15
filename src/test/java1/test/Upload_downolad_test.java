package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.Base_library;
import page.Upload_downolad_page;
public class Upload_downolad_test extends Base_library
{
	Upload_downolad_page ob;
	@BeforeTest
	@Parameters("browser")
	   public void launchurl(String browser) 
	{
		getlaunch(browser);
		ob= new Upload_downolad_page();
	}
	@Test(priority = 1)
	 public void clickonelement()
    {
   	 ob.clickonelement();
    }
	@Test(priority = 2)
	  public void clickonuploadandownolad()
	  {
		   ob.clickonuploadandownolad();
	  }
	@Test(priority = 3)
	 public void clickonchoosefile() throws InterruptedException
	 {
		 ob.clickonchoosefile();
	 }
	 
	 
}
