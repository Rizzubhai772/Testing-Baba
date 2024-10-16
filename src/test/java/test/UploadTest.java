package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.UploadPage;

public class UploadTest extends BaseLibrary
{
	UploadPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new UploadPage();
	}
	@Test(priority = 1)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 2)
	public void clickonuploadbutton()
	{
		ob.clickonuploadbutton();
	}
	@Test(priority = 3)
	public void selectfile()
	{
		ob.selectfile();
	}
}
