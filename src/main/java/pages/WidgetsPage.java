package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseLibrary.BaseLibrary;

public class WidgetsPage extends BaseLibrary
{
	public WidgetsPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement widgets;
	@FindBy(xpath = "//*[text()='select menu']")
	private WebElement selectmenu;
	
	public void clickonwidget() 
	{
		widgets.click();
	}
	public void clickonselectmenu() 
	{
		selectmenu.click();	
	}
	public void selectvalue() 
	{
		Select sl=new Select(driver.findElement(By.xpath("//*[@id=\"tab_24\"]/form/div/div[1]/select")));
		
		sl.selectByIndex(1);	
	}
	public void selectone() 
	{
		Select sl=new Select(driver.findElement(By.xpath("//*[@id=\"tab_24\"]/form/div/div[2]/select")));
		sl.selectByIndex(1);
	}
	public void oldstyle()
	{
		Select sl=new Select(driver.findElement(By.xpath("//*[@id=\"tab_24\"]/form/div/div[3]/div/select")));
		sl.selectByIndex(1);
	}
	public void selectmultivalue()
	{
		Select sl=new Select(driver.findElement(By.xpath("//*[@id=\"tab_24\"]/form/div/div[5]/div/select/option")));
		sl.selectByValue("CSS");
	}

}
