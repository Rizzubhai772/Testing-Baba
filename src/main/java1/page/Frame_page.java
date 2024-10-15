package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Frame_page extends Base_library
{

	 public Frame_page()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//button[@data-target=\"#alerts\"]")// click for alert&frame windows
	  public WebElement alerts_windows;
	 @FindBy(xpath="//*[text()='frames']")// click for alert&frame windows
	  public WebElement frameclick;
	 @FindBy(xpath="//*[@style='height:200px;width:400px']")// click for frame1
	  public WebElement frame1;
	 @FindBy(xpath="//*[text()='This is a sample page']")// click for frame1text
	  public WebElement frame1text;
	 @FindBy(xpath="//*[@style='height:80px;width:120px']")// click for frame2
	  public WebElement frame2;
	 @FindBy(xpath="//*[text()='This is a sample page']")// click for frame2 text
	  public WebElement frame2text;
	 public void clickon_alertandwindows()
	 {
		 waitforclick(alerts_windows);
	 }
	 public void clickonframe()
	 {
		 waitforclick(frameclick);
	 }
	  public void clickframe1()
	  {
		  driver.switchTo().frame(frame1);
		  String frame1=  frame1text.getText();
		  System.out.println(frame1);
		  driver.switchTo().defaultContent();
	  }

	  public void clickframe2()
	  {
		  driver.switchTo().frame(frame2);
		  String frame2=  frame2text.getText();
		  System.out.println(frame2);
		  driver.switchTo().defaultContent();
	  }
}
