package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class DynamicPropertiesPage extends BaseLibrary
{
	public DynamicPropertiesPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement elements;
	public void clickonelement() 
	{
		elements.click();
	}
	
	@FindBy(xpath = "//a[@onclick='changeText(this),dynamicproperties();']")
	private WebElement dynamicproperties;
	public void clickondynamicproperties() 
	{
		dynamicproperties.click();
	}
	@FindBy(xpath = "//button[text()='Color Change']")
	private WebElement colorbutton;
	public void clickoncolorbutton() //throws InterruptedException 
	{
		boolean status=colorbutton.isEnabled();
		System.out.println(status);
		String s1=colorbutton.getAttribute("style");
		System.out.println(s1);
		 waittimeSec(10);
		//Thread.sleep(7000);
		String s2=colorbutton.getAttribute("style");
		System.out.println(s2);
	}
}
