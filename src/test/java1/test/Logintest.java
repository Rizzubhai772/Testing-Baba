package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Link_page;
import page.Loginpage;

public class Logintest extends Base_library
 {    Loginpage ob; 
 @BeforeTest
 @Parameters("browser")
	public void launchurl(String browser) 
	{
		getlaunch(browser);
		ob= new   Loginpage ();
	}
	@Test(priority=1)
	public void verify_URL()
	{
		ob.verifyURL();
	}
	
	@Test(priority=2)
	public void getverify_title()
	{
		ob.getverify_title();
	}
	
	 
}
