package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Alerts_page;
import page.Button_page;

public class Button_test extends Base_library
{    Button_page bp;
     @BeforeTest
     @Parameters("browser")
   public void launchurl(String browser) 
{
	getlaunch(browser);
	bp= new Button_page();
}
    @Test(priority = 1)
    public void clickonelements()
    { 
    	bp.clickonelement();
    }
    @Test(priority = 2)
	public void clickonbutton()
	{
		bp.button();
	}
    @Test(priority = 3)
	public void clickondubble() throws IOException
	{
		bp.dubbleclick();
	}
    @Test(priority = 4)
   	public void clickonright() throws IOException
   	{
   		bp.rightclick();
   	}
    @Test(priority = 5)
   	public void clickme() throws IOException
   	{
   		bp.clickme();
   	}
	
	
}
