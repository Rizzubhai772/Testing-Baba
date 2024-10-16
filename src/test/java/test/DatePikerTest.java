package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.DatePikerPage;

public class DatePikerTest extends BaseLibrary
{
	DatePikerPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new DatePikerPage();
	}
	@Test(priority = 1)
	public void clickonwidgets()
	{
		ob.clickonwidgets();
	}
	@Test(priority = 2)
	public  void clickondatepiker()
	{
		ob.clickondatepiker();
	}
	@Test(priority = 3)
	public void getdate () throws InterruptedException 
	{
		ob.getdate();
	}
	@Test(priority = 4)
	public void getcurrentdatetime() throws InterruptedException
	{
		ob.getcurrentdatetime();
	}
}
