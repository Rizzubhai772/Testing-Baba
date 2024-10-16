package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.Framespage;

public class FramesTest extends BaseLibrary
{
	Framespage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new Framespage();
	}
	@Test(priority = 1)
	public void clickframewindow()
	{
		ob.clickframewindow();
	}
	@Test(priority = 2)
	public void  clickonframe()
	{
		ob.clickcframe();
	}
	@Test(priority = 3)
	public void clickpframe()
	{
		ob.clickpframe();
	}
	@Test(priority = 4)
	public void clickcframe()
	{
		ob.clickcframe();
	}
}
