package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class BrowserWindowPage extends BaseLibrary
{
	public  BrowserWindowPage()
	{
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//*[@data-target='#alerts']")
	private WebElement alertframe;
	@FindBy(xpath = "//*[text()='browser windows']")
	private WebElement browerwindowbutton;
	@FindBy(xpath = "//*[@href='https://www.google.co.in/']")
	private WebElement newtab;
	@FindBy(xpath = "//*[text()='New Window']")
	private WebElement newWindow;
	@FindBy(xpath = "//*[text()='New Window Message']")
	private WebElement newWinMassage;	
	
	public void alertbutton()
	{
		waitTime(alertframe);
		alertframe.click();
		
	}
	public void browerwinbutton()
	{
		browerwindowbutton.click();
	}
	public void newtab() 
	{
		newtab.click();	
		switchToTab(1);
		driver.close();
		switchToTab(0);
	}
	public void newWindow()
	{
		newWindow.click();
		switchToTab(1);
		driver.close();
		switchToTab(0);
	}
	public void newWinMassage() 
	{
		newWinMassage.click();
		switchToTab(1);
		driver.close();
		switchToTab(0);
		
	}
	
}
