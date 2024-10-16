package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.BrowserWindowPage;
import pages.CheckBox_page;
import pages.WebTables_page;

public class BrowserWindowTest extends BaseLibrary
{
	BrowserWindowPage ob;
	@Parameters("env")
	@BeforeTest
	public void getlaunchUrl(String env)
	{
		getlaunchurl(getReaddata(env));
		ob=new BrowserWindowPage();

 }
 @Test(priority = 1)
 public void alertbutton()
 {
	 ob.alertbutton();
 }
 @Test(priority = 2)
 public void browerwinbutton()
 {
	 ob.browerwinbutton();
 }
 @Test(priority = 3)
 public void newtab()
 {
	 ob.newtab();
 }
 @Test(priority = 4)
 public  void newWindow()
 {
	 ob.newWindow();
 }
 @Test(priority = 5)
 public void newWinMassage()
 {
	 ob.newWinMassage();
 }
}
