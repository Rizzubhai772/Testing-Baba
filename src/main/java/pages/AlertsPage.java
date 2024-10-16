package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class AlertsPage extends BaseLibrary
{
	public AlertsPage()
	{
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@data-target='#alerts']")
	private WebElement alertframe;
	@FindBy(xpath = "//*[text()='alerts']")
	private WebElement alertbutton;
	@FindBy(xpath = "//*[@onclick='myalert()']")
	private WebElement clickme;
	@FindBy(xpath = "//*[@onclick='aftersec5()']")
	private WebElement aftersec;
	@FindBy(xpath = "//*[@onclick='myconfirm()']")
	private WebElement confirmalert;
	@FindBy(xpath = "//*[@onclick='myprompt()']")
	private WebElement mypromptalert;
	
	public void clickonalertframe()
	{
		alertframe.click();
	}
	public void clickmealert()
	{
		alertbutton.click();
	}
	public void clickme()
	{
		waitTime(clickme);
		clickme.click();
		driver.switchTo().alert().accept();
	}
	public void clickonaftersec()
	{
	
		aftersec.click();
		waittimeSec(5);
		driver.switchTo().alert().accept();
	}
	public void clickonconfirm() 
	{
		confirmalert.click();
		//waitTime(confirmalert);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	public void clockonmyprompt() 
	{
		mypromptalert.click();
		//waitTime(mypromptalert);
		driver.switchTo().alert().sendKeys("Dharmendrakumar");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	


}

