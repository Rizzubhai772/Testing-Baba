package page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Webtables  extends Base_library
{  //  String path ="C:\\Users\\Swara\\eclipse\\AutomationFrame_testingbaba\\testdata\\exceldata.xlsx";
   public Webtables ()
   {
	   PageFactory.initElements(driver, this);
   }

   @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")//  clickon elements
    private WebElement element;
   @FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[4]")// click on web table button impressive
   private WebElement webtable;
   @FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")// select whole webelement  frame for single webelement acces
   private WebElement frame;
   @FindBy(xpath="/html/body/div/form/div[1]/input")// click on name  
   private WebElement name;
   @FindBy(xpath="/html/body/div/form/div[2]/input")// click on email details
   private WebElement email;
   @FindBy(xpath="/html/body/div/form/button")// click on save
   private WebElement save;
   @FindBy(xpath="/html/body/div/table/tbody/tr/td[3]/button[1]")// for edit option 
   private List<WebElement> edit;
   @FindBy(xpath=" //input[@name=\"edit_name\"]")// for edit name
   private WebElement updatename;
   @FindBy(xpath="//*[@name=\"edit_email\"]")// for edit email
   private WebElement updatemail;
   @FindBy(xpath="//*[@class=\"btn btn-info btn-xs btn-update\"]") //for update click
   private WebElement updateclick;
   public void clickonelement()
   {
  	 element.click();
  	 
   }
   public void clckonwebtables()
   {
  	 webtable.click();
   }
   
   public void  fillwebtablesdetail() throws IOException// this use properties utility
   {    driver.switchTo().frame(frame);// first of fall enter the frame using this method
          for (int i =1; i<5; i++)
        {
        	 name.sendKeys(getreadData(1,i,0)); 
        	 email.sendKeys(getreadData(1,i,1)); 
        	  save.click();
		} 
       driver.switchTo().defaultContent(); // need to be exit after fillup data in frame using this method 
   }
   public void updatedetails()
   {    driver.switchTo().frame(frame); 
        int j=1;
   for (int i = 0; i <edit.size(); i++)
   {          
	    edit.get(i).click();
        updatename.clear();
        updatename.sendKeys(getreadData(2, j, 0));
        updatemail.clear();
        updatemail.sendKeys(getreadData(2, j, 1));
        updateclick.click();
        j++;
   }
        driver.switchTo().defaultContent();  
   }
}
