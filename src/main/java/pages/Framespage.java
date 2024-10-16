package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class Framespage extends BaseLibrary
{
	public Framespage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@data-target='#alerts']")
	private WebElement framewindow;
	@FindBy(xpath = "//*[text()='frames']")
	private WebElement frame;
	@FindBy(xpath = "//*[@style='height:200px;width:400px']")
	private WebElement pframe;
	@FindBy(xpath = "//*[text()='This is a sample page']")
	private WebElement pframetext;
	@FindBy(xpath = "//*[@style='height:80px;width:120px']")
	private WebElement cframe;
	@FindBy(xpath = "//*[text()='This is a sample page']")
	private WebElement cframetext;
	
	public void clickframewindow()
	{
		framewindow.click();
	}
	public void clickonframe()
	{
		frame.click();
	}
	public void clickpframe()
	{
		try {
		driver.switchTo().frame(pframe);
		String ptext=pframetext.getText();
		System.out.println(ptext);
		driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void clickcframe()
	{
		driver.switchTo().frame(cframe);
		String ctext=cframetext.getText();
		System.out.println(ctext);
		driver.switchTo().defaultContent();
	}
}
