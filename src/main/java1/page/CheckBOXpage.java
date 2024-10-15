package page;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.Base_library;

public class CheckBOXpage  extends Base_library
{
    public CheckBOXpage()
    {
          PageFactory.initElements(driver, this);
    }      /* if a wen element is located under the that situation we can not directly locate that webelememnt
             in this situation follow three steps----
             1- first of fall create the xpath of frame []
             2- then entre uder the frame where the webelement is store and create the particular webelement xpath
             3-  and after doing both steps comeback to contents
         
	       */
             @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]")// web element click
              private WebElement element;
             @FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[2]")//check box click
  	          private WebElement checkbox;
             @FindBy(xpath="//*[@id=\"myCheck\"]")// select mobile optin
  	          private WebElement mobiletab;
             @FindBy(xpath="//*[@id=\"mylaptop\"]")// select laptop option
  	          private WebElement laptoptab;
             @FindBy(xpath="//*[@id=\"mydesktop\"]")//select destop option
 	          private WebElement destoptab;
             @FindBy(xpath="//*[@id=\"tab_2\"]/div/iframe")// select whole webelement  frame for single webelement acces
	          private WebElement frame;
             @FindBy(xpath="//*[text()='You are selected Mobile']")//selected for mobile text
	          private WebElement mobiletext;
             @FindBy(xpath="//*[@id=\"text1\"]")//selected for laptop text
	          private WebElement laptoptext;
             @FindBy(xpath="//*[@id=\"text2\"]")//selected for  destop text
	          private WebElement destoptext;
             
             public void clickonelement()
             {
            	 element.click();
             }
             public void clickoncheckboxpage()
             {
            	 checkbox.click();
             }
	     public void clickonmobliecheckbox() throws IOException
	     
	    {       SoftAssert sf= new SoftAssert();
	    	    driver.switchTo().frame(frame);
	           mobiletab.click();
	           String expectedresult =mobiletext.getText();
	           System.out.println(expectedresult);
	           String actualresult=getreddat("mobile");
	           driver.switchTo().defaultContent();	 
	           //Assert.assertEquals(actualresult,expectedresult );// hard assertion
	           sf.assertEquals(actualresult, expectedresult);// soft assertion
	           sf.assertAll();
	    }
	  
	     public void clickonlaptopcheckbox() throws IOException
	     {   SoftAssert sf= new SoftAssert();
	    	 driver.switchTo().frame(frame);
	    	 laptoptab.click();
	    	String actual = laptoptext.getText();
	    	System.out.println(actual);
	    	String expected= getreddat("laptop");
	    	 driver.switchTo().defaultContent(); 
	    	 sf.assertEquals(actual, expected);
	    	 sf.assertAll();
	     }
	     public void clickondestopbox() throws IOException
	     {      SoftAssert sf= new SoftAssert();
	    	 driver.switchTo().frame(frame);
	    	 destoptab.click();
	    	   String actual   = destoptext.getText();
	    	   System.out.println(actual);
	    	   String expected= getreddat("desktop");
	    	 driver.switchTo().defaultContent(); 
	    	 sf.assertEquals(actual, expected);
	    	 sf.assertAll();
	     }
	     
	
	
}
