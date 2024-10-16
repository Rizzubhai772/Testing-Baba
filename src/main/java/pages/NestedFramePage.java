package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class NestedFramePage extends BaseLibrary
{
	public  NestedFramePage() 
	{
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath = "//*[@data-target='#alerts']")
	private WebElement framewindow;
	@FindBy(xpath = "//*[text()='nested frames']")
	private WebElement nestedframe;
	@FindBy(xpath = "//*[@src='text.html']")
	private WebElement pframe;
	@FindBy(xpath = "//*[text()='Parent']")
	private WebElement ptext;
	@FindBy(xpath = "//*[@src='example.html']")
	private WebElement cframe;
	@FindBy(xpath = "//*[text()='Child']")
	private WebElement ctext;
	@FindBy(xpath = "//*[text()='Click Here']")
	private WebElement clickhere;
	
	
	public void clickframewindow()
	{
		framewindow.click();
	}
	public void clickonNestedframe() 
	{
		nestedframe.click();
	}
	public void nestedframe() 
	{
		try {
		driver.switchTo().frame(pframe);
		driver.switchTo().frame(cframe);
		
		clickhere.click();
		waitTime(clickhere);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
