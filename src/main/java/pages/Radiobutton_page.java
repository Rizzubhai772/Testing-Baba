package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;



public class Radiobutton_page extends BaseLibrary
{
	public Radiobutton_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//*[text()='radio buttons']")
	private WebElement radiobutton;
	@FindBy(xpath = "(//*[@class=\"form-check-label\"])[1]")
	private WebElement yesbutton;
	@FindBy(xpath = "(//*[@class=\"form-check-label\"])[2]")
	private WebElement impressivebutton;
	@FindBy(xpath = "(//*[@class=\"form-check-label\"])[3]")
	private WebElement nobutton;
	@FindBy(xpath = "//*[text()='You have selected yes']")
	private WebElement yesbuttontext;
	@FindBy(xpath = "//*[text()='You have selected impressive']")
	private WebElement impressivebuttontext;
	@FindBy(xpath = "//*[text()='You have selected no']")
	private WebElement nobuttontext;
	
	public void clickonelement()
	{	//waitTime(element);
		element.click();
	}
	public void clickonradiobutton()
	{
		radiobutton.click();
		
	}
	public void clickonyesbutton() 
	{
		yesbutton.click();
		String actual=yesbuttontext.getText();
		System.out.println(actual);
		Assert.assertEquals(getReaddata("yestext"), actual);	
	}
	public void clickonimpressivebutton()
	{
		impressivebutton.click();
		String actual=impressivebuttontext.getText();
		System.out.println(actual);
		Assert.assertEquals(getReaddata("impressivetext"), actual);
		
	}
	public void clickonnobutton() 
	{
		nobutton.click();
		String actual=nobuttontext.getText();
		System.out.println(actual);
		Assert.assertEquals(getReaddata("notext"), actual);
		
	}
	
}
