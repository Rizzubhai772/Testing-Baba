package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Nested_framepage extends Base_library
{
	
	 public Nested_framepage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//button[@data-target=\"#alerts\"]")// click foe alert&frame windows
	  public WebElement alerts_windows;
	 @FindBy(xpath="//*[text()='nested frames']")// click for nestedframe
	  public WebElement nestedframe ;
	 @FindBy(xpath="//*[@src=\"target1.html\"]")// click for frame 1 enter 
	  public WebElement frame1  ;
	 @FindBy(xpath="//*[@src=\"text.html\"]")//  click for frame 2 enter
	  public WebElement frame2  ;
	 @FindBy(xpath="//*[@src=\"example.html\"]")//  click for frame 3 enter
	  public WebElement frame3  ;
	 @FindBy(xpath="//*[@href=\"text1.html\"]")// click here me option
	  public WebElement clickhere;
	 @FindBy(xpath="//*[text()='Hello']")// click here me option
	  public WebElement clickherefortext;
	
	 public void clickon_alertandwindows()
	 {
		 waitforclick(alerts_windows);
	 }

	 public void clickonnestedframe()
	 {
		 waitforclick(nestedframe);
	 }
	 public void clickon_here() throws InterruptedException
	 {   driver.switchTo().frame(frame1);
	     Thread.sleep(1000);
	     driver.switchTo().frame(frame2);
	     Thread.sleep(1000);// hard wait use
	     driver.switchTo().frame(frame3);
	     Thread.sleep(1000);
		 waitforclick(clickhere);
		  String text=clickherefortext.getText();
		 System.out.println(text);
		 driver.switchTo().parentFrame();
		 driver.switchTo().parentFrame();
	 }
	
	 
	 
	 
}
