package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class AccordionPage extends BaseLibrary
{
	public AccordionPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement wedgits;
	
	@FindBy(xpath = "//*[text()='accordion']")
	private WebElement accrdion;
	
	@FindBy(xpath = "//*[@data-target='#collapse1']")
	private WebElement paragraph1;
	@FindBy(xpath = "(//*[@class='card-body'])[5]")
	private WebElement paragraph1text;
	
	@FindBy(xpath = "//*[@data-target='#collapse2']")
	private WebElement paragraph2;
	@FindBy(xpath ="(//*[@class='card-body'])[6]")
     private WebElement paragraph2text;
	
	@FindBy(xpath = "//*[@data-target='#collapse3']")
	private WebElement paragraph3;
	@FindBy(xpath = "(//*[@class='card-body'])[7]")
	private WebElement paragraph3text;
	
	public void clickonwedgits() 
	{
		wedgits.click(); 	
	}
	public void clickonaccordion() 
	{
		accrdion.click();	
	}
	public void clickonparagraph1() throws InterruptedException 
	{
		paragraph1.click();
		String text1=paragraph1text.getText();
		System.out.println(text1);	
		System.out.println("--------------------------------------------------");
		Thread.sleep(1000);
	}
	public void clickonparagraph2() throws InterruptedException 
	{
		paragraph2.click();
		String text2=paragraph2text.getText();
		System.out.println(text2);	
		System.out.println("--------------------------------------------------");

		Thread.sleep(1000);
	}
	public void clickonparagraph3() 
	{
		paragraph3.click();
		String text3=paragraph3text.getText();
		System.out.println(text3);	
	}
}
