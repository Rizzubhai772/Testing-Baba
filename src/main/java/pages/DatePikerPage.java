package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class DatePikerPage extends BaseLibrary
{
	public DatePikerPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement widgets;
	@FindBy(xpath = "//*[text()='date picker']")
	private WebElement datepiker;
	@FindBy(xpath = "(//*[@type='date'])[2]")
	private WebElement datetextbox;
	@FindBy(xpath = "//*[@type='datetime-local']")
	private WebElement datetextbox1;
	
	public void clickonwidgets() 
	{
		widgets.click();
	}
	public void clickondatepiker() 
	{
		datepiker.click();
	}
	public void getdate() throws InterruptedException 
	{
		datetextbox.sendKeys(getDate());
		Thread.sleep(2000);
	}
	public void getcurrentdatetime()throws InterruptedException 
	{
		datetextbox1.sendKeys(getDateTime());
		Thread.sleep(2000);
	}
}
