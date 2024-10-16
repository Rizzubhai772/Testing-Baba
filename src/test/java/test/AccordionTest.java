package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.AccordionPage;

public class AccordionTest extends BaseLibrary
{
	AccordionPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new AccordionPage();
	}
	@Test(priority = 1)
	public void clickonwedgits()
	{
		ob.clickonwedgits();
	}
	@Test(priority = 2)
	public void clickonaccordion()
	{
		ob.clickonaccordion();
	}
	@Test(priority = 3)
	public void clickonparagraph1() throws InterruptedException 
	{
		ob.clickonparagraph1();
	}
	@Test(priority = 4)
	public void clickonparagraph2() throws InterruptedException 
	{
		ob.clickonparagraph2();
	}
	@Test(priority = 5)
	public void clickonparagraph3() throws InterruptedException 
	{
		ob.clickonparagraph3();
	}
}
