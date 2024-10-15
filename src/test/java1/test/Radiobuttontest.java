package test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Radiobuttonpage;
import page.Select_menupage;
public class Radiobuttontest extends Base_library
{
	  Radiobuttonpage ob;
	  @BeforeTest
	  @Parameters("browser")
		public void launchurl(String browser) 
		{
			getlaunch(browser);
			ob= new Radiobuttonpage ();
		}
	  @Test(priority = 1)
	  public void clickonelement()
	  {
		  ob.clickonelement();
	  }
	  @Test(priority = 2)
	  public void clickonradiobutton()
	  {
		  ob.CLICKONradiobutton();
	  }
	  @Test(priority = 3)
	  public void clickonyesbutton() throws IOException
	  {
		  ob.radiobuttonyes();
	  }
	  @Test(priority = 4)
	  public void clickonNObutton() throws IOException
	  {
		  ob.radiobuttonNO();
	  }
	  @Test(priority = 5)
	  public void clickonIMPRESSIVEbutton() throws IOException
	  {
		  ob.radiobuttonIMPRESSIVE();
	  }
}
