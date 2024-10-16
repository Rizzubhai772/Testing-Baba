package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.NestedFramePage;

public class NestedFrameTest extends BaseLibrary
{
	NestedFramePage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String  env)
	{
		getlaunchurl(getReaddata(env));
		ob=new NestedFramePage();
	}
	@Test(priority = 1)
	public void clickframewindow()
	{
		ob.clickframewindow();
	}
	@Test(priority = 2)
	public void clickonNestedframe()
	{
		ob.clickonNestedframe();
	}
	@Test(priority = 3)
	public void nestedframe()
	{
		ob.nestedframe();
	}
}
