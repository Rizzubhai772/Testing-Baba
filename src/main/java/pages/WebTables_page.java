package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class WebTables_page extends BaseLibrary
{
	public WebTables_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//*[text()='web tables']")
	private WebElement webtable;
	@FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
	private WebElement frame;
	@FindBy(xpath = "//*[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement name;
	@FindBy(xpath = "//*[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$']")
	private WebElement email;
	@FindBy(xpath = "//*[text()='Save']")
	private WebElement save;
	@FindBy(xpath = "//*[text()='Edit']")
	private List<WebElement> editbutton;
	@FindBy(xpath = "//*[@name='edit_name']")
	private WebElement editnametext;
	@FindBy(xpath = "//*[@name='edit_email']")
	private WebElement editemailtext;
	@FindBy(xpath = "//*[text()='Update']")
	private WebElement updatebutton;
	
	public void clickonelement()
	{
		element.click();
	}
	public void clickonwebtable()
	{
		webtable.click();
	}
	public void fillDetails() 
	{
		String path="C:\\Users\\Swara\\eclipse-workspace\\selenium_testing_baba\\Exceldata\\emp_data.xlsx";
		driver.switchTo().frame(frame);
		for(int i=0;i<=4 ;i++)
		{
			for(int j=0;j<=1;j++)
			{
				name.sendKeys(getReaddata(path, 0, i, j));
				j++;
 				email.sendKeys(getReaddata(path, 0, i, j));
				save.click();
			}
		}
		driver.switchTo().defaultContent();
	}
	public void updateDetails() 
	{
		String path="C:\\Users\\Swara\\eclipse-workspace\\selenium_testing_baba\\Exceldata\\updateemp_data.xlsx";
		driver.switchTo().frame(frame);
		for(WebElement ele:editbutton)
		ele.click();
		for(int i=0;i<=4 ;i++)
		{
			for(int j=0;j<=1;j++)
			{
				driver.findElement(By.xpath("//*[@name='edit_name']")).clear();
				driver.findElement(By.xpath("//*[@name='edit_name']")).sendKeys(getReaddata(path, 0, i, j));
				j++;
				driver.findElement(By.xpath("//*[@name='edit_email']")).clear();
				driver.findElement(By.xpath("//*[@name='edit_email']")).sendKeys(getReaddata(path, 0, i, j));
				updatebutton.click();
			}
		}
		driver.switchTo().defaultContent();
	 }
		
		
	
	

}
