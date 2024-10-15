package page;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.Base_library;

public class Textpage_element extends Base_library
{    String path="C:\\Users\\Swara\\eclipse\\AutomationFrame_testingbaba\\testdata\\exceldata.xlsx";
	 public  Textpage_element()
	 {
		 PageFactory.initElements(driver, this);
		 
	 }    
	       @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]")
	       private WebElement element;// initialized the variable for element
	       @FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[1]")
	       private WebElement text;
	       @FindBy(xpath="//*[@id=\"fullname1\"]")
	       private WebElement name;
	       @FindBy(xpath="//*[@id=\"fullemail1\"]")
	       private WebElement email;
	       @FindBy(xpath="//*[@id=\"fulladdresh1\"]")
	       private WebElement c_addres;
	       @FindBy(xpath="//*[@id=\"paddresh1\"]")
	       private WebElement p_addres;
	       @FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	       private WebElement submit;
	       @FindBy(xpath="//*[@class=\"col-md-6 mt-5\"]/label")
	       private List<WebElement> list;
	   	public void element_textboxfilldetails()
	   	{
	   		element.click();
	   		text.click();
	   		name.sendKeys(getreadData(  0,0,1));
	   		email.sendKeys(getreadData( 0,1,1));
	   		c_addres.sendKeys( getreadData( 0,2,1));
	   		p_addres.sendKeys(getreadData( 0,3,1));
	   	}  
	   	public void submittext()
	   	{
	   		submit.click();
	   	}
	   /*	public void getfilldetails()
	   	{
	   		String out="";
	   		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"tab_1\"]/div/div[2]/label"));
	   		
	   		for (int i = 1; i < list.size(); i=i+2) 
	   		{
				out=list.get(i).getText();
				System.out.println(out
				);
			}
	   		
	   	}*/
	  
	   	/* in validation actually we are doing to match the input data and output data 
	   	validation are two type 
	   	1- hard assert -it is also called assert.its all method is static and 
	   	it terminate tha program if any validation  phase is failed rest of code is not excuted 
	   	2- soft assert- it is also called verify.its all method is dynamic that reason we create this object and 
	   	it is not terminate tha program if any validation  phase is failed rest of code is excuted */
	 
	  public void softvalidationte()
	      
	  {      SoftAssert softasser= new SoftAssert();
		     ArrayList<String> expected= new ArrayList<String>();
	         ArrayList<String> actual= new ArrayList<String>();
	         for (int i = 0; i < expected.size(); i++) 
	         {
	        	 expected.add(getreadData(  0, i, 1)); 
		  
	         }
	         for (int i = 1; i <actual.size(); i=i+2) 
	         {
				actual.add(list.get(i).getText());
			}
	         for (int i = 0; i < expected.size(); i++) 
	         {
				softasser.assertEquals(actual.get(i), expected.get(i));
			}
	          softasser.assertAll();
      }
	  
}
