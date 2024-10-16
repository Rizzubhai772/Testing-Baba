package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.LinksPage;

public class LinksTest extends BaseLibrary
{
	LinksPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new LinksPage();
	}
	@Test(priority = 1)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 2)
	public void clickonlinkbutton()
	{
		ob.clickonlinkbutton();
	}
	@Test(priority = 3)
	public void demopage()
	{
		ob.demopage();
	}
	@Test(priority = 4)
	public void clickoncreated()
	{
		ob.clickoncreated();
	}
	@Test(priority = 5)
	public void clickonnocontent()
	{
		ob.clickonnocontent();
	}
	@Test(priority = 6)
	public void clickonmoved()
	{
		ob.clickonmoved();
	}
	@Test(priority = 7)
	public void clickonbedrequest()
	{
		ob.clickonbedrequest();
	}
	@Test(priority = 8)
	public void clickonunauthorized()
	{
		ob.clickonunauthorized();
	}
	@Test(priority = 9)
	public void clickonforbiddon()
	{
		ob.clickonforbiddon();
	}
	@Test(priority = 10)
	public void clickonnotfound()
	{
		ob.clickonnotfound();
	}
	
}
