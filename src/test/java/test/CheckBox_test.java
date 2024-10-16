package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.CheckBox_page;
import pages.Textbox_page;

public class CheckBox_test extends BaseLibrary
{
	CheckBox_page ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new CheckBox_page();
	}
	@Test(priority=1)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority=2)
	public void clickoncheckBox()
	{
		ob.clickoncheckBox();
	}
	@Test(priority=3)
	public void mobilecheckbox()
	{
		ob.mobilecheckbox();
	}
	@Test(priority=4)
	public void laptopcheckbox()
	{
		ob.laptopcheckbox();
	}
	@Test(priority=5)
	public void desktopcheckbox()
	{
		ob.desktopcheckbox();
	}
}
