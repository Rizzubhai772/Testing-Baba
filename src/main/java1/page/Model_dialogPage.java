package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Model_dialogPage extends Base_library
{
	 public Model_dialogPage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//button[@data-target=\"#alerts\"]")// click for alert&frame windows
	  public WebElement alerts_windows;
	 @FindBy(xpath="//*[@onclick=\"changeText(this)\" and  text()='modal dialogs']")// click for model and dialog
	  public WebElement modeldialog;
	 @FindBy(xpath="//*[@data-target=\"#exampleModal1\" and  @data-target=\"#exampleModal1\"]")// click for small dialog
	  public WebElement smallmodel;
	 @FindBy(xpath="//*[@data-target=\"#exampleModal2\"]")// click for large dialog
	  public WebElement largemodel;
	 @FindBy(xpath="//*[@id=\"exampleModal1\"]/div/div/div[3]/button")// click for large dialog
	  public WebElement smallclose;
	 
	 @FindBy(xpath="//*[@id=\"exampleModal2\"]/div/div/div[3]/button")// click forsmall close dialog
	  public WebElement largeclosetext;
 

	  
	 public void clickon_alertandwindows()
	 {
		 alerts_windows.click();
	 }
	public void clickonsmallmodel()
	{
		smallmodel.click();
	}
	public void clickonlargemodel()
	{
		 largemodel.click();
	}

}
