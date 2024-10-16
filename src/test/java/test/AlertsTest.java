package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.AlertsPage;
import pages.BrowserWindowPage;

public class AlertsTest extends BaseLibrary
{

	AlertsPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new AlertsPage();
    }
	@Test(priority = 1)
	public void clickonalertbutton()
	{
		ob.clickonalertframe();
	}
	@Test(priority = 2)
	public void clickmealert()
	{
		ob.clickmealert();
	}
	@Test(priority = 3)
	public void clickme()
	{
		ob.clickme();
	}
	@Test(priority = 4)
	public void clickonaftersec() 
	{
		ob.clickonaftersec();
	}
	@Test(priority = 5)
	public void clickonconfirm()
	{
		ob.clickonconfirm();
	}
	@Test(priority =6 )
	public void clockonmyprompt()
	{
		ob.clockonmyprompt();
	}
}
