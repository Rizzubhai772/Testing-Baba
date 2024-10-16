package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class ToolTipPage extends BaseLibrary
{
	public ToolTipPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement wedgits;
	
	@FindBy(xpath = "//*[text()='tool tips']")
	private WebElement tooltip;
	
	@FindBy(xpath = "//*[@data-toggle='tooltip']")
	private WebElement hoverbutton;
	
	@FindBy(xpath = "//*[@data-placement='bottom']")
	private WebElement hovertextbox;
	
	
	public void clickonwedgits() 
	{
		wedgits.click(); 	
	}
	public void clickontooltip() 
	{
		tooltip.click(); 	
	}
	public void clickonhoverbutton() throws InterruptedException
	{
		mousehoverClick(hoverbutton);
		String hovertext=hoverbutton.getAttribute("title");
		Thread.sleep(1000);
		System.out.println(hovertext);
	}
	
}
