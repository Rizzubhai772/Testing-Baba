package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Base_library;

public class Tooltip_page extends Base_library
{
	   public Tooltip_page()
	   {
		   PageFactory.initElements(driver,this);
	   }
	@FindBy(xpath="//*[@data-target=\"#widget\"]")
	public WebElement widgets;
	@FindBy(xpath="//*[@href=\"#tab_22\"]")
	public WebElement tooltips;
	@FindBy(xpath="//*[@data-toggle=\"tooltip\"]" )
	public WebElement tooltiptitle;
	
	public void clickonWIDGET()
	{
		waitforclick(widgets);
	}
	public void clickonTOOLtip()
	{
		 tooltips.click();
	}
	 public void tooltiptitle() throws IOException
	 {    SoftAssert sf= new SoftAssert();
		String actual= tooltiptitle.getAttribute("title");
		System.out.println(actual);
		String 	expected= getreddat("title");// properties file
		sf.assertEquals(actual, expected);
		sf.assertAll();
	 }
	
	
	

}
