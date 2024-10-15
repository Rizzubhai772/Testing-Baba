package test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.Base_library;
import page.Tooltip_page;

public class Tooltip_test extends Base_library
{
	Tooltip_page ob;
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) 
	{
		getlaunch(browser);
		ob= new Tooltip_page();
	}	
	@Test(priority = 1)
	public void clickonWIDGET()
	{
		 ob.clickonWIDGET();
	}
	@Test(priority = 2)
	public void clickonTOOLtip()
	{
		  ob.clickonTOOLtip();
	}
	@Test(priority = 3)
	 public void tooltiptitle() throws IOException
	 {  ob.tooltiptitle();
		 
	 }
	
	
	
	
	
	

}
