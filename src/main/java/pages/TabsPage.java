package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseLibrary.BaseLibrary;

public class TabsPage extends BaseLibrary
{
	public TabsPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement wedgits;
	
	@FindBy(xpath = "//*[text()='tabs']")
	private WebElement tabs;
	
	@FindBy(xpath = "//a[@id='home-tab']")
	 private WebElement tab1;
	 @FindBy(xpath = "//div[@id='home']")
	 private WebElement tabtext1;
	 @FindBy(xpath = "//a[@id='profile-tab']")
	 private WebElement tab2;
	 @FindBy(xpath = "//div[@class='tab-pane fade active show'][@id='profile']")
	 private WebElement tabtext2;
	 @FindBy(xpath = "//a[@id='contact-tab']")
	 private WebElement tab3;
	 @FindBy(xpath = "//div[@class='tab-pane fade active show' and @id='contact']")
	 private WebElement tabtext3;
	
	
	public void clickonwedgits() 
	{
		wedgits.click(); 	
	}
	public void clickontabs() 
	{
		tabs.click(); 	
	}
	public void clickontab1() throws InterruptedException 
	{
		tab1.click();
		Thread.sleep(1000);
		String s1=tabtext1.getText();
		System.out.println(s1);
		System.out.println("--------------------------------------------------");
		
		tab2.click();
		Thread.sleep(1000);
		String s2=tabtext2.getText();
		System.out.println(s2);
		System.out.println("--------------------------------------------------");
		
		tab3.click();
		String s3=tabtext3.getText();
		System.out.println(s3);
	}
	}
