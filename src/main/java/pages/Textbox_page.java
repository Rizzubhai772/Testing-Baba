package pages;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import baseLibrary.BaseLibrary;

public class Textbox_page extends BaseLibrary
{
	String path="C:\\Users\\Swara\\eclipse-workspace\\selenium_testing_baba\\Exceldata\\Excelsheetdata.xlsx";
	public Textbox_page()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath="//*[text()='text box']")
	private WebElement textbox;
	@FindBy(xpath="//*[@id='fullname1']")
	private WebElement fullname;
	@FindBy(xpath="//*[@id='fullemail1']")
	private WebElement fullemail;
	@FindBy(xpath="//*[@id='fulladdresh1']")
	private WebElement fulladdress;
	@FindBy(xpath="//*[@id='paddresh1']")
	private WebElement paddresh1;
	@FindBy(xpath="//*[@onclick='return validateform()']")
	private WebElement submitbutton;
	
	
	public void clickonElement()
	{
		element.click();
	}
	public void clickontextbox()
	{
		textbox.click();
	}
	public void filldetials()
	{
		fullname.sendKeys(getReaddata(path, 0, 1, 0));
		fullemail.sendKeys(getReaddata(path, 0,1 , 1));
		fulladdress.sendKeys(getReaddata(path, 0, 1, 2));
		paddresh1.sendKeys(getReaddata(path, 0, 1, 3));
	}
	public void clickonsubmit()
	{
		submitbutton.click();
	}
	
	public void getdetails()
	{
		String out="";
		List<WebElement>list=driver.findElements(By.xpath("//*[@class=\"col-md-6 mt-5\"]/label"));
		for(int i=1;i<=list.size()-1;i++)
		{
			 out=list.get(i).getText();
			System.out.println(out);
			i++;
		}
		
	}
}
