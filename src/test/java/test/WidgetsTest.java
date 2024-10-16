package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.WidgetsPage;

public class WidgetsTest extends BaseLibrary
{
	WidgetsPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new WidgetsPage();
    }
	@Test(priority = 1)
	public void  clickonwidget()
	{
		ob.clickonwidget();
	}
	@Test(priority = 2)
	public void  clickonselectmenu()
	{
		ob.clickonselectmenu();
	}
	@Test(priority = 3)
	public void  selectvalue()
	{
		ob.selectvalue();
	}
	@Test(priority = 4)
	public void  selectone()
	{
		ob.selectone();
	}
	@Test(priority = 5)
	public void  oldstyle()
	{
		ob.oldstyle();
	}
	@Test(priority = 6)
	public void selectmultivalue()
	{
		ob.selectmultivalue();
	}

}
