package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class UploadPage2 extends BaseLibrary
{
	String path="C:\\Users\\Swara\\eclipse-workspace\\selenium_testing_baba\\Exceldata\\updateemp_data.xlsx";
	public UploadPage2()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//*[text()='upload and download']")
	private WebElement uploadbutton;
	@FindBy(xpath = "//*[text()='Select a file']")
	private WebElement selectfile;
	
	public void clickonelement() 
	{
		element.click();		
	}
	public void clickonuploadbutton() 
	{
		uploadbutton.click();
	}
	public void selectfile() 
	{
		selectfile.click();
		waitTime(selectfile);
		fileuploading(path);
	}
}
