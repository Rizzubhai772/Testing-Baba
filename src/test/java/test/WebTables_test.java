package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.WebTables_page;

public class WebTables_test extends BaseLibrary
{
	WebTables_page ob;
	@Parameters("env")
	@BeforeTest
	public void getluncUrl(String env)
	{
		
		getlaunchurl(getReaddata(env));
		ob=new WebTables_page();
	}
	@Test(priority = 1)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 2)
	public void clickonwebtable() 
	{
		ob.clickonwebtable();
	}
	@Test(priority = 3)
	public void fillDetails() 
	{
		ob.fillDetails();
	}
	@Test(priority = 4)
	public void updateDetails()
	{
		ob.updateDetails();
	}
	
}
