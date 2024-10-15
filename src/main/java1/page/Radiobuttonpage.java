package page;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Base_library;
public class Radiobuttonpage extends Base_library 
{
   public  Radiobuttonpage()
   {
	   PageFactory.initElements(driver, this);
   }
      @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]")//  click on webelement
       private WebElement element;
      @FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[3]")// click on radio button
      private WebElement radio;
      @FindBy(xpath="//*[@id=\"yes\"]")// click on radio button yes
      private WebElement yes;
      @FindBy(xpath="//*[@id=\"no\"]")// click on radio button no
      private WebElement no;
      @FindBy(xpath="//*[@id=\"impressive\"]")// click on radio button impressive
      private WebElement impressive;
      @FindBy(xpath="//*[text()=\"You have selected no\"]")// click on radio button no  for text location
      private WebElement no_TEXT;
      @FindBy(xpath="//*[text()=\"You have selected yes\"]")// click on radio button yes for text location
      private WebElement yes_text;
      @FindBy(xpath="//*[text()=\"You have selected impressive\"]")// click on radio button impressive text location
      private WebElement impressive_text;
      public void clickonelement()
      {
     	 element.click();
      }
      public void CLICKONradiobutton()
      {
     	  radio.click();
      }
      public void radiobuttonyes() throws IOException
      {   
       SoftAssert sf= new SoftAssert();
    	  yes.click();
         String actual= yes_text.getText(); 
         String expected = getreddat("yes");
         System.out.println(actual);
         sf.assertEquals(actual,expected);
         sf.assertAll();
      }
      public void radiobuttonNO() throws IOException
     
      { SoftAssert sf = new SoftAssert();
    	  no.click();
         String actual= no_TEXT.getText(); 
         String expected= getreddat("no");
         System.out.println(actual);
         sf.assertEquals(actual, expected);
         sf.assertAll();
      }
      public void radiobuttonIMPRESSIVE() throws IOException     
      {   SoftAssert sf = new SoftAssert();
    	  impressive.click();
         String  actual=impressive_text.getText();
         String expected= getreddat("impressive");
         System.out.println(actual);
         sf.assertEquals(actual, expected);
         sf.assertAll();
             
      }
}
 