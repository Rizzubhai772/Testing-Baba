package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Browser_windowspage extends Base_library
{
	 public Browser_windowspage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//button[@data-target=\"#alerts\"]")// click foe alert&frame windows
	  public WebElement alerts_windows;
	 @FindBy(xpath="//*[@href=\"#tab_11\"]")// click for alert&frame windows
	  public WebElement browserwindows ;
	 @FindBy(xpath="//*[@href=\"https://www.google.co.in/\"]")// click for alert&frame windows
	  public WebElement newtab;
	 @FindBy(xpath="//a[text()='New Window']")// click for alert&frame windows
	  public WebElement newwindows ;
	 @FindBy(xpath="//a[text()='New Window Message']")// click for alert&frame windows
	  public WebElement newwindowstab;
	
	 public void clickon_alertandwindows()
	 {
		 waitforclick(alerts_windows);
	 }
	 public void clickonBrowserwindows()
	 {
		 waitforclick(browserwindows);
	 }
	 
	 public void clickon_newtab()
	 {  // switchtonewwindows(0);
		 waitforclick(newtab);
		 switchtonewwindows(0);
	 }
	 public void clickonNEWwindows()
	 {   
		 waitforclick(newwindows);
		 switchtonewwindows(0);
	 }
	 public void clickonNEWwindowstab()
	 {
		 waitforclick(newwindowstab);
		 switchtonewwindows(0);
	 }
	 
	  
	
	
}

