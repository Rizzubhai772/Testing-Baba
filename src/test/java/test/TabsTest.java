package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.TabsPage;

public class TabsTest extends BaseLibrary
{
	TabsPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new TabsPage();
	}
	@Test(priority = 1)
	public void clickonwedgits()
	{
		ob.clickonwedgits();
	}
	@Test(priority = 2)
	public void tabs()
	{
		ob.clickontabs();
	}
	@Test(priority = 3)
	public void clickontab1() throws InterruptedException
	{
		ob.clickontab1();
	}
 }
