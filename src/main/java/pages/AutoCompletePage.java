package pages;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class AutoCompletePage extends BaseLibrary
{
	public AutoCompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement widgets;
	@FindBy(xpath = "//*[text()='auto complete']")
	private WebElement autocomplete;
	@FindBy(xpath = "//*[@class='autocomplete']")
	private WebElement searchbox;
	//@FindBy(xpath = "(//*[@class='embed-responsive-item'])[3]")
	//private WebElement frame;
	
	public void clickonwidget() 
	{
		widgets.click();
	}
	public void clickonautocomplete() 
	{
		autocomplete.click();	
	}
	public void clickonselectcountory() throws InterruptedException
	{
		driver.switchTo().frame("frame");
		/*
		searchbox.sendKeys("in");
		searchbox.sendKeys(Keys.ARROW_DOWN);
		searchbox.sendKeys(Keys.ENTER);
		*/
		searchbox.sendKeys("in");
		int count=0;
		for(int i=0;i<4;i++)
		{
			count++;
			for(int j=0;j<count;j++)
			{
				Thread.sleep(1000);
				searchbox.sendKeys(Keys.ARROW_DOWN);
			}
			Thread.sleep(1000);
			searchbox.sendKeys(Keys.ENTER);
			searchbox.sendKeys(Keys.CLEAR);
			searchbox.sendKeys("in");
		}
		driver.switchTo().defaultContent();
	}

}