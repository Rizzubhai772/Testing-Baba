package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class CheckBox_page extends BaseLibrary
{
	public CheckBox_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//*[text()='check box']")
	private WebElement checkBox;
	@FindBy(xpath = "//*[@src='Checkbox.html']")
	private WebElement frame;
	@FindBy(xpath = "//*[text()='You are selected Mobile']")
	private WebElement mobilecheckboxtext;
	@FindBy(xpath = "//*[@onclick='myFunction()']")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath = "//*[text()='You are Selected Laptop']")
	private WebElement laptopcheckboxtext;
	@FindBy(xpath = "//*[@onclick='myFunction1()']")
	private WebElement laptopcheckbox;
	

	@FindBy(xpath = "//*[text()='You are Selected Desktop']")
	private WebElement desktopcheckboxtext;
	@FindBy(xpath = "//*[@onclick='myFunction2()']")
	private WebElement desktopcheckbox;
	
	public void clickonelement()
	{
		waitTime(element);
		element.click();
	}
	public void clickoncheckBox()
	{
		checkBox.click();
	}
	public void mobilecheckbox()
	{
		driver.switchTo().frame(frame);
		mobilecheckbox.click();
		String actual=mobilecheckboxtext.getText();
		Assert.assertEquals(getReaddata("mobtext"), actual);
		driver.switchTo().defaultContent();
	}
	public void laptopcheckbox() {

		driver.switchTo().frame(frame);
		laptopcheckbox.click();
		String actual1= laptopcheckboxtext.getText();
		Assert.assertEquals(getReaddata("laptext"), actual1);
		driver.switchTo().defaultContent();
	}
	public void desktopcheckbox()
	{
		driver.switchTo().frame(frame);
		desktopcheckbox.click();
		String actual2=desktopcheckboxtext.getText();
		Assert.assertEquals(getReaddata("destop"), actual2);
		driver.switchTo().defaultContent();
	}
}
