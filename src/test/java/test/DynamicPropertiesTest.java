package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.DynamicPropertiesPage;

public class DynamicPropertiesTest extends BaseLibrary
{
	DynamicPropertiesPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new DynamicPropertiesPage();
	}
	@Test(priority = 1)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 2)
	public void clickondynamicproperties()
	{
		ob.clickondynamicproperties();
	}
	@Test(priority = 3)
	public void clickoncolorbutton() //sthrows InterruptedException
	{
		ob.clickoncolorbutton();
	}
	
}
