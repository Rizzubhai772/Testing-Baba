package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ToolTipPage;

public class ToolTipTest extends BaseLibrary
{
	ToolTipPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new ToolTipPage();
	}
	@Test(priority = 1)
	public void clickonwedgits()
	{
		ob.clickonwedgits();
	}
	@Test(priority = 2)
	public void clickontooltip()
	{
		ob.clickontooltip();
	}
	@Test(priority = 3)
	public void clickonhoverbutton() throws InterruptedException
	{
		ob.clickonhoverbutton();
	}
}
