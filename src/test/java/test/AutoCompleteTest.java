package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.AutoCompletePage;
import pages.WidgetsPage;

public class AutoCompleteTest extends BaseLibrary
{
	AutoCompletePage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new AutoCompletePage();
    }
	@Test(priority = 1)
	public void  clickonwidget()
	{
		ob.clickonwidget();
	}
	@Test(priority = 2)
	public void clickonautocomplete() 
	{
		ob.clickonautocomplete();
	}
	@Test(priority = 3)
	public void clickonselectcountory() throws InterruptedException 
	{
		ob.clickonselectcountory();
	}

}
