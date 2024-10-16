package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ProgressbarPage;

public class ProgressbarTest  extends BaseLibrary
{
	ProgressbarPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new ProgressbarPage();
	}
	@Test(priority = 1)
	public void clickonwedgits()
	{
		ob.clickonwedgits();
	}
	@Test(priority = 2)
	public void clickonprogressbar()
	{
		ob.clickonprogressbar();
	}
	@Test(priority = 3)
	public void clickonstartbutton() throws InterruptedException
	{
		ob.clickonstartbutton();
	}
}
