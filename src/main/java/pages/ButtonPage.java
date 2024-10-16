package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseLibrary.BaseLibrary;

public class ButtonPage extends BaseLibrary
{
	public ButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//*[text()='buttons']")
	private WebElement button;
	@FindBy(xpath = "//*[@ondblclick=\"doubletext()\"]")
	private WebElement doubleclickbutton;
	@FindBy(xpath = "//*[@oncontextmenu='righttext()']")
	private WebElement rightclickbutton;
	@FindBy(xpath = "//*[@onclick='clicktext()']")
	private WebElement clickme;
	
	public void clickonelement() 
	{
		element.click();
	}
	public void clickonbutton() 
	{
		button.click();
	}
	public void clickondoubleclick() 
	{
		doubleclick(doubleclickbutton);
		//commonjsscript(doubleclickbutton);
	}
	public void clickonrightclick() 
	{
		rightclick(rightclickbutton);
		//commonjsscript(rightclickbutton);
	}
	public void clickonclickme() 
	{
		clickme.click();
		
	}

}
