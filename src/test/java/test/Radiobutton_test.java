package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.CheckBox_page;
import pages.Radiobutton_page;

public class Radiobutton_test extends BaseLibrary
{
	Radiobutton_page ob;
	@Parameters("env")
	
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new Radiobutton_page();
	}
	@Test(priority=1)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority=2)
	public void clickonradiobutton()
	{
		ob.clickonradiobutton();
	}
	
	@Test(priority = 3)
	
	public void clickonyesbutton()
	{
		ob.clickonyesbutton();
	}
	@Test(priority = 4)
	public void clickonimpressivebutton() 
	{
		ob.clickonimpressivebutton();
	}
	@Test(priority = 5)
	public void clickonnobutton()
	{
		ob.clickonnobutton();
	}
	
}
