package test;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_library;
import page.Textpage_element;
import page.Webtables;

public class Textpage_elementTest extends Base_library

{   
	Textpage_element ob1;
	 @BeforeTest
	 @Parameters("browser")
		public void launchurl(String browser) 
		{
			getlaunch(browser);
			ob1= new  Textpage_element ();
		}
	   @Test(priority=1)
	   public void fill_textElements()
	   {
		   ob1.element_textboxfilldetails();
	   }
	
	   @Test(priority=2)
	   public void clickonSubmit()
	   {
		ob1.submittext();
	   }
	   /*   @Test(priority=3)
	    public void gettfilldetail()
	   {
		ob1.getfilldetails();
	   }*/
	  
	   @Test(priority = 3)
	   public void  softasservaidation()
	   {
		ob1.softvalidationte();
	   }
	   
	   
	   
}
