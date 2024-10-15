package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Select_menupage;
import page.Textpage_element;

public class Select_menutest extends Base_library 
{
	  Select_menupage sp;
	  @BeforeTest
	  @Parameters("browser") 
		public void launchurl(String browser) 
		{
			getlaunch(browser);
			sp= new Select_menupage ();
		}
    @Test(priority = 1,  groups = {"smoke", "regression"," sanity"})
    public void clickonwidget()
    {
    	sp.clickonwidget();
    }
    @Test(priority = 2 ,  groups = {"smoke", "regression", })
    public void clickonselectmenu()
    {
    	sp.clickonselectmenu();
    }
    @Test(priority = 3 ,  groups = {"regression"," sanity"})
    public void clickonselectvalue()
    {
    	sp.clickonselectvalue();
    }
    @Test(priority = 4 ,  groups = {  "regression"," sanity"})
    public void clickonselectone()
    {
    	sp.clickonselectone();
    }
    @Test(priority = 5 ,  groups = {  "regression"," sanity"})
    public void clickonselectold()
    {
    	sp.clickonselectoldstyle();
    }
    @Test(priority = 6 ,  groups = {  "regression"," sanity"})
    public void clickonseletmultiple()
    {
    	sp.clickonselectmultiple();
    }
}
