package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseLibrary.BaseLibrary;
import pages.LoginPage;

public class Logintest extends BaseLibrary
{
	LoginPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new LoginPage();
	}
	@Test(priority=1)
	public void getverifyTile()
	{
		ob.getVerifyTitle();
	}
	
}
