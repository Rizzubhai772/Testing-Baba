package pages;

import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;


public class LoginPage extends BaseLibrary
{
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void getVerifyTitle()
	{
		String title=driver.getTitle();
		System.out.println("Title of the page  "+title);
	}
	
}
