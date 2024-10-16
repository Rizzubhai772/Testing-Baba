package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class ProgressbarPage extends BaseLibrary
{
	public ProgressbarPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement wedgits;
	
	@FindBy(xpath = "//*[text()='progress bar']")
	private WebElement  progressbar;
	
	@FindBy(xpath = "//*[@class='progress']/div")
	private WebElement progressbarwirth;
	
	@FindBy(xpath = "//*[@onclick='move()']")
	private WebElement  startbutton;
	
	public void clickonwedgits() 
	{
		wedgits.click(); 	
	}
	public void clickonprogressbar() 
	{
		progressbar.click(); 	
	}
	public void clickonstartbutton() throws InterruptedException 
	{
		String s1=progressbarwirth.getAttribute("style");
		System.out.println(s1);
		startbutton.click();
		Thread.sleep(1000);
		String s2=progressbarwirth.getAttribute("style");
		System.out.println(s2);
		
		
	}
}
