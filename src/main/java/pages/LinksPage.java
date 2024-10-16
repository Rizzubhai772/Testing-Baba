package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class LinksPage extends BaseLibrary
{
	public LinksPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//*[text()='links']")
	private WebElement linksbutton;
	@FindBy(xpath = "//*[text()='Demo Page']")
	private WebElement demopage;
	@FindBy(xpath = "//*[text()='Created']")
	private WebElement created;
	@FindBy(xpath = "//*[text()='No Content']")
	private WebElement nocontent;
	@FindBy(xpath = "//*[text()='Moved']")
	private WebElement moved;
	@FindBy(xpath = "//*[text()='Bad Request']")
	private WebElement bedrequest;
	@FindBy(xpath = "//*[text()='Unauthorized']")
	private WebElement unauthorized;
	@FindBy(xpath = "//*[text()='Forbidden']")
	private WebElement forbidden;
	@FindBy(xpath = "//*[text()='Not Found']")
	private WebElement notfound;
	
	public void clickonelement()
	{
		element.click();
	}
	public void clickonlinkbutton() 
	{
		linksbutton.click();
	}
	public void demopage() 
	{
		demopage.click();
		switchToTab(1);
		driver.close();
		switchToTab(0);
	}
	public void clickoncreated() 
	{
		created.click();
	}
	public void clickonnocontent() 
	{
		nocontent.click();	
	}
	public void clickonmoved() 
	{
		moved.click();
	}
	public void clickonbedrequest() 
	{
		bedrequest.click();
	}
	public void clickonunauthorized() 
	{
		unauthorized.click();
	}
	public void clickonforbiddon() 
	{
		forbidden.click();	
	}
	public void clickonnotfound() 
	{
		notfound.click();
	}
}
