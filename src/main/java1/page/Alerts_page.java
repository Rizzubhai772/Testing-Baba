package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Alerts_page extends Base_library
{
     
	public Alerts_page()
	{
		PageFactory.initElements(driver, this);
	}
	  @FindBy(xpath="//button[@data-target=\"#alerts\"]")// click foe alert&frame windows
	  public WebElement alerts_windows;
	  @FindBy(xpath="//a[@href=\"#tab_12\"]")// click foe alert&frame windows
	  public WebElement alerts;
	  @FindBy(xpath= "//*[@onclick=\"myalert()\"]")
	  private WebElement see_alert;
	 @FindBy(xpath ="//*[@onclick=\"aftersec5()\"]")
	  private WebElement clickafter5_sec;
	 @FindBy(xpath = "//*[@onclick=\"myconfirm()\"]")
	 private WebElement confirm_box;
	 @FindBy(xpath = "//*[@onclick=\"myprompt()\"]")
	 private WebElement prompt_box;
	 
	 public void clickon_alertandwindows()
	 {
		 waitforclick(alerts_windows);
	 }
	 public void clickonAlerts()
	 {
		 waitforclick(alerts);
	 }
	 public void clickonSeealert()
	 {
		 waitforclick(see_alert);
		 driver.switchTo().alert().accept();
	 }
	 public void Clickafter5sec()  
	 {     
	       //  waitforclick(clickafter5_sec);
	         clickafter5_sec.click();
	          waitforalert();
		     driver.switchTo().alert().accept();
	 }
	 public void confirm_box()
	 {
		 waitforclick(confirm_box);
		 driver.switchTo().alert().dismiss();
	 }
	 public void clickon_promptbox()
	 {
		waitforclick(prompt_box); 
		driver.switchTo().alert().sendKeys("Rizzubhai");
		driver.switchTo().alert().accept();
	 }
}   
 