package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Link_page extends Base_library
{
   public Link_page()
   {  
	   PageFactory.initElements(driver,this);
	   
   }
   @FindBy(xpath="//*[@id=\"myModal2\"]/div/div/div[1]/button")//  clickon elements
   private WebElement close;// for pop 

   @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")//  clickon elements
   private WebElement element;
	
   @FindBy(xpath="//a[ text()='links' ]")//  clickon link 
   private WebElement link;
	
   @FindBy(xpath="//a[text()='Demo Page']")//  clickon elements
   private WebElement demopage;
	
	public void clickonelements()
	{    waitforclick(element);// directuse the waitfor click method from  baselibirary
		//element.click();
	}
	
	public void clickonlink()
	{   waitforclick(link);
		//link.click();
	} 
	public void clickondemopage()  
	{    waitforclick(demopage);
		//demopage.click();
	   switchtonewwindows(1);// call the windows switch method for windpws switch and pass 
		// the indexing of windows
	      waitforclick(close);
	     // close.click();
	      driver.close();
	    switchtonewwindows(0);
	}
}
