package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ButtonPage;

public class ButtonTest extends BaseLibrary
{
	ButtonPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new ButtonPage();
	}
	@Test(priority = 1)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 2)
	public void clickonbutton()
	{
		ob.clickonbutton();
	}
	@Test(priority = 3)
	public void clickondoubleclick()
	{
		ob.clickondoubleclick();
	}
	@Test(priority = 4)
	public void clickonrightclick()
	{
		ob.clickonrightclick();
	}
	@Test(priority = 5)
	public void clickonclickme()
	{
		ob.clickonclickme();
	}


}
