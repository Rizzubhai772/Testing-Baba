package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Base_library;

public class Button_page extends Base_library
{  
	   public Button_page()
	   {
		    PageFactory.initElements(driver, this);
	   }
	
	   @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")//  clickon elements
	    private WebElement element;
	   @FindBy(xpath="//a[text()='buttons']")//  clickon buttonpage
	    private WebElement button;
	   @FindBy(xpath="//button[@ ondblclick=\"doubletext()\"]")//  clickon dubbleclick
	    private WebElement doubbleclick;
	   @FindBy(xpath="//button[@id=\"noContextMenu\"]")//  clickon rightclick
	    private WebElement rightclick ;
	   @FindBy(xpath="//button[@onclick=\"clicktext()\"]")//  clickon clickme
	    private WebElement clickme;
	   @FindBy(xpath="//*[@id=\"double-content\"] ")//  clickon doubleclickme text
	    private WebElement doubletext;
	   @FindBy(xpath=" //*[@id=\"right-content\"]")//  clickon rightclickme text
	    private WebElement righttext;
	   @FindBy(xpath="//*[ @id=\"click-content\"  ]")//  clickon clickme text
	    private WebElement clickmetext;
	   
	   public void clickonelement()
	   {
	  	 element.click();
	  	 
	   }
	   public void button()
	   {
		   button.click();
	   }
	   public void dubbleclick() throws IOException
	   {      SoftAssert as = new SoftAssert();
          dubbleclick(doubbleclick);
          String actual= doubletext.getText();
          String expected= getreddat("doubleclick");
          System.out.println(actual);
          as.assertEquals(actual, expected);
          as.assertAll();
	   }
	   
	   public void rightclick() throws IOException
	   {   SoftAssert as = new SoftAssert();
		   rightclick(rightclick);
		   String actual= righttext.getText();
		   String expected= getreddat("rightclick");
		   System.out.println(actual);
		   as.assertEquals(actual, expected);
		    as.assertAll();
	   }
	   public void clickme() throws IOException
	   {   SoftAssert as= new SoftAssert();
		   clickme(clickme);
		   String actual=clickmetext.getText();
		   String expected=getreddat("clickme");
		   System.out.println(actual);
		   as.assertEquals(actual, expected);
		   as.assertAll();
	   }
	    
}
