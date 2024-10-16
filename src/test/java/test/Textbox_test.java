package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import baseLibrary.BaseLibrary;
import pages.Textbox_page;

public class Textbox_test extends BaseLibrary
{
	Textbox_page ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new Textbox_page();
	}
	@Test(priority=1)
	public void clickonElement()
	{
		ob.clickonElement();
	}
	@Test(priority=2)
	public void clickontextbox()
	{
		ob.clickontextbox();
	}
	@Test(priority=3)
	public void filldetials()
	{
		ob.filldetials();
	}
	@Test(priority=4)
	public void clickonsubmit()
	{
		ob.clickonsubmit();
	}
	@Test(priority=5)
	public void getdetails()
	{
		ob.getdetails();
	}
}
